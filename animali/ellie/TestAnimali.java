package corsojava.ESERCIZIVARI.animali.ellie;


/*
 *   in Zoo per Visualizzare le informazioni dettagliate di tutti gli animali presenti
 * 
 *   è sufficiente ciclare su ogni elemento dell'arrey esposto col getter getAr()
 *   e richiamare i metodi di visualizzazione
 */

public class TestAnimali {
	
	

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo(new Animale[]{
			new Cane("Fuffy",10,"Meticcio"),
	        new Uccello("Daisy", 2,10.4),
	        new Pesce("Nemo",1,3)},
			3);

		zoo.aggiungiAnimale(new Pesce("Dory",2,4));
		zoo.aggiungiAnimale(new Cane("Bob",2,"Usky"));
		zoo.aggiungiAnimale(new Uccello("Paperino",2,2.0));
		 
		
		for (Animale ver: zoo.getAr()) {		
			
			System.out.println(ver.mostraInfo());
			System.out.println("--------------------------------------------------------------------------------");
		
			ver.emettiVerso();
			System.out.println("---------------------------------------------------");
			ver.muoviti();
			System.out.println("---------------------------------------------------");
			
			ver.comportamentoTipico();
		}					
	}

}