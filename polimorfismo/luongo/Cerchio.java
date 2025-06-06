package corsojava.ESERCIZIVARI.polimorfismo.luongo;

public class Cerchio extends Figura implements FormaGeometrica {

	private double raggio;
	
	public Cerchio() {
		
		super();

	}

	public Cerchio(String nome, String colore, double raggio) {
		
		super(nome, colore);
		
		this.raggio = raggio;
		
	}

	public double getRaggio() {
		
		return raggio;
		
	}

	public void setRaggio(double raggio) {
		
		this.raggio = raggio;
		
	}

	@Override
	public double calcolaArea() {
		
		return Math.PI * Math.pow(raggio, 2);
		
	}
	
	@Override
	public double calcolaPerimetro() {
		
		return 2 * Math.PI * raggio;
		
	}

	@Override
	public String mostraInfo() {
		
		return super.mostraInfo()+": "+getRaggio();
		
	}
	
}
