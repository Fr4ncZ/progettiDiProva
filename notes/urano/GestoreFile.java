package corsojava.ESERCIZIVARI.notes.urano;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestoreFile {

	public static void aggiungiNota(Scanner input, String nomeFile) {
		
		BufferedWriter bw = null;
		
		try {
			
			bw = new BufferedWriter(new FileWriter(nomeFile, true));
			
			String nota = "";
			
			System.out.println("\n"+"Dimmi cosa vuoi scrivere (\"EXIT\" per smettere):");
			while(true) {
				
				nota = input.nextLine();
				
				if(nota.equals("EXIT")) break;
				
				bw.write(nota);
				bw.newLine();
				
			}
			
			bw.close();
			
		} catch(FileNotFoundException e) {
			
			System.out.println("File inesistente!");
			
		} catch(IOException e) {
			
			System.out.println("Errore generale!");
		
		} finally {
		
			System.out.println();
			
		}
		
	}
	
	public static void leggiNote(String nomeFile) {
	
		try {
		
			BufferedReader br = new BufferedReader(new FileReader(nomeFile));
			
			String note = null;
			
			while((note = br.readLine()) != null) {
				
				System.out.println(note);
				
			}
			
			br.close();
			
		} catch(FileNotFoundException e) {
			
			System.out.println("File inesistente!");
			
		} catch(IOException e) {
			
			System.out.println("Errore generale!");
		
		} finally {
		
			System.out.println("\n"+"Chiusura programma...");
			
		}
			
	}
	
}
