package com.lugares.legais.domain.Entity;

import java.util.*;
import com.lugares.legais.domain.enums.SexualDefinition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_table")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String login;

    @Column(unique = true, nullable = false)
    private String password;

    private String age;
    private SexualDefinition sexualDefinition;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;

}
