package corsojava.ESERCIZIVARI.polimorfismo.rotondo;
public class TestFormeGeometriche {
	
    public static void main(String[] args) {
        FormaGeometrica[] forme = new FormaGeometrica[3];

        forme[0] = new Cerchio("Rosso", 5);
        forme[1] = new Rettangolo("Blu", 4, 7);
        forme[2] = new Triangolo("Verde", 3, 4, 5);

        for (FormaGeometrica forma : forme) {

        	
            if (forma instanceof Figura) {
                ((Figura) forma).mostraInfo();
            }

            
            System.out.println("Area: " + forma.calcolaArea());
            System.out.println("Perimetro: " + forma.calcolaPerimetro());
            System.out.println("---------------------------");
            
        }
    }
}
