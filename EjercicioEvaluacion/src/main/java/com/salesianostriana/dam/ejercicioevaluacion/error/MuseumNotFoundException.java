package com.salesianostriana.dam.ejercicioevaluacion.error;

public class MuseumNotFoundException extends RuntimeException {


    public MuseumNotFoundException(String message) {
        super(message);
    }

    public MuseumNotFoundException(Long id) {
        super("No hay un museo con ese ID: %d".formatted(id));
    }

    public MuseumNotFoundException() {
        super("No hay museos con esos requisitos de búsqueda");
    }
}
