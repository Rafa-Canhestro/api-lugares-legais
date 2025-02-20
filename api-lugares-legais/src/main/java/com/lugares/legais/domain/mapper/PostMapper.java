package com.lugares.legais.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.lugares.legais.domain.model.Post;
import com.lugares.legais.domain.dto.PostDTO;

@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    PostDTO postToPostDTO(Post post);
    Post PostDtoToPost(PostDTO post);

}
