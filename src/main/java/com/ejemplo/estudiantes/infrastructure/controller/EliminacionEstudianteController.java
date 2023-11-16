package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.EliminacionEstudianteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class EliminacionEstudianteController {

    private final EliminacionEstudianteService eliminacionEstudianteService;

    /**
     * Permite la eliminación de un estudiante a través del método HTTP DELETE
     * Recibe el ID del estudiante en el path. (No requiere body)
     **/
    @DeleteMapping("{id}")
    public void eliminarEstudiante(@PathVariable("id") Long estudianteId){
        eliminacionEstudianteService.eliminarEstudiante(estudianteId);
    }
}
