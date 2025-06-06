package corsojava.ESERCIZIVARI.polimorfismo.soluzione;

public class TestFormeGeometriche {

	public static void main(String[] args) {
		FormaGeometrica cerchio = new Cerchio("Rosso", 5.0);
        FormaGeometrica rettangolo = new Rettangolo("Bianco", 4.0, 3.0);
        //Casistica con errore
        //FormaGeometrica triangolo = new Triangolo("Verde", 3.0, 3.0, 5.0); 
        //Casistica senza errore
        FormaGeometrica triangolo = new Triangolo("Verde", 3.0, 4.0, 12.0); 


        //((Rettangolo) rettangolo).setAltezza(0);
        
        
        FormaGeometrica[] forme = { cerchio, rettangolo, triangolo };

        for (FormaGeometrica forma : forme) {
            if (forma instanceof Figura) {
                ((Figura) forma).mostraInfo();
            }
            
            if(forma.calcolaArea() != 0d && forma.calcolaPerimetro() != 0d) {
            System.out.println("L'area della forma è: " + forma.calcolaArea());
            System.out.println("Il perimetro della forma è: " + forma.calcolaPerimetro());
            System.out.println("------");
            }
        }
        
        

	}

}
