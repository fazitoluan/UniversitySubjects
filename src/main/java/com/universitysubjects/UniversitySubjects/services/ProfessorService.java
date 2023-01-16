package com.universitysubjects.UniversitySubjects.services;

import com.universitysubjects.UniversitySubjects.entities.Disciplina;
import com.universitysubjects.UniversitySubjects.entities.Professor;
import com.universitysubjects.UniversitySubjects.repositories.DisciplinaRepository;
import com.universitysubjects.UniversitySubjects.repositories.ProfessorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @Transactional
    public void updateProfessorDisciplinaById(Long professorId, List idDisciplinas) {
        Professor professor = professorRepository.findProfessorById(professorId).get();
        professor.setDisciplinaList(idDisciplinas);
    }
}
