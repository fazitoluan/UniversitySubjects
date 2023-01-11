package com.universitysubjects.UniversitySubjects.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "coeficientes")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String situacao;
    private String categoria;
    private String periodo;
    private Integer ano;
    private String disciplina;
    private Integer creditos;
    private Character conceito;
    private String codigo;

}
