package com.lugares.legais.domain.model;

import com.lugares.legais.domain.enums.TypeOfPlace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceIndication {

    private String name;
    private String address;
    private String telephoneNumber;
    private TypeOfPlace typeOfPlace;
    private float avaliations;

}
