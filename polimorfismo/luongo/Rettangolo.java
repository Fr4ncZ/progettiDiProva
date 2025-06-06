package corsojava.ESERCIZIVARI.polimorfismo.luongo;

public class Rettangolo extends Figura implements FormaGeometrica {

	private double base;
	private double altezza;
	
	public Rettangolo() {
		
		super();

	}

	public Rettangolo(String nome, String colore, double base, double altezza) {
		
		super(nome, colore);
		
		this.base = base;
		this.altezza = altezza;
		
	}
	
	public double getBase() {
		
		return base;
		
	}

	public void setBase(double base) {
		
		this.base = base;
		
	}

	public double getAltezza() {
		
		return altezza;
		
	}

	public void setAltezza(double altezza) {
		
		this.altezza = altezza;
		
	}

	@Override
	public double calcolaArea() {
		
		return base * altezza;
		
	}
	
	@Override
	public double calcolaPerimetro() {
		
		return (base + altezza) * 2;
		
	}

	@Override
	public String mostraInfo() {
		
		return super.mostraInfo()+": "+getBase()+", "+getAltezza();
		
	}
	
}
