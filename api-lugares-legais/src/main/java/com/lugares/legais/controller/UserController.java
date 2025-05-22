package com.lugares.legais.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lugares.legais.domain.Entity.User;
import com.lugares.legais.domain.dto.UserCreateDTO;
import com.lugares.legais.domain.services.user.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@Valid @RequestBody UserCreateDTO userCreateDTO) {
        User createdUser = userService.createUser(userCreateDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

}
