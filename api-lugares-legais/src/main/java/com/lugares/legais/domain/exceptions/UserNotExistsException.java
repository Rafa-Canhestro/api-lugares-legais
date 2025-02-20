package com.lugares.legais.domain.exceptions;

public class UserNotExistsException extends RuntimeException {

    private static final String ERROR_MESSAGE = "User not exists in the database. Please insert a correct login";

    public UserNotExistsException() {
        super(ERROR_MESSAGE);
    }

    public UserNotExistsException(String messageError) {
        super(messageError);
    }

}
