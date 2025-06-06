package com.corsojava.esercizi.jpapresenze.franklin;

import jakarta.persistence.*;

@Entity
public class Studente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private Long id;
	private String nome;
	private String cognome;  
	private Integer eta; 
	private String dataDiNascita;
	private String matricola;
	private Boolean attivo; 
	   
	
	// overload del costruttore
	public Studente() { 
		super();
		this.id = null;
		this.nome = null; 
		this.eta = -1; 
		this.dataDiNascita = null; // SUL DB: data_di_nascita (snake_case)  
		this.matricola = "N/A";
	}  
	 
 
	 
	public   String getDataDiNascita() {
		return dataDiNascita;
	}

	public   void setDataDiNascita(String dataNascita) {
		this.dataDiNascita = dataNascita;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getEta() {
		return this.eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public Boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public   String getMatricola() {
		return matricola;
	}

	public   void setMatricola(String matricola) {
		this.matricola = matricola;
	}
 
 
	
	
 }
