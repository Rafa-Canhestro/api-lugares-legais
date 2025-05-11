package com.lugares.legais.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthDTO {

    @NotNull(message = "you must inform a login") 
    private String login;

    @NotNull(message = "you must inform a password") 
    private String passWord;

}
