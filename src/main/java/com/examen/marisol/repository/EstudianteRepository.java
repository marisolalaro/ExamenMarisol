package com.examen.marisol.repository;

import com.examen.marisol.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository <Estudiante, Long> {
  Estudiante findByNombre(String nombre);

}
