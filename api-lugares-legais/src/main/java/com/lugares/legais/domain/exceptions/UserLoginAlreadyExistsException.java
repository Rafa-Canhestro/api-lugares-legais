package com.lugares.legais.domain.exceptions;

public class UserLoginAlreadyExistsException extends RuntimeException {

    private static final String ERROR_MESSAGE = "User login already exists in the database. You need to inform a valid login";

    public UserLoginAlreadyExistsException() {
        super(ERROR_MESSAGE);
    }

    public UserLoginAlreadyExistsException(String messageError) {
        super(messageError);
    }

}
