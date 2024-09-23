package com.examen.marisol.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "curso")
public class Curso {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false)
  private int codigo;

  @Column(name = "name",length = 50)
  private String name;

  @Column(length = 50)
  private String duracion;
/*
 @ManyToMany
 @JoinColumn(name="estudiante_id")
 private Curso curso;
 */
}
