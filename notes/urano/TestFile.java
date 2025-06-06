package corsojava.ESERCIZIVARI.notes.urano;

import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nomeFile = "notes.txt";
		
		System.out.println("Scrittura:");
		GestoreFile.aggiungiNota(input, nomeFile);
			
		System.out.println("Lettura:");
		GestoreFile.leggiNote(nomeFile);
		
	}
	
}