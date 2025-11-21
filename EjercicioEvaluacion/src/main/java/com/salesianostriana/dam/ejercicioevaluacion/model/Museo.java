package com.salesianostriana.dam.ejercicioevaluacion.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Museo {

    @Id
    @GeneratedValue
    Long id;

    String nombre;
    String ciudad;
//    Podría ser localtime pero he querido ir mas a lo seguro
    String apertura;
    int numSalas;
    String descripcion;
    String urlWeb;
    String urlImg;


}
