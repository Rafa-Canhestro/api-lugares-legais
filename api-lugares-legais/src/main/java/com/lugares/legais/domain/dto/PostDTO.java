package com.lugares.legais.domain.dto;

import com.lugares.legais.domain.enums.CriteriasAvaliation;
import com.lugares.legais.domain.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private String place;
    private User user;
    private String title;
    private String text;
    private CriteriasAvaliation ambience;
    private CriteriasAvaliation serviceQuality;
    private CriteriasAvaliation drinksAndFoods;
    private CriteriasAvaliation musicAndEntertanement;

}
