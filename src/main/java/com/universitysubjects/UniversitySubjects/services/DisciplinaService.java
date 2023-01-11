package com.universitysubjects.UniversitySubjects.services;

import com.universitysubjects.UniversitySubjects.entities.Disciplina;
import com.universitysubjects.UniversitySubjects.repositories.DisciplinaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;

    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinaRepository.findAll();
    }

    public void addDisciplina(Disciplina disciplina) {
        Optional<Disciplina> disciplinaByCodigo = disciplinaRepository.findDisciplinaByCodigo(disciplina.getCodigo());
        if (disciplinaByCodigo.isPresent()) {
            throw new IllegalStateException("A Disciplina de id "
                    + disciplinaByCodigo.get().getId()
                    + " ja esta cadastrada com o codigo "
                    + disciplina.getCodigo());
        }
        disciplinaRepository.save(disciplina);
    }

    public void deleteDisciplina(String codigo) {
        if (disciplinaRepository.verifyCodigoDisciplina(codigo) < 1) {
            throw new IllegalStateException("Disciplina with Codigo " + codigo + " does not exists!!");
        }
        Optional<Disciplina> disciplinaByCodigo = disciplinaRepository.findDisciplinaByCodigo(codigo);
        disciplinaRepository.deleteById(disciplinaByCodigo.get().getId());
    }

    public Integer showTotalCreditos() {
        return disciplinaRepository.sumCreditosTotal();
    }

    public Integer showTotalPesoMultCreditos() {
        return disciplinaRepository.sumPesoMultByCreditoTotal();
    }

    public Double showCoeficienteRendimentoTotal() {
        return ((double) disciplinaRepository.sumPesoMultByCreditoTotal()) / disciplinaRepository.sumCreditosTotal();
    }

    public Double showCoeficienteRendimentoEspecial() {
        return ((double) disciplinaRepository.sumPesoMultByCreditoEspecial()) / disciplinaRepository.sumCreditosEspecial();
    }

    @Transactional
    public void updateGrade(String codigoDisciplina, Character conceito) {
        if (disciplinaRepository.verifyCodigoDisciplina(codigoDisciplina) < 1) {
            throw new IllegalStateException("Disciplina with Codigo " + codigoDisciplina + " does not exists!!");
        }
        Disciplina disciplina = disciplinaRepository.findDisciplinaByCodigo(codigoDisciplina).get();
        disciplina.setConceito(conceito);
    }

}
