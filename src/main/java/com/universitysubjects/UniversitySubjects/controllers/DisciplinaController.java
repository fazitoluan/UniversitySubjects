package com.universitysubjects.UniversitySubjects.controllers;

import com.universitysubjects.UniversitySubjects.entities.Disciplina;
import com.universitysubjects.UniversitySubjects.entities.Professor;
import com.universitysubjects.UniversitySubjects.services.DisciplinaService;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @GetMapping(path = "disciplinas")
    public List<Disciplina> getDisciplinas() {
        return disciplinaService.getDisciplinas();
    }

    @PostMapping
    public void addDisciplina(@RequestBody Disciplina disciplina) {
        disciplinaService.addDisciplina(disciplina);
    }

    @GetMapping(path = "totalCreditos")
    public Integer showTotalCreditos() {
        return disciplinaService.showTotalCreditos();
    }

    @GetMapping(path = "totalPesoCred")
    public Integer showTotalPesoMultCreditos() {
        return disciplinaService.showTotalPesoMultCreditos();
    }

    @GetMapping(path = "cr_total")
    public Double showCoeficienteRendimentoTotal() {
        return disciplinaService.showCoeficienteRendimentoTotal();
    }

    @GetMapping(path = "cr_especial")
    public Double showCoeficienteRendimentoEspecial() {
        return disciplinaService.showCoeficienteRendimentoEspecial();
    }

    @GetMapping(path = "{codigo}/professor")
    public Professor getProfessorByCodigo(@PathVariable("codigo") String codigo) {
        return disciplinaService.getProfessorByCodigo(codigo);
    }

    @GetMapping(path = "codigo/{codigo}")
    public Optional<Disciplina> getDisciplinaByCodigo(@PathVariable("codigo") String codigo) {
        return disciplinaService.getDisciplinaByCodigo(codigo);
    }

    @PutMapping(path = "{codigo}")
    public void updateGrade(@PathVariable("codigo") String codigoDisciplina,
                            @RequestParam Character conceito) {
        disciplinaService.updateGrade(codigoDisciplina, conceito);
    }

    @DeleteMapping(path = "{codigo}")
    public void deleteDisciplina(@PathVariable String codigo) {
        disciplinaService.deleteDisciplina(codigo);
    }

}
