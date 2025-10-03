package io.github.SAlmeidaJr.access_api.core.ports;

import io.github.SAlmeidaJr.access_api.core.domain.User;

public interface UserServicePort {
    User createUser(User user);
}
