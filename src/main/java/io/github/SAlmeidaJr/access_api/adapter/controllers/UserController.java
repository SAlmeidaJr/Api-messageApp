package io.github.SAlmeidaJr.access_api.adapter.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.SAlmeidaJr.access_api.adapter.converters.UserConverters;
import io.github.SAlmeidaJr.access_api.adapter.dtos.UserDto;
import io.github.SAlmeidaJr.access_api.core.ports.UserServicePort;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServicePort UserServicePort;
    private final UserConverters UserConverters;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(@RequestBody UserDto userDto){
        return UserConverters.toDto(UserServicePort.createUser(UserConverters.toDomainUser(userDto)));
    }

    @PostMapping("login")
    @ResponseStatus(HttpStatus.FOUND)
    public UserDto login(@RequestBody UserDto userDto){
        return userDto;
    }

    @GetMapping
    public UUID searchUser(@RequestParam("UserId") UUID userId){
        return userId;
    }

}
