package com.examen.marisol.service;

import com.examen.marisol.entity.Estudiante;
import com.examen.marisol.repository.EstudianteRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Service
public class EstudianteServiceImpl implements EstudianteService{

  @Autowired
  private EstudianteRepository estudianteRepository;


  @Override
  public Estudiante getById(long id) {
    return estudianteRepository.findById(id).orElseThrow(()->
        new EntityNotFoundException("Estudiante not found . . ."));
  }

  @Override
  public Estudiante crate(Estudiante estudiante) {
    return estudianteRepository.save(estudiante);
  }

  @Override
  public Estudiante update(Estudiante estudiante) {
    return estudianteRepository.save(estudiante);
  }

  @Override
  public List<Estudiante> findAll() {
    return estudianteRepository.findAll();
  }

  @Override
  public void deleteEstudiante(long id) {
    estudianteRepository.deleteById(id);
  }

  @Override
  public Estudiante findByNombre(String nombre) {
    return estudianteRepository.findByNombre(nombre);
  }

}
