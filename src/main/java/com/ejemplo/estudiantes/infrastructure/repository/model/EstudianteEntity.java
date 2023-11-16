package com.ejemplo.estudiantes.infrastructure.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "estudiante")
@Data // Agrega los getters, setters, equals, hashcode, toString a la clase
@Builder //Agrega el builder a la clase
@NoArgsConstructor //Agrega el constructor que no tiene parámetros
@AllArgsConstructor //Agrega el constructor que recibe TODOS los parámetros
public class EstudianteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;
}
