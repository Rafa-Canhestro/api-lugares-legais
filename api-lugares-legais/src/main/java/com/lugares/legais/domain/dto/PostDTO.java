package com.lugares.legais.domain.dto;

import com.lugares.legais.domain.enums.CriteriasAvaliation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private String namePlace;
    private String login;
    private String title;
    private String text;
    private CriteriasAvaliation ambience;
    private CriteriasAvaliation serviceQuality;
    private CriteriasAvaliation drinksAndFoods;
    private CriteriasAvaliation musicAndEntertanement;

}
