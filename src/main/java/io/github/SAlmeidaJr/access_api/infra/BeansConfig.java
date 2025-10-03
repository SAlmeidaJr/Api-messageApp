package io.github.SAlmeidaJr.access_api.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.SAlmeidaJr.access_api.core.ports.UserServicePort;
import io.github.SAlmeidaJr.access_api.core.services.UserService;

@Configuration
public class BeansConfig {

    @Bean
    public UserServicePort userServiceImpl(){
        return new UserService();
    }
}
