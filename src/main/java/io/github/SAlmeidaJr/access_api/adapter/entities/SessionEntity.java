package io.github.SAlmeidaJr.access_api.adapter.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import io.github.SAlmeidaJr.access_api.core.enums.TypeTalk;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SessionEntity {

    private UUID sessionId;

    private TypeTalk type;

    private String name;

    private Boolean isAdmin;

    private LocalDateTime timestamp;

    private Set<UUID> UserIds;

    private List<UUID> messagesIds;
    
}
