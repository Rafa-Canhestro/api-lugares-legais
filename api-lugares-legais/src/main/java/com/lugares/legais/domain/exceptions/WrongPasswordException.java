package com.lugares.legais.domain.exceptions;

public class WrongPasswordException extends RuntimeException {

    private static final String ERROR_MESSAGE = "The password informed is incorrect";

    public WrongPasswordException() {
        super(ERROR_MESSAGE);
    }

    public WrongPasswordException(String messageError) {
        super(messageError);
    }

}
