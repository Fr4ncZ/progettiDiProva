package corsojava.ESERCIZIVARI.polimorfismo.levorato;

public class Cerchio extends Figura implements FormaGeometrica {
	private double raggio;

	public Cerchio(String colore, double raggio) {
		super("Cerchio", colore);
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
		return Math.PI * raggio * raggio;
	}

	@Override
	public double calcolaPerimetro() {
		return 2 * Math.PI * raggio;
	}
	
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Ed ha raggio: " + raggio);
    }

}
