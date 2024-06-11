package com.example.xchange.mapper;

import com.example.xchange.dto.GameDTO;
import com.example.xchange.entity.Game;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-11T09:44:33+0200",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class GameMapperImpl implements GameMapper {

    @Override
    public GameDTO toGameDTO(Game game) {
        if ( game == null ) {
            return null;
        }

        GameDTO.GameDTOBuilder gameDTO = GameDTO.builder();

        gameDTO.imgPath( game.getImgPath() );
        gameDTO.tags( game.getTags() );
        gameDTO.developera( game.getDevelopera() );
        gameDTO.gameDetail( game.getGameDetail() );
        gameDTO.id( game.getId() );
        gameDTO.price( game.getPrice() );
        gameDTO.shortDesc( game.getShortDesc() );
        gameDTO.title( game.getTitle() );

        return gameDTO.build();
    }

    @Override
    public List<GameDTO> toGameDTOs(List<Game> games) {
        if ( games == null ) {
            return null;
        }

        List<GameDTO> list = new ArrayList<GameDTO>( games.size() );
        for ( Game game : games ) {
            list.add( toGameDTO( game ) );
        }

        return list;
    }
}
