package com.lugares.legais.domain.exceptions;

public class InvalidPassWordException extends RuntimeException {

    private static final String ERROR_MESSAGE = "The password must have at least: one uppercase letter. " + 
    " Lowercase. One digit. One special character. Also, more than 5 characters";

    public InvalidPassWordException() {
        super(ERROR_MESSAGE);
    }

    public InvalidPassWordException(String messageError) {
        super(messageError);
    }

}
