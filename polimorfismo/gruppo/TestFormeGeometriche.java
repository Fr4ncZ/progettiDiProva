package corsojava.ESERCIZIVARI.polimorfismo.gruppo;

public class TestFormeGeometriche {

	public static void main(String[] args) {
		
		Figura[] f = new Figura[3];
		
		f[0] = new Cerchio("Cerchio","Rosso",4.0);
		f[1] = new Rettangolo("Rettangolo","Blu",6.0,4.0);
		f[2] = new Triangolo("Triangolo","Giallo",5,6,7);
		
		if (f[0] instanceof Cerchio) {
			Cerchio mioCerchio = (Cerchio) f[0];
			mioCerchio.mostraInfo();
			System.out.println(" | Area: "+mioCerchio.calcolaArea() + "| |Circonferenza: "+mioCerchio.calcolaPerimetro()+"|");	
		}
		
		System.out.println("-------------------------");
		
		if(f[1] instanceof Rettangolo) {
			Rettangolo mioRettangolo = (Rettangolo) f[1];
			mioRettangolo.mostraInfo();
			System.out.println(" |Area: "+mioRettangolo.calcolaArea() + "| |Perimetro: "+mioRettangolo.calcolaPerimetro()+"|");	
		}
		
		System.out.println("-------------------------");
		
		if(f[2] instanceof Triangolo) {
			Triangolo mioTriangolo =(Triangolo) f[2];
			mioTriangolo.mostraInfo();
			System.out.print(" |Semiperimetro del triangolo: "+mioTriangolo.getS());
			System.out.print(" | |Area: "+mioTriangolo.calcolaArea() + "| |Perimetro: "+mioTriangolo.calcolaPerimetro()+"|");
		}
	}

}
