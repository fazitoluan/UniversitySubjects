package com.universitysubjects.UniversitySubjects.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "peso_creditos")
public class Peso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Character conceito;
    private Integer peso;

    public Peso(Character conceito, Integer peso) {
        this.conceito = conceito;
        this.peso = peso;
    }
}
