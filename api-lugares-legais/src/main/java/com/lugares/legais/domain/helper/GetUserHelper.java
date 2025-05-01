package com.lugares.legais.domain.helper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.lugares.legais.repository.UserRepository;
import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.exceptions.UserNotExistsException;
import java.util.*;

@Component
@RequiredArgsConstructor
public class GetUserHelper {

    private final UserRepository userRepository;

    public User get(String userLogin) {
        Optional<User> userOptional = userRepository.findByLogin(userLogin);
        User user = userOptional.orElseThrow(() -> new UserNotExistsException());
        return user;
    }

}
