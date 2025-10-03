package io.github.SAlmeidaJr.access_api.core.services;

import java.util.UUID;

import io.github.SAlmeidaJr.access_api.core.domain.User;
import io.github.SAlmeidaJr.access_api.core.ports.UserServicePort;

public class UserService implements UserServicePort {

    @Override
    public User createUser(User user) {
        if (user.id() == null) {
            return new User(UUID.randomUUID(), user.name(), user.email(), user.password(), user.contactIds(), user.pastMessageIds());
        }
    return user;
}

}
