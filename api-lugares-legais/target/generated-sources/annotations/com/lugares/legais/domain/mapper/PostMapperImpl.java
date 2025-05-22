package com.lugares.legais.domain.mapper;

import com.lugares.legais.domain.Entity.PlaceIndication;
import com.lugares.legais.domain.Entity.Post;
import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.PostDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-21T22:27:47-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDTO postToPostDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDTO postDTO = new PostDTO();

        postDTO.setTitle( post.getTitle() );
        postDTO.setText( post.getText() );
        postDTO.setAmbience( post.getAmbience() );
        postDTO.setServiceQuality( post.getServiceQuality() );
        postDTO.setDrinksAndFoods( post.getDrinksAndFoods() );
        postDTO.setMusicAndEntertanement( post.getMusicAndEntertanement() );

        return postDTO;
    }

    @Override
    public Post postDtoToPost(PostDTO postDto, User user, PlaceIndication place) {
        if ( postDto == null && user == null && place == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        if ( postDto != null ) {
            post.title( postDto.getTitle() );
            post.text( postDto.getText() );
            post.ambience( postDto.getAmbience() );
            post.serviceQuality( postDto.getServiceQuality() );
            post.drinksAndFoods( postDto.getDrinksAndFoods() );
            post.musicAndEntertanement( postDto.getMusicAndEntertanement() );
        }
        post.user( user );
        post.placeIndication( place );

        return post.build();
    }
}
