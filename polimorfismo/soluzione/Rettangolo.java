package corsojava.ESERCIZIVARI.polimorfismo.soluzione;

public class Rettangolo extends Figura implements FormaGeometrica {
    private double base;
    private double altezza;

    public Rettangolo() {
    	this.base = -1;
    	this.altezza= -1;
    }
    	
    
	public Rettangolo(String colore, double base, double altezza) {
		super("Rettangolo", colore);
		this.base = base;
		this.altezza = altezza;
		verificaFigura();
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
		verificaFigura();
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
		verificaFigura();
	}
	

	@Override
	public double calcolaArea() {
		if(!isValido()) {
			System.out.println("Errore: Rettangolo non valido");
			return -1;
		}
		return base * altezza;
	}

	@Override
	public double calcolaPerimetro() {
		if(!isValido()) {
			System.out.println("Errore: Rettangolo non valido");
			return -1;
		}
		return 2 * (base + altezza);
	}

    @Override
    public void mostraInfo() {		
	    if(!isValido()) {
			System.out.println("Errore: Rettangolo non valido");
		}
        super.mostraInfo();
        System.out.println("Ed ha base: " + base + " e altezza: " + altezza);
    }
    

	@Override
	public boolean verificaFigura() { 
		boolean valido = true;
		if (base <= 0 || altezza <= 0 ) {
			System.out.println("Base e altezza devono essere positive");
			valido = false;
		}
		setValido(valido);
		return valido;
	}
}
