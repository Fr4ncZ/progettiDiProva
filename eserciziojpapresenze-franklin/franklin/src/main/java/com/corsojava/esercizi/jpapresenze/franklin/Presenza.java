package com.corsojava.esercizi.jpapresenze.franklin;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Presenza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idStudente;

    private LocalDate data;

    private String stato;  // "PRESENTE" o "ASSENTE"

    private String nota;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdStudente() { return idStudente; }
    public void setIdStudente(Long idStudente) { this.idStudente = idStudente; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getStato() { return stato; }
    public void setStato(String stato) { this.stato = stato; }

    public String getNota() { return nota; }
    public void setNota(String nota) { this.nota = nota; }
}