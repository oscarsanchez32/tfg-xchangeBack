package com.example.xchange.mapper;

import com.example.xchange.dto.GameDTO;
import com.example.xchange.dto.OrderResponseDTO;
import com.example.xchange.entity.Game;
import com.example.xchange.entity.Order;
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
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderResponseDTO toOrderResponseDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderResponseDTO.OrderResponseDTOBuilder orderResponseDTO = OrderResponseDTO.builder();

        orderResponseDTO.createdAt( order.getCreatedAt() );
        orderResponseDTO.id( order.getId() );
        orderResponseDTO.orderItems( gameListToGameDTOList( order.getOrderItems() ) );
        orderResponseDTO.paymentType( order.getPaymentType() );
        orderResponseDTO.receiptUrl( order.getReceiptUrl() );
        orderResponseDTO.status( order.getStatus() );
        orderResponseDTO.total( order.getTotal() );

        return orderResponseDTO.build();
    }

    @Override
    public List<OrderResponseDTO> toOrderResponseDTOs(List<Order> orders) {
        if ( orders == null ) {
            return null;
        }

        List<OrderResponseDTO> list = new ArrayList<OrderResponseDTO>( orders.size() );
        for ( Order order : orders ) {
            list.add( toOrderResponseDTO( order ) );
        }

        return list;
    }

    protected GameDTO gameToGameDTO(Game game) {
        if ( game == null ) {
            return null;
        }

        GameDTO.GameDTOBuilder gameDTO = GameDTO.builder();

        gameDTO.developera( game.getDevelopera() );
        gameDTO.gameDetail( game.getGameDetail() );
        gameDTO.id( game.getId() );
        gameDTO.imgPath( game.getImgPath() );
        gameDTO.price( game.getPrice() );
        gameDTO.shortDesc( game.getShortDesc() );
        gameDTO.tags( game.getTags() );
        gameDTO.title( game.getTitle() );

        return gameDTO.build();
    }

    protected List<GameDTO> gameListToGameDTOList(List<Game> list) {
        if ( list == null ) {
            return null;
        }

        List<GameDTO> list1 = new ArrayList<GameDTO>( list.size() );
        for ( Game game : list ) {
            list1.add( gameToGameDTO( game ) );
        }

        return list1;
    }
}
