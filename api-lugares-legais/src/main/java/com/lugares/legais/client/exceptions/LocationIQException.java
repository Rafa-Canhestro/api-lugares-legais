package com.lugares.legais.client.exceptions;

public class LocationIQException extends RuntimeException {

    private static final String ERROR_MESSAGE = "The informed address it´s not registered in our systems";

    private String statusCode;

    public LocationIQException(String statusCode) {
        super(ERROR_MESSAGE);
        this.statusCode = statusCode;
    }

}
