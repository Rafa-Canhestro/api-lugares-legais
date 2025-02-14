package com.lugares.legais.model;

import com.lugares.legais.enums.TypeOfPlace;

public class PlaceIndication {

    private String name;
    private String address;
    private String telephoneNumber;
    private TypeOfPlace typeOfPlace;
    private float avaliations;

    public PlaceIndication(String address, float avaliations, String name, String telephoneNumber, TypeOfPlace typeOfPlace) {
        this.address = address;
        this.avaliations = avaliations;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.typeOfPlace = typeOfPlace;
    }

}
