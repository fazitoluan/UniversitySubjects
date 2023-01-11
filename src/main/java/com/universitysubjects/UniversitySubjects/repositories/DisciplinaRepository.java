package com.universitysubjects.UniversitySubjects.repositories;

import com.universitysubjects.UniversitySubjects.entities.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    @Query("SELECT d FROM Disciplina d WHERE d.codigo = ?1")
    Optional<Disciplina> findDisciplinaByCodigo(String codigo);

    @Query("SELECT COUNT(d) FROM Disciplina d WHERE d.codigo = ?1")
    Integer verifyCodigoDisciplina(String codigo);

    @Query("SELECT SUM(d.creditos) FROM Disciplina d")
    Integer sumCreditosTotal();

    @Query("SELECT SUM(p.peso * d.creditos) " +
            "FROM Disciplina d " +
            "INNER JOIN Peso p ON p.conceito = d.conceito")
    Integer sumPesoMultByCreditoTotal();

    @Query("SELECT SUM(d.creditos) FROM Disciplina d " +
            "WHERE d.ano NOT IN (2020) " +
                "AND (d.ano <> 2021 OR (d.periodo NOT IN ('1', '2')))")
    Integer sumCreditosEspecial();

    @Query("SELECT SUM(p.peso * d.creditos) FROM Disciplina d " +
            "INNER JOIN Peso p ON p.conceito = d.conceito " +
            "WHERE d.ano NOT IN (2020) " +
                "AND (d.ano <> 2021 OR (d.periodo NOT IN ('1', '2')))")
    Integer sumPesoMultByCreditoEspecial();
}
