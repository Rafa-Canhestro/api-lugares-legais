package com.lugares.legais.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @NotNull(message = "you must inform a login") 
    private String login;

    @NotNull(message = "you must inform a password") 
    private String passWord;

    @NotNull(message = "you must inform your age") 
    private String age;

    @NotNull(message = "you must inform your sex/genre") 
    private String sex;

}
