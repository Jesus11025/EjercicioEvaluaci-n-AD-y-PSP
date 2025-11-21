package com.salesianostriana.dam.ejercicioevaluacion.service;

import com.salesianostriana.dam.ejercicioevaluacion.dto.MuseoRequestDTO;
import com.salesianostriana.dam.ejercicioevaluacion.dto.MuseoResponseDto;
import com.salesianostriana.dam.ejercicioevaluacion.error.InvalidMuseumDataException;
import com.salesianostriana.dam.ejercicioevaluacion.error.MuseumNotFoundException;
import com.salesianostriana.dam.ejercicioevaluacion.model.Museo;
import com.salesianostriana.dam.ejercicioevaluacion.repository.MuseoRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
@Tag(name = "servicioMuseo",description = "Servicio Museo")
public class MuseoService {

    private MuseoRepository museoRepository;

    public List<Museo> findAll() {
        List resultado = museoRepository.findAll();

        if(resultado.isEmpty()) {
            throw new InvalidMuseumDataException();
        }
        return resultado;
    }

    public Museo findById(Long id) {
        return museoRepository.findById(id)
                .orElseThrow(() -> new MuseumNotFoundException());
    }

    public Museo save (Museo museo) {
        return museoRepository.save(museo);
    }

//    public Museo edit (Museo museo) {
//
//     }


    public void delete(Long id) {
        museoRepository.deleteById(id);
    }


}
