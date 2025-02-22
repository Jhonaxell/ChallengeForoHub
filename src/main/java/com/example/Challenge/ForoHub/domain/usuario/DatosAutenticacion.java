package com.example.Challenge.ForoHub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacion(
        @NotBlank
        @Email
        String username,
        @NotBlank
        String password
) {

}
