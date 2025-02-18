package com.lugares.legais.domain.model;

import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private String name;
    private String passWord;
    private String age;
    private String sex;
    private List<PlaceIndication> places;
    private List<Post> posts;

}
