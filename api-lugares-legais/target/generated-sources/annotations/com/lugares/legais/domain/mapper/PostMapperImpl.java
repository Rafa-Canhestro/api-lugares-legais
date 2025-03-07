package com.lugares.legais.domain.mapper;

import com.lugares.legais.domain.Entity.PlaceIndication;
import com.lugares.legais.domain.Entity.Post;
import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.PostDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-07T02:17:59-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250213-2037, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDTO postToPostDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDTO postDTO = new PostDTO();

        postDTO.setAmbience( post.getAmbience() );
        postDTO.setDrinksAndFoods( post.getDrinksAndFoods() );
        postDTO.setMusicAndEntertanement( post.getMusicAndEntertanement() );
        postDTO.setServiceQuality( post.getServiceQuality() );
        postDTO.setText( post.getText() );
        postDTO.setTitle( post.getTitle() );

        return postDTO;
    }

    @Override
    public Post postDtoToPost(PostDTO postDto, User user, PlaceIndication place) {
        if ( postDto == null && user == null && place == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        if ( postDto != null ) {
            post.ambience( postDto.getAmbience() );
            post.drinksAndFoods( postDto.getDrinksAndFoods() );
            post.musicAndEntertanement( postDto.getMusicAndEntertanement() );
            post.serviceQuality( postDto.getServiceQuality() );
            post.text( postDto.getText() );
            post.title( postDto.getTitle() );
        }
        post.user( user );
        post.placeIndication( place );

        return post.build();
    }
}
