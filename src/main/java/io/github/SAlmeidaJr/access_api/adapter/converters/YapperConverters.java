package io.github.SAlmeidaJr.access_api.adapter.converters;

import org.springframework.stereotype.Component;

import io.github.SAlmeidaJr.access_api.adapter.dtos.YapperDto;
import io.github.SAlmeidaJr.access_api.core.domain.Yapper;

@Component
public class YapperConverters {

    public Yapper toYapper(YapperDto yapperDto){
        return new Yapper(
            yapperDto.getId(), 
            yapperDto.getName(), 
            yapperDto.getEmail(), 
            yapperDto.getPassword(), 
            yapperDto.getContactIds(), 
            yapperDto.getPastMessageIds());
    }
}
