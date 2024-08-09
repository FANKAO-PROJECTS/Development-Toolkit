package com.packt.modern.api.hateoas;

import static java.util.stream.Collectors.toList;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import com.packt.modern.api.controller.OrderController;
import com.packt.modern.api.entity.OrderEntity;
import com.packt.modern.api.model.Order;
import com.packt.modern.api.service.ItemService;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter04 - Modern API Development with Spring and Spring Boot Ed 2
 **/
@Component
public class OrderRepresentationModelAssembler extends
    RepresentationModelAssemblerSupport<OrderEntity, Order> {

  private final UserRepresentationModelAssembler uAssembler;
  private final AddressRepresentationModelAssembler aAssembler;
  private final CardRepresentationModelAssembler cAssembler;
  private final ShipmentRepresentationModelAssembler sAssembler;
  private final ItemService itemService;

  /**
   * Creates a new {@link RepresentationModelAssemblerSupport} using the given controller class and
   * resource type.
   */
  public OrderRepresentationModelAssembler(UserRepresentationModelAssembler uAssembler,
      AddressRepresentationModelAssembler aAssembler, CardRepresentationModelAssembler cAssembler,
      ShipmentRepresentationModelAssembler sAssembler, ItemService itemService) {
    super(OrderController.class, Order.class);
    this.uAssembler = uAssembler;
    this.aAssembler = aAssembler;
    this.cAssembler = cAssembler;
    this.sAssembler = sAssembler;
    this.itemService = itemService;
  }

  /**
   * Coverts the Order entity to resource
   *
   * @param entity
   */
  @Override
  public Order toModel(OrderEntity entity) {
    System.out.println("\n\n\nentity = " + entity);
    Order resource = createModelWithId(entity.getId(), entity);
    BeanUtils.copyProperties(entity, resource);
    resource.id(entity.getId().toString())
        .customer(uAssembler.toModel(entity.getUserEntity()))
        .address(aAssembler.toModel(entity.getAddressEntity()))
        .card(cAssembler.toModel(entity.getCardEntity()))
        .items(itemService.toModelList(entity.getItems()))
        .date(entity.getOrderDate().toInstant().atOffset(ZoneOffset.UTC));
    System.out.println("resource = " + resource);
    // Self link generated by createModelWithId has missing api path. Therefore, generating additionally.
    // can be removed once fixed.
    resource.add(linkTo(methodOn(OrderController.class).getByOrderId(entity.getId().toString()))
        .withSelfRel());
    return resource;
  }

  /**
   * Coverts the collection of Product entities to list of resources.
   *
   * @param entities
   */
  public List<Order> toListModel(Iterable<OrderEntity> entities) {
    if (Objects.isNull(entities)) {
      return List.of();
    }
    return StreamSupport.stream(entities.spliterator(), false).map(this::toModel)
        .collect(toList());
  }

}
