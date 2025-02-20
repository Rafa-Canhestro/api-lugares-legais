package com.lugares.legais.domain.service.validation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.lugares.legais.repository.UserRepository;
import java.util.*;
import com.lugares.legais.domain.model.User;
import com.lugares.legais.domain.exceptions.UserNotExistsException;

@Component
@RequiredArgsConstructor
public class ValidateUserLogin {

    private final UserRepository userRepository;

    public void validate(String loginUser) {
        if (!userRepository.existsByLogin(loginUser)) {
            throw new UserNotExistsException();
        }
    }

}
