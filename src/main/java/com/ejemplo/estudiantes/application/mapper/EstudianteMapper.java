package com.ejemplo.estudiantes.application.mapper;

import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Se requiere para generar en tiempo de compilación los mapeadores del dominio a entidad y entidad a dominio.
 * Con esto ya no es necesario llamar los builders manualmente en el código.
 * Para ser uso de estos mapeadores es necesario el uso de la dependencia mapstructs en el pom.xml.
 */
@Mapper
public interface EstudianteMapper {

    EstudianteMapper INSTANCE = Mappers.getMapper(EstudianteMapper.class);

    EstudianteEntity mapToEntity(Estudiante estudiante);

    Estudiante mapToDomain(EstudianteEntity estudianteEntity);
}
