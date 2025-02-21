package com.lugares.legais.domain.model;

import com.lugares.legais.domain.enums.CriteriasAvaliation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts_table")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "place_id", nullable = false)
    private PlaceIndication placeIndication;
    private int likes;
    private String title;
    private String text;
    private String comment;
    private CriteriasAvaliation ambience;
    private CriteriasAvaliation serviceQuality;
    private CriteriasAvaliation drinksAndFoods;
    private CriteriasAvaliation musicAndEntertanement;

}