package com.lugares.legais.domain.services.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.lugares.legais.repository.UserRepository;
import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.exceptions.UserNotExistsException;
import java.util.*;

@Component
@RequiredArgsConstructor
public class GetUser {

    private final UserRepository userRepository;

    public User execute(String loginUser) {
        Optional<User> userOptional = userRepository.findByLogin(loginUser);
        User user = userOptional.orElseThrow(() -> new UserNotExistsException());
        return user;
    }

}
