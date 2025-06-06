package corsojava.ESERCIZIVARI.catalogo.urano;

import java.util.Scanner;

public class TestCatalogo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		
		// Se vogliamo trasformare GestoreCatologo in singleton 
		// definiamo una variabile catalogo e poi ci riferiremo a questa
		// al posto della classe
		
		// GestoreCatalogo catalogo = GestoreCatalogo.getInstance()		
		// catalogo.caricaProdotti();
		
		GestoreCatalogo.caricaProdotti(); 
		 
		boolean esegui = true;
		
		
		while(esegui) {
			
			System.out.println("Scegli un'opzione (A ggiungi /R imuovi/C erca /E sci):");
			char opzione = input.next().toUpperCase().charAt(0); input.nextLine();
			
			System.out.println("----------------------------------------");
			
			switch(opzione) {
			
			case 'A':
				
				GestoreCatalogo.aggiungiProdotto(new Prodotto("Smartphone", "Elettronica"));
				GestoreCatalogo.aggiungiProdotto(new Prodotto("Maglietta", "Abbigliamento"));
				GestoreCatalogo.aggiungiProdotto(new Prodotto("Biscotti", "Alimentari"));
				
				System.out.println("----------------------------------------");
				
				break;
				
			case 'R':
				
				GestoreCatalogo.rimuoviProdotto(input);
				
				System.out.println("----------------------------------------");
				
				break;
				
			case 'C':
				
				GestoreCatalogo.cercaProdotti(input);
			
				System.out.println("----------------------------------------");
				
				break;
				
			case 'E':
				
				esegui = false;
				
				break;
				
			default:
				
				System.out.println("Comando inesistente!");
				
				System.out.println("----------------------------------------");
				
				break;
				
			}
			
		}
		
		GestoreCatalogo.salvaProdotti();
		
		input.close();
		
	}

}
