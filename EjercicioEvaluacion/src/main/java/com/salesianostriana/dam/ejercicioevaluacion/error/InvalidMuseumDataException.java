package com.salesianostriana.dam.ejercicioevaluacion.error;

public class InvalidMuseumDataException extends RuntimeException {
    public InvalidMuseumDataException(String message) {
        super(message);
    }
    public InvalidMuseumDataException(Long id) {
        super("No hay un museos con ese ID: %d".formatted(id));
    }

    public InvalidMuseumDataException() {
        super("No hay museos con esos requisitos de búsqueda");
    }
}
