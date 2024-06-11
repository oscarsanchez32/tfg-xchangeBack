package com.example.bookstorespringbootapi.mapper;

import antlr.debug.Event;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

import com.example.xchange.dto.EventDTO;
import com.example.xchange.mapper.EventMapper;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-06T16:27:04+0200",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public EventDTO toEventDTO(Event event) {
        if ( event == null ) {
            return null;
        }

        EventDTO.EventDTOBuilder eventDTO = EventDTO.builder();

        return eventDTO.build();
    }

    @Override
    public List<EventDTO> toEventDTOs(List<Event> events) {
        if ( events == null ) {
            return null;
        }

        List<EventDTO> list = new ArrayList<EventDTO>( events.size() );
        for ( Event event : events ) {
            list.add( toEventDTO( event ) );
        }

        return list;
    }
}