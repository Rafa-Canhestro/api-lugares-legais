package com.lugares.legais.domain.mapper;

import com.lugares.legais.domain.dto.PostDTO;
import com.lugares.legais.domain.model.Post;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-20T16:02:46-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
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
    public Post PostDtoToPost(PostDTO post) {
        if ( post == null ) {
            return null;
        }

        Post post1 = new Post();

        post1.setTitle( post.getTitle() );
        post1.setText( post.getText() );
        post1.setAmbience( post.getAmbience() );
        post1.setServiceQuality( post.getServiceQuality() );
        post1.setDrinksAndFoods( post.getDrinksAndFoods() );
        post1.setMusicAndEntertanement( post.getMusicAndEntertanement() );

        return post1;
    }
}
