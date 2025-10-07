package io.github.SAlmeidaJr.access_api.adapter.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MessageEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    private UUID sessionId;

    private UUID userIds;

    private String type;

    private String content;

    private LocalDateTime dateSent;
}
