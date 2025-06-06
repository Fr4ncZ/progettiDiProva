package corsojava.ESERCIZIVARI.polimorfismo.levorato;

public class Rettangolo extends Figura implements FormaGeometrica {
    private double base;
    private double altezza;

	public Rettangolo(String colore, double base, double altezza) {
		super("Rettangolo", colore);
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
		return 2 * (base + altezza);
	}

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Ed ha base: " + base + " e altezza: " + altezza);
    }
}
