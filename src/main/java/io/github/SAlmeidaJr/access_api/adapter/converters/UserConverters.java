package io.github.SAlmeidaJr.access_api.adapter.converters;

import org.springframework.stereotype.Component;

import io.github.SAlmeidaJr.access_api.adapter.dtos.UserDto;
import io.github.SAlmeidaJr.access_api.core.domain.User;

@Component
public class UserConverters {

    public User toDomainUser(UserDto userDto){
        return new User(
            userDto.id(), 
            userDto.name(), 
            userDto.email(), 
            userDto.password(), 
            userDto.contactIds(), 
            userDto.pastMessageIds()
        );
    }

    public UserDto toDto(User user){
        return new UserDto(
            user.id(),
            user.name(),
            user.email(),
            user.password(),
            user.contactIds(),
            user.pastMessageIds()
        );
    }
}
