package io.github.SAlmeidaJr.access_api.core.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import io.github.SAlmeidaJr.access_api.core.enums.TypeTalk;

public record session(
    UUID sessionId,
    TypeTalk type,
    String name,
    Boolean admin,
    LocalDateTime timestamp,
    Set<UUID> UserIds,
    List<UUID> messagesIds
) {}
