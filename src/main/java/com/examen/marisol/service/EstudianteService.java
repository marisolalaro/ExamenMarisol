package com.examen.marisol.service;

import com.examen.marisol.entity.Estudiante;
import java.util.List;


public interface EstudianteService {

Estudiante getById(long id);
Estudiante crate(Estudiante estudiante);
Estudiante update(Estudiante estudiante);
List<Estudiante> findAll();
void deleteEstudiante(long id);

Estudiante findByNombre(String nombre);
}
