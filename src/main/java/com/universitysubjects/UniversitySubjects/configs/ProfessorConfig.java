package com.universitysubjects.UniversitySubjects.configs;

import com.universitysubjects.UniversitySubjects.entities.Professor;
import com.universitysubjects.UniversitySubjects.repositories.PesoRepository;
import com.universitysubjects.UniversitySubjects.repositories.ProfessorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class ProfessorConfig {
/*
    @Bean
    CommandLineRunner commandLineRunner(ProfessorRepository professorRepository) {
        int anoRef = 1900;
        return args -> {

            Professor Anderson = new Professor(
                    "Anderson Orsari",
                    new Date(2000-anoRef, 11, 21)
            );

            Professor Bruna = new Professor(
                    "Bruna Fernandes",
                    new Date(1999-anoRef, 12, 21)
            );

            Professor Claudio = new Professor(
                    "Claudio Wer",
                    new Date(2000-anoRef, 1, 12)
            );

            Professor Nando = new Professor(
                    "Nando Tsari",
                    new Date(1989-anoRef, 3, 4)
            );

            Professor Mario = new Professor(
                    "Mario Koyo",
                    new Date(1940-anoRef, 1, 2)
            );
            professorRepository.saveAll(List.of(Anderson, Bruna, Claudio, Nando, Mario));
        };
    }*/
}
