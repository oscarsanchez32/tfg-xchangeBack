package com.example.xchange.mapper;

import com.example.xchange.dto.ExchangeRequestDTO;
import com.example.xchange.entity.ApplicationUser;
import com.example.xchange.entity.ExchangeRequest;
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
public class ExchangeMapperImpl implements ExchangeMapper {

    @Override
    public ExchangeRequestDTO toExchangeRequestDTO(ExchangeRequest exchangeRequest) {
        if ( exchangeRequest == null ) {
            return null;
        }

        ExchangeRequestDTO.ExchangeRequestDTOBuilder exchangeRequestDTO = ExchangeRequestDTO.builder();

        exchangeRequestDTO.exchangeOpener( exchangeRequestExchangeOpenerUserName( exchangeRequest ) );
        exchangeRequestDTO.exchangeCloser( exchangeRequestExchangeCloserUserName( exchangeRequest ) );
        exchangeRequestDTO.openerOwnedGameId( exchangeRequestOpenerOwnedGameId( exchangeRequest ) );
        exchangeRequestDTO.openerOwnedGameTitle( exchangeRequestOpenerOwnedGameTitle( exchangeRequest ) );
        exchangeRequestDTO.openerExchangeGameId( exchangeRequestOpenerExchangeGameId( exchangeRequest ) );
        exchangeRequestDTO.openerExchangeGameTitle( exchangeRequestOpenerExchangeGameTitle( exchangeRequest ) );
        exchangeRequestDTO.closedAt( exchangeRequest.getClosedAt() );
        exchangeRequestDTO.createdAt( exchangeRequest.getCreatedAt() );
        exchangeRequestDTO.exchangeStatus( exchangeRequest.getExchangeStatus() );
        exchangeRequestDTO.id( exchangeRequest.getId() );

        return exchangeRequestDTO.build();
    }

    @Override
    public List<ExchangeRequestDTO> toExchangeRequestDTOs(List<ExchangeRequest> exchangeRequests) {
        if ( exchangeRequests == null ) {
            return null;
        }

        List<ExchangeRequestDTO> list = new ArrayList<ExchangeRequestDTO>( exchangeRequests.size() );
        for ( ExchangeRequest exchangeRequest : exchangeRequests ) {
            list.add( toExchangeRequestDTO( exchangeRequest ) );
        }

        return list;
    }

    private String exchangeRequestExchangeOpenerUserName(ExchangeRequest exchangeRequest) {
        if ( exchangeRequest == null ) {
            return null;
        }
        ApplicationUser exchangeOpener = exchangeRequest.getExchangeOpener();
        if ( exchangeOpener == null ) {
            return null;
        }
        String userName = exchangeOpener.getUserName();
        if ( userName == null ) {
            return null;
        }
        return userName;
    }

    private String exchangeRequestExchangeCloserUserName(ExchangeRequest exchangeRequest) {
        if ( exchangeRequest == null ) {
            return null;
        }
        ApplicationUser exchangeCloser = exchangeRequest.getExchangeCloser();
        if ( exchangeCloser == null ) {
            return null;
        }
        String userName = exchangeCloser.getUserName();
        if ( userName == null ) {
            return null;
        }
        return userName;
    }

    private int exchangeRequestOpenerOwnedGameId(ExchangeRequest exchangeRequest) {
        if ( exchangeRequest == null ) {
            return 0;
        }
        Game openerOwnedGame = exchangeRequest.getOpenerOwnedGame();
        if ( openerOwnedGame == null ) {
            return 0;
        }
        int id = openerOwnedGame.getId();
        return id;
    }

    private String exchangeRequestOpenerOwnedGameTitle(ExchangeRequest exchangeRequest) {
        if ( exchangeRequest == null ) {
            return null;
        }
        Game openerOwnedGame = exchangeRequest.getOpenerOwnedGame();
        if ( openerOwnedGame == null ) {
            return null;
        }
        String title = openerOwnedGame.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }

    private int exchangeRequestOpenerExchangeGameId(ExchangeRequest exchangeRequest) {
        if ( exchangeRequest == null ) {
            return 0;
        }
        Game openerExchangeGame = exchangeRequest.getOpenerExchangeGame();
        if ( openerExchangeGame == null ) {
            return 0;
        }
        int id = openerExchangeGame.getId();
        return id;
    }

    private String exchangeRequestOpenerExchangeGameTitle(ExchangeRequest exchangeRequest) {
        if ( exchangeRequest == null ) {
            return null;
        }
        Game openerExchangeGame = exchangeRequest.getOpenerExchangeGame();
        if ( openerExchangeGame == null ) {
            return null;
        }
        String title = openerExchangeGame.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }
}
