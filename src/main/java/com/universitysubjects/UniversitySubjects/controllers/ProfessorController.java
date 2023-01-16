package com.universitysubjects.UniversitySubjects.controllers;

import com.universitysubjects.UniversitySubjects.services.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "professores")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PutMapping(path = "{professorId}")
    public void updateProfessorDisciplinaById(@PathVariable("professorId") Long professorId,
                                              @RequestParam(required = true) List<Long> idDisciplinas) {
        professorService.updateProfessorDisciplinaById(professorId, idDisciplinas);
    }
}
