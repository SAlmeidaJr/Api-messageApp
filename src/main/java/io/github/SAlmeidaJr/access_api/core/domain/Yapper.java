package io.github.SAlmeidaJr.access_api.core.domain;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public record Yapper(
    UUID id,
    String name,
    String email,
    String password,
    Set<UUID> contactIds,
    List<UUID> pastMessageIds
) {}
    