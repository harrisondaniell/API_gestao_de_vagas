package com.github.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;


@Data
public class CandidateEntity {
    private UUID id;
    private String name;

    @Email (message = "O campo [email] deve conter um e-mail válido.")
    private String email;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaços")
    private String username;

    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;


}
