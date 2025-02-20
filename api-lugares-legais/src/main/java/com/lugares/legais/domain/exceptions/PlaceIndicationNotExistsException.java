package com.lugares.legais.domain.exceptions;

public class PlaceIndicationNotExistsException extends RuntimeException {

    private static final String ERROR_MESSAGE = "Place indication not exists in data base";

    public PlaceIndicationNotExistsException() {
        super(ERROR_MESSAGE);
    }

    public PlaceIndicationNotExistsException(String messageError) {
        super(messageError);
    }

}
