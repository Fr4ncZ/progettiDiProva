package corsojava.ESERCIZIVARI.polimorfismo.luongo;

public class Triangolo extends Figura implements FormaGeometrica {

	private double latoA;
	private double latoB;
	private double latoC;
	
	public Triangolo() {
		
		super();

	}

	public Triangolo(String nome, String colore, double latoA, double latoB, double latoC) {
		
		super(nome, colore);
		
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
		
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

	@Override
	public double calcolaArea() {
		
		double s = calcolaPerimetro() / 2;
		
		return Math.sqrt(s * (s - latoA) * (s - latoB) * (s - latoC));
		
	}
	
	@Override
	public double calcolaPerimetro() {
		
		return latoA + latoB + latoC;
		
	}
	
	@Override
	public String mostraInfo() {
		
		return super.mostraInfo()+": "+getLatoA()+", "+getLatoB()+", "+getLatoC();
		
	}
	
}
