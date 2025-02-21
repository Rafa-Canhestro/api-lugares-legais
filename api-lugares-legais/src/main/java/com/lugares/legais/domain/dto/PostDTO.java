package com.lugares.legais.domain.dto;

import jakarta.validation.constraints.NotNull;
import com.lugares.legais.domain.enums.CriteriasAvaliation;
import com.lugares.legais.domain.enums.TypeOfPlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    @NotNull(message = "name place cannot be null") 
    private String namePlace;

    @NotNull(message = "login cannot be null") 
    private String login;

    @NotNull(message = "title cannot be null") 
    private String title;

    @NotNull(message = "text cannot be null") 
    private String text;

    private CriteriasAvaliation ambience;
    private CriteriasAvaliation serviceQuality;
    private CriteriasAvaliation drinksAndFoods;
    private CriteriasAvaliation musicAndEntertanement;
    private TypeOfPlace typeOfPlace;

}
