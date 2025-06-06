package corsojava.ESERCIZIVARI.polimorfismo.rotondo;
public class Triangolo extends Figura implements FormaGeometrica {
	
    private double latoA;
    private double latoB;
    private double latoC;

    public Triangolo(String colore, double latoA, double latoB, double latoC) {
        super("Triangolo", colore);
        this.latoA = latoA;
        this.latoB = latoB;
        this.latoC = latoC;
    }

    @Override
    public double calcolaPerimetro() {
        return latoA + latoB + latoC;
    }

    @Override
    public double calcolaArea() {
        double s = calcolaPerimetro() / 2.0;
        return Math.sqrt(s * (s - latoA) * (s - latoB) * (s - latoC));
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Lati: " + latoA + ", " + latoB + ", " + latoC);
    }
    
}
