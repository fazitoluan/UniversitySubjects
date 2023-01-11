package com.universitysubjects.UniversitySubjects.repositories;

import com.universitysubjects.UniversitySubjects.entities.Peso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesoRepository extends JpaRepository<Peso, Long> {
}
