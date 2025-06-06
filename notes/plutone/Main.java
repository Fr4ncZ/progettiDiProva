package corsojava.ESERCIZIVARI.notes.plutone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	
    	NoteManager notes = NoteManager.creaIstanza();
    	
    	notes.metodo(); 
    	
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Gestore di Note ---");
            System.out.println("0. Cambia file ["+NoteManager.FILE_NAME+"]");
            System.out.println("1. Aggiungi una nota");
            System.out.println("2. Visualizza le note");
            System.out.println("3. Esci");
            System.out.println("Scelta: ");
             
            String choice = scanner.nextLine();
             
            switch (choice) {
	            case "0":
	                System.out.println("Inserisci il nome nuovo del file: ");
	                String filename = scanner.nextLine();
	                if (filename.length()>3) {
	                	NoteManager.FILE_NAME = filename;	                	
	                } else {
	                	System.out.println("Nome file non valido!");
	                }
	                break;
                case "1":
                    System.out.println("Inserisci la tua nota: ");
                    String note = scanner.nextLine();
                    NoteManager.addNote(note);
                    break;
                case "2":
                	NoteManager.readNotes();
                    break;
                case "3":
                    running = false;
                    System.out.println("Uscita in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }
}
