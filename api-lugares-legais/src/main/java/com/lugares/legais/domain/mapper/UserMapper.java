package com.lugares.legais.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "posts", ignore = true)
    User userDtoToUser(UserDTO userDTO);

}
