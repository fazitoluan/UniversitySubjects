package com.universitysubjects.UniversitySubjects.configs;

import com.universitysubjects.UniversitySubjects.entities.Peso;
import com.universitysubjects.UniversitySubjects.repositories.PesoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PesoConfig {

    @Bean
    CommandLineRunner commandLineRunner(PesoRepository pesoRepository) {
        return args -> {
            /*Peso A = new Peso(
                    'A',
                    4
            );

            Peso B = new Peso(
                    'B',
                    3
            );

            Peso C = new Peso(
                    'C',
                    2
            );

            Peso D = new Peso(
                    'D',
                    1
            );

            Peso F = new Peso(
                    'F',
                    0
            );

            Peso O = new Peso(
                    'O',
                    0
            );

            Peso traco = new Peso(
                    '-',
                    0
            );

            pesoRepository.saveAll(List.of(A, B, C, D, F, O, traco));*/
        };
    }
}
