package com.lugares.legais.domain.mapper;

import com.lugares.legais.domain.dto.PostDTO;
import com.lugares.legais.domain.model.Post;
import com.lugares.legais.domain.model.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-20T18:36:03-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
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
    public Post PostDtoToPost(PostDTO postDto, User user) {
        if ( postDto == null && user == null ) {
            return null;
        }

        Post post = new Post();

        if ( postDto != null ) {
            post.setAmbience( postDto.getAmbience() );
            post.setDrinksAndFoods( postDto.getDrinksAndFoods() );
            post.setMusicAndEntertanement( postDto.getMusicAndEntertanement() );
            post.setServiceQuality( postDto.getServiceQuality() );
            post.setText( postDto.getText() );
            post.setTitle( postDto.getTitle() );
        }
        post.setUser( user );

        return post;
    }
}
