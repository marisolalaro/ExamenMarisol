package com.examen.marisol.service;

import com.examen.marisol.entity.Curso;
import java.util.List;

public interface CursoService {

  Curso getById(long id);
  Curso crate(Curso curso);
  Curso update(Curso curso);
  List<Curso> findAll();
  void deleteCurso(long id);

 Curso findByCodigo(int codigo);
}
