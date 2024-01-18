package com.praticasjava.excepciones2;

public class incorrectNameLengthException extends RuntimeException {
    public incorrectNameLengthException(String mensaje) {
        super(mensaje);
    }
}
