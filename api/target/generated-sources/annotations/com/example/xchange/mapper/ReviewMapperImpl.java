package com.example.xchange.mapper;

import com.example.xchange.dto.ReviewResponseDTO;
import com.example.xchange.entity.ApplicationUser;
import com.example.xchange.entity.Game;
import com.example.xchange.entity.Review;
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
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewResponseDTO toReviewResponseDTO(Review review) {
        if ( review == null ) {
            return null;
        }

        ReviewResponseDTO reviewResponseDTO = new ReviewResponseDTO();

        reviewResponseDTO.setUsername( reviewUserUserName( review ) );
        reviewResponseDTO.setReviewId( review.getId() );
        reviewResponseDTO.setGameTitle( reviewGameTitle( review ) );
        Integer id = reviewGameId( review );
        if ( id != null ) {
            reviewResponseDTO.setGameId( String.valueOf( id ) );
        }
        reviewResponseDTO.setUserImg( reviewUserUserImg( review ) );
        reviewResponseDTO.setContent( review.getContent() );
        reviewResponseDTO.setRating( review.getRating() );
        reviewResponseDTO.setTimestamp( review.getTimestamp() );
        reviewResponseDTO.setTitle( review.getTitle() );

        return reviewResponseDTO;
    }

    @Override
    public List<ReviewResponseDTO> toReviewResponseDTOs(List<Review> reviews) {
        if ( reviews == null ) {
            return null;
        }

        List<ReviewResponseDTO> list = new ArrayList<ReviewResponseDTO>( reviews.size() );
        for ( Review review : reviews ) {
            list.add( toReviewResponseDTO( review ) );
        }

        return list;
    }

    private String reviewUserUserName(Review review) {
        if ( review == null ) {
            return null;
        }
        ApplicationUser user = review.getUser();
        if ( user == null ) {
            return null;
        }
        String userName = user.getUserName();
        if ( userName == null ) {
            return null;
        }
        return userName;
    }

    private String reviewGameTitle(Review review) {
        if ( review == null ) {
            return null;
        }
        Game game = review.getGame();
        if ( game == null ) {
            return null;
        }
        String title = game.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }

    private Integer reviewGameId(Review review) {
        if ( review == null ) {
            return null;
        }
        Game game = review.getGame();
        if ( game == null ) {
            return null;
        }
        int id = game.getId();
        return id;
    }

    private String reviewUserUserImg(Review review) {
        if ( review == null ) {
            return null;
        }
        ApplicationUser user = review.getUser();
        if ( user == null ) {
            return null;
        }
        String userImg = user.getUserImg();
        if ( userImg == null ) {
            return null;
        }
        return userImg;
    }
}
