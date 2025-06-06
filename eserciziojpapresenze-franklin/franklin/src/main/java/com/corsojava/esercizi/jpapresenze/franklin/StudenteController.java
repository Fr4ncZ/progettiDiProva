package com.corsojava.esercizi.jpapresenze.franklin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studente")
public class StudenteController {
	
  private final StudenteService service;
    
    public StudenteController(StudenteService service) {
    	super();
        this.service = service;
    }
	 
    
    /***************************************************************************************
     * 
     *   G E T   /  c R u d
     */    
    @GetMapping("/{id}")
    public Studente stud(@PathVariable Long id) {
    	return service.findById(id);
    }


	// @RequestMapping(value="/fet-studente", method=RequestMethod.GET)
	// equivale a:
	@GetMapping("/")
	public List<Studente> studList( @RequestParam(value="matricola", required=false) String mat ) {
		 
		if (mat != null) {
			List<Studente> arrNew = new ArrayList<>();
			Studente s = service.findByMatricola(mat);
			if (s!=null) arrNew.add(s);
			return arrNew;
			
		}
		return service.getStudenti();
	}
	
	  /***************************************************************************************
     * 
     *   P O S T   /  C r u d
     */ 
	
	@PostMapping("/addStudente")
	public Studente studAdd(@RequestBody Studente s) {
		return service.addStudente(s);
	}
	
	  /***************************************************************************************
     * 
     *   P U T  /  c r U d
     */ 


	@PutMapping("/{id}")
	public Studente studMod(@RequestBody Studente s, @PathVariable Long id) {
		return service.modStudente(id, s);
	}

	  /***************************************************************************************
     * 
     *   D E L E T E   /  c r u D
     */ 


	@DeleteMapping("/{id}")
	public Studente studdel( @PathVariable Long id) {
		return service.delStudente(id);
	}

	
  /***************************************************************************************/


	
	
	
	 @RequestMapping("/home2")	    
	    public String home2() {
	    	String s =
	    	"\n ----------------------------------------- " +
	    	"\n THIS IS HOME2!!!" +
	    	"\n ----------------------------------------- \n";
	    	System.out.print(s);
	        return s;
	    } 
	
}
