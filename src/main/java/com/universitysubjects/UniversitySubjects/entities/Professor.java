package com.universitysubjects.UniversitySubjects.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tb_professores")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date bornDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<Disciplina> disciplinaList;

}
