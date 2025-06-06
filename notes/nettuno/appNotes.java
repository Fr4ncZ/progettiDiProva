package corsojava.ESERCIZIVARI.notes.nettuno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class appNotes {
    // non c'è bisogno di chiudere BufferedReader e BufferedWriter in quanto il try già gestisce automaticamente la chiusura delle risorse.

    private static final String NOME_FILE = "files/notes.txt";

    // 1. Aggiungere una nota
    // Assunzioni:
    // 1.1. la nota potrebbe essere vuota   ->  non la salva
    // 1.2. la nota potrebbe essere già presente ->  non la salca   
    // 1.3. la nota potrebbe essere già presente ma vuota ->  caso che non sussiste
    // 1.4. la nota potrebbe essere già presente con testo -> caso che non sussite
    private static void aggiungiNota(Scanner input) {
        System.out.println("Aggiungi una nota:");
        String nota = input.nextLine();

        // Check se la nota è vuota
        if (nota.trim().isEmpty()) {
            System.out.println("Nota vuota. Non posso aggiungerla.");
            return;
        }

        // Check se la nota è già presente
        File file = new File(NOME_FILE);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(NOME_FILE))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.equals(nota)) {
                        System.out.println("La nota è già presente.");
                        return;
                    }
                }
            } catch (IOException e) {
                System.err.println("Errore durante la lettura del file " + NOME_FILE + ": " + e.getMessage());
            }
        }

        // Aggiungere la nota al file
        try (BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(NOME_FILE, true))) {
            bw.write(nota);
            bw.newLine();
            System.out.println("Nota aggiunta con successo.");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura nel file " + NOME_FILE + ": " + e.getMessage());
        }
    }


    // 2. Leggere le note
    // Assuzioni:
    // 2.1. potrebbero non esserci note   -> stampo msg
    // 2.2. potrebbero esserci note ma vuote -> stampo msg
    // 2.3. potrebbero esserci note con testo -> stampo la nota
    private static void leggiTutteLeNote() {
        System.out.println("Leggo tutte le note...");

		//return Files.exists(Paths.get(nomefile));
		
        File file = new File(NOME_FILE);       
        // Check sull'esistenza delle note
        if (!file.exists() || file.length() == 0) {
            System.out.println("Nessuna nota presente.");
            return;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(NOME_FILE))) {
            String line; 
            while ((line = br.readLine()) != null) {
                
                if (line.isEmpty()) {
                    System.out.println("[La nota esiste ma è vuota]");
                } else {
                	System.out.println(line);
                }
            } 
            
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file " + NOME_FILE + ": " + e.getMessage());
        }
        finally {
            System.out.println("*******************************************");
        }

    }



    public static void main(String[] args) {
        boolean itsover = true;
        Scanner input = new Scanner(System.in);

    while (itsover) {
            System.out.println("\nMenu");
            System.out.println("1. Aggiungi una nuova nota");
            System.out.println("2. Leggi tutte le note");
            System.out.println("3. Esci");
            System.out.print("Scegli un'opzione: ");

            String scelta = input.nextLine();

            switch (scelta) {
                case "1": aggiungiNota(input);
                    break;
                case "2":leggiTutteLeNote();
                    break;
                case "3":itsover = false;
                    System.out.println("Uscita dall'applicazione.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        input.close();
    }


}