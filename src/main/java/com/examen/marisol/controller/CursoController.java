package com.examen.marisol.controller;

import com.examen.marisol.entity.Curso;
import com.examen.marisol.service.CursoService;
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
@RequestMapping("/curso")
public class CursoController {

  @Autowired
  private CursoService cursoService;

  @GetMapping("/id/{id}")
  public ResponseEntity<Curso> getById(@PathVariable("id") Integer id) {
    Curso curso = cursoService.getById(id);
    return ResponseEntity.status(HttpStatus.OK).body(curso);
  }

  @PostMapping
  public ResponseEntity<Curso> create(@RequestBody Curso curso) {
    return ResponseEntity.ok().body(cursoService.crate(curso));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Curso> update(@PathVariable("id") Integer id, @RequestBody Curso curso) {
    curso.setId(id);
   Curso updatedCurso = cursoService.update(curso);
    return ResponseEntity.ok().body(updatedCurso);
  }

  @GetMapping("/find")
  public ResponseEntity<List<Curso>> findAll() {
    return ResponseEntity.status(HttpStatus.OK).body(cursoService.findAll());
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteCurso(@PathVariable("id") Integer id) {
    cursoService.deleteCurso(id);
    return ResponseEntity.ok().body("Deleted");
  }


  //Buscada por el Codigo
  @GetMapping("/codigo/{codigo}")
  public ResponseEntity<Curso> findByCodigo(@PathVariable("codigo") int codigo){
    return ResponseEntity.status(HttpStatus.OK).body(cursoService.findByCodigo(codigo));
  }

}
