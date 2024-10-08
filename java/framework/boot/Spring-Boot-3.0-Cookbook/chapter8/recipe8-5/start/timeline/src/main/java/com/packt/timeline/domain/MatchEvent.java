package com.packt.timeline.domain;

import java.time.LocalDateTime;

public record MatchEvent(Long id, Long matchId, LocalDateTime eventTime, int type, String description, Long player1,
        Long player2) {
}
