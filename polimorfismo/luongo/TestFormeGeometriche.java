package corsojava.ESERCIZIVARI.polimorfismo.luongo;

public class TestFormeGeometriche {

	public static void main(String[] args) {
		
		FormaGeometrica[] forme = {new Cerchio("Cerchio", "Bianco", 1.1),
								   new Rettangolo("Rettangolo", "Verde", 2.2, 3.3),
								   new Triangolo("Triangolo", "Rosso", 4.4, 5.5, 6.6)};
		
		for(FormaGeometrica fg : forme) {
			
			if(fg instanceof Figura figura) System.out.println(figura.mostraInfo());
			
			System.out.println("Perimetro: "+fg.calcolaPerimetro());
			System.out.println("Area: "+fg.calcolaArea());
			System.out.println();
			
		}
		
	}

}
