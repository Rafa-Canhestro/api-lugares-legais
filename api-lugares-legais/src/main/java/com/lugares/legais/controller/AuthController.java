package com.lugares.legais.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.lugares.legais.domain.dto.UserDTO;
import com.lugares.legais.domain.services.auth.AuthService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO) {
        String token = authService.validateUserAuth(userDTO);
        return ResponseEntity.ok(token);
    }
}

