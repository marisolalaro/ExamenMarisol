package com.examen.marisol.repository;

import com.examen.marisol.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
  Curso findByCodigo(int codigo);
}
