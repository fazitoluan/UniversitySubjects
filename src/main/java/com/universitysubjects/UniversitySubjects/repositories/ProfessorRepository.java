package com.universitysubjects.UniversitySubjects.repositories;
import com.universitysubjects.UniversitySubjects.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    @Query("SELECT p FROM Professor p WHERE p.id = ?1")
    Optional<Professor> findProfessorById(Long idProfessor);
}
