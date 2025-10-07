package io.github.SAlmeidaJr.access_api.adapter.entities;

import java.util.List;
import java.util.Set;
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
public class UserEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    private String name;

    private String email;

    private String password;

    private Set<UUID> contactIds;

    private List<UUID> pastMessageIds;
}
