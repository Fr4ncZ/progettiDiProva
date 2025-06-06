package corsojava.ESERCIZIVARI.polimorfismo.rotondo;
public class Cerchio extends Figura implements FormaGeometrica {
	
    private double raggio;

    public Cerchio(String colore, double raggio) {
        super("Cerchio", colore);
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
        System.out.println("Raggio: " + raggio);
    }
    
}
