package com.example.Challenge.ForoHub.infra.error;

import org.springframework.http.HttpStatus;

public record ExceptionResponse(
        String message,
        boolean success,
        HttpStatus status
) {
}
