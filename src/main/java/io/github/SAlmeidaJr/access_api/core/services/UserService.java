package io.github.SAlmeidaJr.access_api.core.services;

import io.github.SAlmeidaJr.access_api.core.domain.User;
import io.github.SAlmeidaJr.access_api.core.ports.UserServicePort;

public class UserService implements UserServicePort {

    @Override
    public User createUser(User user) {
        return user;
    }

    public User loginUser(User user){
        return user;
    }
}
