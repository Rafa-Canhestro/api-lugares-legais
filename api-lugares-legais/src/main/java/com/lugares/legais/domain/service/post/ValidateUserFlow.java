package com.lugares.legais.domain.service.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.lugares.legais.repository.UserRepository;
import java.util.*;
import com.lugares.legais.domain.model.User;
import com.lugares.legais.domain.exceptions.UserNotExistsException;

@Component
@RequiredArgsConstructor
public class ValidateUserFlow {

    private final UserRepository userRepository;

    public void validate(String loginUser) {
        Optional<User> userOptional = userRepository.findByLogin(loginUser);
        userOptional.orElseThrow(() -> new UserNotExistsException());
    }

}
