package com.lugares.legais.domain.services.user;

import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.UserCreateDTO;
import com.lugares.legais.domain.exceptions.UserLoginAlreadyExistsException;
import com.lugares.legais.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.lugares.legais.domain.mapper.UserMapper;
import com.lugares.legais.domain.util.ValidatePassWordUtil;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper mapper;

    public User createUser(UserCreateDTO userCreateDTO) {
        validateIfLoginAlreadyExists(userCreateDTO.getLogin());
        ValidatePassWordUtil.validatePassWord(userCreateDTO.getPassword());
        User user = mapper.userCreateDtoToUser(userCreateDTO);
        userRepository.save(user);
        return user;
    }

    private void validateIfLoginAlreadyExists(String login) {
        if (userRepository.existsByLogin(login)) {
            throw new UserLoginAlreadyExistsException();
        }
    }

}
