package com.salesianostriana.dam.ejercicioevaluacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public record MuseoRequestDTO(Long id, String nombre, String ciudad, String apertura, int salas, String descripcion) {


}