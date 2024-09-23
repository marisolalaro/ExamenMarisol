package com.examen.marisol.controller;

import com.examen.marisol.entity.Estudiante;
import com.examen.marisol.service.EstudianteService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

  @Autowired
  private EstudianteService estudianteService;

  @GetMapping("/id/{id}")
  public ResponseEntity<Estudiante> getById(@PathVariable("id") Integer id) {
    Estudiante estudiante = estudianteService.getById(id);
    return ResponseEntity.status(HttpStatus.OK).body(estudiante);
  }

  @PostMapping
  public ResponseEntity<Estudiante> create(@RequestBody Estudiante estudiante) {
    return ResponseEntity.ok().body(estudianteService.crate(estudiante));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Estudiante> update(@PathVariable("id") Integer id, @RequestBody Estudiante estudiante) {
    estudiante.setId(id);
    Estudiante updatedEstudiante = estudianteService.update(estudiante);
    return ResponseEntity.ok().body(updatedEstudiante);
  }

  @GetMapping("/find")
  public ResponseEntity<List<Estudiante>> findAll() {
    return ResponseEntity.status(HttpStatus.OK).body(estudianteService.findAll());
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteEstudiante(@PathVariable("id") Integer id) {
    estudianteService.deleteEstudiante(id);
    return ResponseEntity.ok().body("Deleted");
  }
  //Buscada por el Nombre
  @GetMapping("/name/{nombre}")
  public ResponseEntity<Estudiante> findByNombre(@PathVariable("nombre") String nombre){
    return ResponseEntity.status(HttpStatus.OK).body(estudianteService.findByNombre(nombre));
  }

}