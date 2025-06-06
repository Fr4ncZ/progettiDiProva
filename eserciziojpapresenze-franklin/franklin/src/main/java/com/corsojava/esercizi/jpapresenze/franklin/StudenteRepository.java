package com.corsojava.esercizi.jpapresenze.franklin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudenteRepository extends JpaRepository<Studente, Long> { 
	
	List<Studente> findByMatricola(String matricola);
	List<Studente> findByCognomeAndNome(String cognome, String nome);
	
}
