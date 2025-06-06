package com.corsojava.esercizi.jpapresenze.franklin;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudenteService {
	 
	private final StudenteRepository repository;	
	
    public StudenteService(StudenteRepository repository) {
    	super();
        this.repository = repository; 
    }
    
	public Studente addStudente(Studente s) {
		s.setId(null);
		return repository.save(s);
	}
	

	public Studente modStudente(Long id, Studente s) {		
		if (! repository.existsById(id)) return null;
		s.setId(id);
		return repository.save(s);
	}
	

	public Studente findById(Long id) {		
		return repository.findById(id).orElse(null);
	}
	
	public Studente findByMatricola(String matricola) {
		List<Studente> list = repository.findByMatricola(matricola);
		if (list.size()>0) return list.get(0); else return null;
	}
	
	public Studente delStudente(String matricola) {
		Studente s = this.findByMatricola(matricola);
		if (s != null) repository.delete(s);
		return s; 
	}

	public Studente delStudente(Long id) { 
		Studente s = repository.findById(id).orElse(null);		
		if (s != null) repository.delete(s);
		return s; 
	}
	
	public List<Studente> getStudenti() {
		return repository.findAll();
	}
	
  
	

}
