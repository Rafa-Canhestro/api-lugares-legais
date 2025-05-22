package com.lugares.legais.domain.dto;

import com.lugares.legais.domain.enums.SexualDefinition;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDTO {

    @NotNull(message = "you must inform a login") 
    private String login;

    @NotNull(message = "you must inform a password") 
    private String password;

    @NotNull(message = "you must inform your age") 
    private String age;

    @NotNull(message = "you must inform your sex/genre") 
    private SexualDefinition sexualDefinition;

}
