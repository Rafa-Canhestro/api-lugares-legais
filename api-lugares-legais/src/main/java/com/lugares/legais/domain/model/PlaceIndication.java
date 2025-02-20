package com.lugares.legais.domain.model;

import com.lugares.legais.domain.enums.TypeOfPlace;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PlaceIndication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String placeName;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdBy;

    private String address;
    private String telephoneNumber;
    private TypeOfPlace typeOfPlace;
    private float avaliations;
    
    @OneToMany(mappedBy = "placeIndication", cascade = CascadeType.ALL)
    private List<Post> posts;

}
