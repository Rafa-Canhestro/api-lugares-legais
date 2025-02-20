package com.lugares.legais.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.lugares.legais.domain.model.Post;
import com.lugares.legais.domain.dto.PostDTO;
import com.lugares.legais.domain.model.User;

@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    PostDTO postToPostDTO(Post post);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", source = "user")
    Post PostDtoToPost(PostDTO postDto, User user);

}
