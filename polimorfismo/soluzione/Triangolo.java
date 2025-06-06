package corsojava.ESERCIZIVARI.polimorfismo.soluzione;
/*
 Assunzioni

 1. il triangolo deve essere valido, ovvero un lato non può essere 
    uguale o superiore alla somma di due lati
    
 2. in caso di triangolo non valido i lati vengono valorizzati a -1    


*/
public class Triangolo extends Figura implements FormaGeometrica {
	private double latoA;
	private double latoB;
	private double latoC;
	public Triangolo() {
		super();
        this.latoA = -1;
        this.latoB = -1;
        this.latoC = -1; 
	}
	
	public Triangolo(String colore, double latoA, double latoB, double latoC) {
		super("Triangolo", colore);
			
            this.latoA = latoA;
            this.latoB = latoB;
            this.latoC = latoC;
            verificaFigura();
        
	}
	
	public double getLatoA() {
		return latoA;
	}
	public void setLatoA(double latoA) {
		this.latoA = latoA;
		verificaFigura();
	}
	public double getLatoB() {
		return latoB;
	}
	public void setLatoB(double latoB) {
		this.latoB = latoB;
		verificaFigura();
	}
	public double getLatoC() {
		return latoC;
	}
	public void setLatoC(double latoC) {
		this.latoC = latoC;
		verificaFigura();
	}
	
	
	// - verifica che il triangolo sia valido 
	// -1
	@Override
	public boolean verificaFigura() {
		boolean valido = true;
		if (this.latoA <= 0 || this.latoB <= 0 || this.latoC <= 0) {
			System.out.println("I lati del triangolo devono essere positivi");
			valido = false; 
        } else if (this.latoA + this.latoB <= this.latoC || this.latoA + this.latoC <= latoB || this.latoB + latoC <= latoA){
        	System.out.println("I lati non formano un triangolo valido");
        	valido = false;
        }
		if (! valido ) {
	        this.latoA = -1;
	        this.latoB = -1;
	        this.latoC = -1;
		}
		setValido(valido);
		return valido;
	}

	@Override
	public double calcolaPerimetro() {
		if(!isValido()) {
			System.out.println("Errore: triangolo non valido, impossibile calcolare il perimetro.");
			return -1;
		}
		return latoA + latoB + latoC;
	}
	
	@Override
	public double calcolaArea() {
		if(!isValido()) {
			System.out.println("Errore: triangolo non valido, impossibile calcolare l'area.");
			return -1;
		}
		double s = calcolaPerimetro() / 2;
	    return Math.sqrt(s * (s - latoA) * (s - latoB) * (s - latoC));
	}

	@Override
    public void mostraInfo() {
        if (!isValido()) {
            System.out.println("Errore: triangolo non valido, impossibile mostrare le informazioni.");
            return;
        }
        super.mostraInfo();
        System.out.println("Ed ha i lati: " + latoA + ", " + latoB + ", " + latoC);
    }
}
