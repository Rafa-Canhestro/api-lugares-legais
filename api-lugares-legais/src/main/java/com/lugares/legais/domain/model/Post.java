package com.lugares.legais.domain.model;

import com.lugares.legais.domain.enums.CriteriasAvaliation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts_table")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User user;
    private int likes;
    private String title;
    private String text;
    private String comment;
    private CriteriasAvaliation ambience;
    private CriteriasAvaliation serviceQuality;
    private CriteriasAvaliation drinksAndFoods;
    private CriteriasAvaliation musicAndEntertanement;

}