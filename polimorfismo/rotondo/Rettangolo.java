package corsojava.ESERCIZIVARI.polimorfismo.rotondo;
public class Rettangolo extends Figura implements FormaGeometrica {
	
    private double base;
    private double altezza;

    public Rettangolo(String colore, double base, double altezza) {
        super("Rettangolo", colore);
        this.base = base;
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
        System.out.println("Base: " + base + ", Altezza: " + altezza);
    }

}
