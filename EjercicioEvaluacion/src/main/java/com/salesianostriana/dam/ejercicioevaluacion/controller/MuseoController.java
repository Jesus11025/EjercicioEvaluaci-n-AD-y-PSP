package com.salesianostriana.dam.ejercicioevaluacion.controller;

import com.salesianostriana.dam.ejercicioevaluacion.error.MuseumNotFoundException;
import com.salesianostriana.dam.ejercicioevaluacion.model.Museo;
import com.salesianostriana.dam.ejercicioevaluacion.repository.MuseoRepository;
import com.salesianostriana.dam.ejercicioevaluacion.service.MuseoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("museo")
@Tag(name = "servicioController",description = "Aqui se hace todas las funcionalidades de Museos")
public class MuseoController {

    @Autowired
    MuseoService museoService;
    @Autowired
    private MuseoRepository museoRepository;

    @Tag(name = "obtener todo")
    @GetMapping("")
    public List<Museo> obtenerMuseos() {
        return museoService.findAll();
    }

    @Tag(name = "Buscar por ID")
    @GetMapping("/{id}")
    public Museo buscarMuseoID(Long idMuseo) {
        if (museoService.findById(idMuseo) != null) {
            return museoService.findById(idMuseo);
        } else {
            throw new MuseumNotFoundException("Museo no encontrado");
        }
    }

    @Tag(name = "Crear nuevo museo")
    @PostMapping("")
    public void crearMuseo(Model model, Museo nuevoMuseo) {

       museoService.save(nuevoMuseo);

    }

    @Tag(name = "Actualizar el museo por ID")
    @PutMapping("/{id}")
    public void actualizarMuseo (Long id) {
//        museoService.edit
    }

    @Tag(name = "Eliminar museo")
    @DeleteMapping("{id}")
    public void eliminarMuseo(Long id) {
        museoService.delete(id);
    }

}
