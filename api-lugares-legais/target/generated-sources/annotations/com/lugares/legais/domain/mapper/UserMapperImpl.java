package com.lugares.legais.domain.mapper;

import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.UserCreateDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-21T22:27:47-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userCreateDtoToUser(UserCreateDTO userCreateDTO) {
        if ( userCreateDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.login( userCreateDTO.getLogin() );
        user.password( userCreateDTO.getPassword() );
        user.age( userCreateDTO.getAge() );
        user.sexualDefinition( userCreateDTO.getSexualDefinition() );

        return user.build();
    }
}
