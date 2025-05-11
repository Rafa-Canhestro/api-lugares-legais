package com.lugares.legais.domain.services.auth;

import org.springframework.stereotype.Service;
import com.lugares.legais.config.jwt.JwtUtils;
import com.lugares.legais.domain.dto.UserAuthDTO;
import com.lugares.legais.domain.exceptions.UserNotExistsException;
import com.lugares.legais.domain.exceptions.WrongPasswordException;
import com.lugares.legais.repository.UserRepository;
import com.lugares.legais.domain.Entity.User;
import lombok.RequiredArgsConstructor;
import java.util.*;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final JwtUtils jwtUtil;
    private final UserRepository userRepository;

    public String validateUserAuth(UserAuthDTO userAuthDTO) {
        validateLogin(userAuthDTO.getLogin());
        User user = validatePassword(userAuthDTO.getPassWord());
        String token = jwtUtil.generateToken(user.getLogin());
        return token;
    }

    private void validateLogin(String login) {
        if (!userRepository.existsByLogin(login)) {
            throw new UserNotExistsException();
        }
    }

    private User validatePassword(String password) {
        Optional<User> userOptional = userRepository.findByLogin(password);

        return userOptional.filter(user -> user.getPassword().equals(password))
                       .orElseThrow(() -> new WrongPasswordException("Login or password invalid"));
    }

}
