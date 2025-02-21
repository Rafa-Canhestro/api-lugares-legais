package com.lugares.legais.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

import com.lugares.legais.domain.model.PlaceIndication;
import com.lugares.legais.domain.model.Post;
import com.lugares.legais.domain.dto.PostDTO;
import com.lugares.legais.domain.model.User;

@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(target = "login", ignore = true)
    @Mapping(target = "namePlace", ignore = true)
    PostDTO postToPostDTO(Post post);

    @Mapping(target = "likes", ignore = true)
    @Mapping(target = "comment", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", source = "user")
    @Mapping(target = "placeIndication", source = "place")
    Post postDtoToPost(PostDTO postDto, User user, PlaceIndication place);

}
