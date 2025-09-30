package io.github.SAlmeidaJr.access_api.core.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public record Messages(
    UUID id,
    UUID sessionId,
    UUID yappersId,
    String type,
    String content,
    LocalDateTime dateSent
) {}
