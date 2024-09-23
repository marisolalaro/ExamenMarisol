package com.examen.marisol.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "seguro_social", length = 50)
    private String seguroSocial;
/*
  @ManyToMany(mappedBy="estudiante")
  @JsonIgnore
   private List<Curso>cursos;
}

 */
}


