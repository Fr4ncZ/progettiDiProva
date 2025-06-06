package corsojava.ESERCIZIVARI.polimorfismo.soluzione;

public class Cerchio extends Figura implements FormaGeometrica {
	private double raggio;

	
	public Cerchio() {
		super();
		this.raggio = -1;
	}
	
	public Cerchio(String colore, double raggio) {
		super("Cerchio", colore);
		this.raggio = raggio;
		verificaFigura();
	}
	
	public double getRaggio() {
		return raggio;
	}
	public void setRaggio(double raggio) {
		this.raggio = raggio;
		verificaFigura();
	}


	@Override
	public double calcolaArea() {
		return Math.PI * raggio * raggio;
	}

	@Override
	public double calcolaPerimetro() {
		return 2 * Math.PI * raggio;
	}
	
    @Override
    public void mostraInfo() {		
    	if(!isValido()) {
			System.out.println("Errore: Cerchio non valido");		
		}
        super.mostraInfo();
        System.out.println("Ed ha raggio: " + raggio);
    }

	@Override
	public boolean verificaFigura() { 
		boolean valido = true;
		if (raggio <= 0) {
			System.out.println("Il raggio deve essere positivo");
			valido = false;
		}
		setValido(valido);
		return valido;
	}

}
