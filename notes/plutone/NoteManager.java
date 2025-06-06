package corsojava.ESERCIZIVARI.notes.plutone;

import java.io.*;

public  class NoteManager {
	
	private NoteManager() {
		super();		
	}
	
	public void metodo() {
		System.out.println("Ciao sono un metodo!");
	}
	
	
	public static NoteManager creaIstanza() {
		return new NoteManager();
	}
	
    public static String FILE_NAME = "notes.txt";

    public static void addNote(String note) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            writer.write(note);
            writer.newLine();
            System.out.println("Nota aggiunta con successo.");
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura della nota: " + e.getMessage());
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Errore durante la chiusura del writer: " + e.getMessage());
            }
        }
    }

    public static void readNotes() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            System.out.println("Note salvate:");
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Il file delle note non esiste ancora.");
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Errore durante la chiusura del reader: " + e.getMessage());
            }
        }
    }

}
