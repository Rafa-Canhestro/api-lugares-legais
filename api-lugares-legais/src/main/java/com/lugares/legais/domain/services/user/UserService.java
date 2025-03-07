package com.lugares.legais.domain.services.user;

import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.UserDTO;
import com.lugares.legais.domain.exceptions.UserLoginAlreadyExistsException;
import com.lugares.legais.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.lugares.legais.domain.mapper.UserMapperImpl;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ValidatePassWord validatePassWord;
    private final UserMapperImpl mapper;

    public User createUser(UserDTO userDTO) {
        validateIfLoginAlreadyExists(userDTO);
        validatePassWord.validate(userDTO.getPassWord());
        User user = mapper.userDtoToUser(userDTO);
        userRepository.save(user);
        return user;
    }

    private void validateIfLoginAlreadyExists(UserDTO userDTO) {
        if (userRepository.existsByLogin(userDTO.getLogin())) {
            throw new UserLoginAlreadyExistsException();
        }
    }



}
