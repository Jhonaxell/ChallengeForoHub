package com.example.Challenge.ForoHub.infra.error;

public class ValidacionDeIntegridad extends RuntimeException {

    public ValidacionDeIntegridad(String message) {
        super(message);
    }

}
