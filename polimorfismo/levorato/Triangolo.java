package corsojava.ESERCIZIVARI.polimorfismo.levorato;

public class Triangolo extends Figura implements FormaGeometrica {
	private double latoA;
	private double latoB;
	private double latoC;
	private boolean valido;
	
	public Triangolo(String colore, double latoA, double latoB, double latoC) {
		super("Triangolo", colore);
		
			
            this.latoA = latoA;
            this.latoB = latoB;
            this.latoC = latoC;
            verificaTriangolo();
        
	}
	
	public double getLatoA() {
		return latoA;
	}
	public void setLatoA(double latoA) {
		this.latoA = latoA;
	}
	public double getLatoB() {
		return latoB;
	}
	public void setLatoB(double latoB) {
		this.latoB = latoB;
	}
	public double getLatoC() {
		return latoC;
	}
	public void setLatoC(double latoC) {
		this.latoC = latoC;
	}
	
	private boolean verificaTriangolo() {
		valido = true;
		if (latoA <= 0 || latoB <= 0 || latoC <= 0) {
			System.out.println("I lati del triangolo devono essere positivi");
			valido = false;
        } else if (latoA == latoB || latoA == latoC || latoB == latoC) {
        	System.out.println("I lati del triangolo devono essere diversi per essere scaleno");
        	valido = false;
        } else if (latoA + latoB <= latoC || latoA + latoC <= latoB || latoB + latoC <= latoA){
        	System.out.println("I lati non formano un triangolo valido");
        	valido = false;
        }
		return valido;
	}

	@Override
	public double calcolaPerimetro() {
		if(!valido) {
			System.out.println("Errore: triangolo non valido");
			return 0d;
		}
		return latoA + latoB + latoC;
	}
	
	@Override
	public double calcolaArea() {
		if(!valido) {
			System.out.println("Errore: triangolo non valido");
			return 0d;
		}
		double s = calcolaPerimetro() / 2;
	    return Math.sqrt(s * (s - latoA) * (s - latoB) * (s - latoC));
	}

	@Override
    public void mostraInfo() {
        if (!valido) {
            System.out.println("Errore: triangolo non valido, impossibile mostrare le informazioni.");
            return;
        }
        super.mostraInfo();
        System.out.println("Ed ha i lati: " + latoA + ", " + latoB + ", " + latoC);
    }
}
