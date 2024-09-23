package com.examen.marisol.service;

import com.examen.marisol.entity.Curso;
import com.examen.marisol.repository.CursoRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Getter
@Setter
@Service
public class CursoServiceImpl implements CursoService{

  @Autowired
  private CursoRepository cursoRepository;
  @Override
  public Curso getById(long id) {
    return cursoRepository.findById(id).orElseThrow(()->
        new EntityNotFoundException("Curso not found . . ."));
  }

  @Override
  public Curso crate(Curso curso) {
    return cursoRepository.save(curso);
  }

  @Override
  public Curso update(Curso curso) {
    return cursoRepository.save(curso);
  }

  @Override
  public List<Curso> findAll() {
    return cursoRepository.findAll();
  }

  @Override
  public void deleteCurso(long id) {
    cursoRepository.deleteById(id);
  }

  @Override
  public Curso findByCodigo(int codigo) {
    return cursoRepository.findByCodigo(codigo);
  }

}
