package io.github.SAlmeidaJr.access_api.adapter.dtos;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class YapperDto {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private Set<UUID> contactIds;
    private List<UUID> pastMessageIds;
};
