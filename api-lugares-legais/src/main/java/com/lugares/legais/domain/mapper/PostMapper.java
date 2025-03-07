package com.lugares.legais.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.lugares.legais.domain.Entity.PlaceIndication;
import com.lugares.legais.domain.Entity.Post;
import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.PostDTO;

@Mapper(componentModel = "spring")
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
