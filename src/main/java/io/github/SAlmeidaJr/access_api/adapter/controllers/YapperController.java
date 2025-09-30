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

import io.github.SAlmeidaJr.access_api.adapter.converters.YapperConverters;
import io.github.SAlmeidaJr.access_api.adapter.dtos.YapperDto;
import io.github.SAlmeidaJr.access_api.core.domain.Yapper;
import io.github.SAlmeidaJr.access_api.core.domain.ports.YapperServicePort;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class YapperController {

    private final YapperServicePort yapperServicePort;
    private final YapperConverters yapperConverters;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Yapper create(@RequestBody YapperDto yapperdDto){
        return yapperServicePort.createUser(yapperConverters.toYapper(yapperdDto));
    }

    @PostMapping("login")
    @ResponseStatus(HttpStatus.FOUND)
    public YapperDto login(@RequestBody YapperDto yapperDto){
        return yapperDto;
    }

    @GetMapping
    public UUID searchYapper(@RequestParam("yapperId") UUID yapperid){
        return yapperid;
    }

}
