package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.CreacionEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class CreacionEstudianteController {

    private final CreacionEstudianteService creacionEstudianteService;

    /**
     * Permite la creación de un estudiante a través del método HTTP POST
     * Recibe como body en el request HTTP un JSON con la información del estudiante.
     **/
    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        log.info("Se va crear un estudiante");
        return creacionEstudianteService.crearEstudiante(estudiante);
    }
}
