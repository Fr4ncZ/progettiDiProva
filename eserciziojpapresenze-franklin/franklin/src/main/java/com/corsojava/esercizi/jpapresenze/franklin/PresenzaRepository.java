package com.corsojava.esercizi.jpapresenze.franklin;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface PresenzaRepository extends JpaRepository<Presenza, Long> {
    List<Presenza> findByIdStudenteAndDataBetweenAndStato(Long idStudente, LocalDate dataInizio, LocalDate dataFine, String stato);
    List<Presenza> findByIdStudenteAndDataAndStato(Long idStudente, LocalDate data, String stato);
    List<Presenza> findByIdStudenteAndData(Long idStudente, LocalDate data);
    List<Presenza> findByDataBetweenAndStato(LocalDate dataInizio, LocalDate dataFine, String stato);
    List<Presenza> findByIdStudente(Long idStudente);
}