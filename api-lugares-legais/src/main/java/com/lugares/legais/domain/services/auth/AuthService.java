package com.lugares.legais.domain.services.auth;

import org.springframework.stereotype.Service;

import com.lugares.legais.config.jwt.JwtUtils;
import com.lugares.legais.domain.dto.UserDTO;
import com.lugares.legais.domain.exceptions.UserNotExistsException;
import com.lugares.legais.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final JwtUtils jwtUtil;
    private final UserRepository userRepository;

    public String validateUserAuth(UserDTO userDTO) {
        validateLogin(userDTO);

        //criar método para validação de senha no banco de dados.
        //implementação pela interface do repositório User.

        String token = jwtUtil.generateToken(userDTO.getLogin());
        return token;
    }

    private void validateLogin(UserDTO userDTO) {
        if (!userRepository.existsByLogin(userDTO.getLogin())) {
            throw new UserNotExistsException();
        }
    }

}
