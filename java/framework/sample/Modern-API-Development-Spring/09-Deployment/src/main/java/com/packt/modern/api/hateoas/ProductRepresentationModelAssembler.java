package com.packt.modern.api.hateoas;

import com.packt.modern.api.controller.ProductController;
import com.packt.modern.api.entity.ProductEntity;
import com.packt.modern.api.model.Product;
import com.packt.modern.api.model.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter09 - Modern API Development with Spring and Spring Boot Ed 2
 */
@Component
public class ProductRepresentationModelAssembler
    extends RepresentationModelAssemblerSupport<ProductEntity, Product> {

  /**
   * Creates a new {@link RepresentationModelAssemblerSupport} using the given controller class and
   * resource type.
   */
  public ProductRepresentationModelAssembler() {
    super(ProductController.class, Product.class);
  }

  /**
   * Coverts the Product entity to resource
   *
   * @param entity
   */
  @Override
  public Product toModel(ProductEntity entity) {
    Product resource = createModelWithId(entity.getId(), entity);
    BeanUtils.copyProperties(entity, resource);
    resource.setId(entity.getId().toString());
    resource.setTag(
        entity.getTags().stream()
            .map(t -> new Tag().id(t.getId().toString()).name(t.getName()))
            .collect(toList()));
    // Self link generated by createModelWithId has missing api path. Therefore, generating
    // additionally.
    // can be removed once fixed.
    resource.add(
        linkTo(methodOn(ProductController.class).getProduct(entity.getId().toString()))
            .withSelfRel());
    resource.add(
        linkTo(methodOn(ProductController.class).queryProducts(null, null, 1, 10))
            .withRel("products"));
    return resource;
  }

  /**
   * Coverts the collection of Product entities to list of resources.
   *
   * @param entities
   */
  public List<Product> toListModel(Iterable<ProductEntity> entities) {
    if (Objects.isNull(entities)) {
      return List.of();
    }
    return StreamSupport.stream(entities.spliterator(), false).map(this::toModel).collect(toList());
  }
}
