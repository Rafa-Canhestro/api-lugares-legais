package com.lugares.legais.controller.exception.handler;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.lugares.legais.domain.exceptions.InvalidPassWordException;
import com.lugares.legais.domain.exceptions.PlaceIndicationNotExistsException;
import com.lugares.legais.domain.exceptions.UserLoginAlreadyExistsException;
import com.lugares.legais.domain.exceptions.UserNotExistsException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleValidationException(ConstraintViolationException ex) {
        return ResponseEntity.badRequest()
                             .body("Validation failed: " + ex.getMessage());
    }

    @ExceptionHandler(PlaceIndicationNotExistsException.class)
    public ResponseEntity<String> handleValidationException(PlaceIndicationNotExistsException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("Resource not found: " + ex.getMessage());
    }

    @ExceptionHandler(UserNotExistsException.class)
    public ResponseEntity<String> handleValidationException(UserNotExistsException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("Resource not found: " + ex.getMessage());
    }

    @ExceptionHandler(UserLoginAlreadyExistsException.class)
    public ResponseEntity<String> handleValidationException(UserLoginAlreadyExistsException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                             .body("User not be created: " + ex.getMessage());
    }

    @ExceptionHandler(InvalidPassWordException.class)
    public ResponseEntity<String> handleValidationException(InvalidPassWordException ex) {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
                             .body(ex.getMessage());
    }

}
