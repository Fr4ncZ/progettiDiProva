package corsojava.ESERCIZIVARI.catalogo.urano;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GestoreCatalogo {
	
	private static final String file = "files/catalogo.txt";
	
	private static Map<Integer, Prodotto> catalogo = new HashMap<>(); //Integer, Prodotto>();
	private static Map<String, TreeSet<Prodotto>> categorie = new HashMap<>(); //String, TreeSet<Prodotto>>();
	
	
	
	
	
	private GestoreCatalogo() {}
	
	public static void aggiungiProdotto(Prodotto p) {
		
		if(p == null) p = new Prodotto();
		
		aggiungiProdotto(p.getId(), p);
		
	}
	
	private static void aggiungiProdotto(int id, Prodotto p) {
		
		if(!catalogo.containsKey(id) && p.getNome() != null && p.getCategoria() != null) {
			
			catalogo.put(id, p);
			
			TreeSet<Prodotto> prodotti = categorie.get(p.getCategoria());
			
			if(prodotti == null) {
				
				prodotti = new TreeSet<Prodotto>();
				
				categorie.put(p.getCategoria(), prodotti);
				
			} 
			
			prodotti.add(p);
			
			System.out.println("Prodotto aggiunto con successo!");
			
		} else {
			
			System.out.println("ID "+p.getId()+" già presente o dati assenti!");
			
		}
		
	}
	
	public static void rimuoviProdotto(Scanner input) {
		
		int id = 0;
		
		try {
			
			System.out.print("Dimmi un ID da rimuovere: ");
			id = input.nextInt(); 
			System.out.println();
		
			if(catalogo.containsKey(id)) {
				
				Prodotto p = catalogo.remove(id);
				
				categorie.get(p.getCategoria()).remove(p);
				
				System.out.println("Prodotto rimosso con successo!");
				
			} else {
				
				System.out.println("ID inesistente!");
				
			}
		
		} catch(InputMismatchException e) {
		
			System.out.println("\n"+"ID non valido!");
			
		} finally {
			
			input.nextLine();
			
		}
	
	}
	
	public static void cercaProdotti(Scanner input) {
		
		System.out.print("Cerca una categoria: ");
		String cat = input.nextLine();
		System.out.println();
		
		for(String c : categorie.keySet()) {
			
			if(c.equals(cat)) {
				
				if(!categorie.get(cat).isEmpty()) {
					
					System.out.println("Prodotti della categoria "+cat.toLowerCase()+":");
					for(Prodotto p : categorie.get(cat)) System.out.println(p.getId()+": "+p.getNome());
					
				} else {
					
					System.out.println("Categoria vuota!");
					
				}
				
				return;
				
			} 
			
		}
		
		System.out.println("Categoria inesistente!");
		
	}

	public static void salvaProdotti() {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			
			for(Prodotto p : catalogo.values()) {
				
				bw.write(p.getId()+", "+p.getNome()+", "+p.getCategoria());
				bw.newLine();
				
			}
			
			System.out.println("Prodotti salvati con successo!");
			
		} catch(FileNotFoundException e) {
			
			System.out.println("File non trovato!");
			
		} catch(IOException e) {
			
			System.out.println("Errore generale!");
			
		}
		
	}
	
	public static boolean caricaProdotti() {
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String str = null;
			Prodotto p = null;
			int maxId = 0;
			while((str = br.readLine()) != null) {
				
				String[] parti = str.split(", ");
				
				if(parti.length == 3) {
				
					p = new Prodotto(parti[1], parti[2]);
					p.setId(Integer.parseInt(parti[0]));
				
					aggiungiProdotto(p.getId(), p);
					
					if (p.getId()>maxId) maxId = p.getId();
				
				} else {
				
					System.out.println("Dati del prodotto corrotti!");
					
				}
				
			}
		//	Prodotto.setUltimoId(maxId);
			System.out.println(catalogo.isEmpty() ? "Non ci sono prodotti al momento!" : "\n"+"Prodotti caricati con successo!");
			
			return true;
			
		} catch(FileNotFoundException e) {
			
			System.out.println("File non trovato!");
			
			return false;
			
		} catch(IOException e) {
			
			System.out.println("Errore generale!");
			
			return false;
			
		}
		
	}
	
}
