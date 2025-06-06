package corsojava.ESERCIZIVARI.catalogo.plutone;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final String FILE_PATH = "files/catalogo.dat";
    private static CatalogoProdotti catalogo;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Carica il catalogo da disco se esiste
        caricaCatalogo();

        boolean continua = true;
        while (continua) {
            mostraMenu();
            int scelta = leggiIntero("Inserisci la tua scelta: ");

            switch (scelta) {
                case 1:
                    aggiungiProdotto();
                    break;
                case 2:
                    rimuoviProdotto();
                    break;
                case 3:
                    cercaProdotto();
                    break;
                case 4:
                    mostraProdottiPerCategoria();
                    break;
                case 0:
                    salvaCatalogo();
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }
        }

        scanner.close();
        System.out.println("Programma terminato.");
    }

    private static void mostraMenu() {
        System.out.println("\n=== GESTIONE CATALOGO PRODOTTI ===");
        System.out.println("1. Aggiungi prodotto");
        System.out.println("2. Rimuovi prodotto");
        System.out.println("3. Cerca prodotto per ID");
        System.out.println("4. Mostra prodotti per categoria");
        System.out.println("0. Esci");
    }

    private static void caricaCatalogo() {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try {
                catalogo = CatalogoProdotti.caricaDaDisco(FILE_PATH);
                System.out.println("Catalogo caricato dal disco.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Errore nel caricamento del catalogo: " + e.getMessage());
                catalogo = new CatalogoProdotti();
            }
        } else {
            catalogo = new CatalogoProdotti();
            System.out.println("Creato nuovo catalogo.");
        }
    }

    private static void salvaCatalogo() {
        try {
            catalogo.salvaSuDisco(FILE_PATH);
            System.out.println("Catalogo salvato su disco.");
        } catch (IOException e) {
            System.out.println("Errore nel salvataggio del catalogo: " + e.getMessage());
        }
    }

    private static void aggiungiProdotto() {
        System.out.println("\n=== AGGIUNGI PRODOTTO ===");
        String id = leggiStringa("Inserisci ID: ");
        String nome = leggiStringa("Inserisci nome: ");
        String categoria = leggiStringa("Inserisci categoria: ");

        Prodotto prodotto = new Prodotto(id, nome, categoria);
        catalogo.aggiungiProdotto(prodotto);
        System.out.println("Prodotto aggiunto con successo!");
    }

    private static void rimuoviProdotto() {
        System.out.println("\n=== RIMUOVI PRODOTTO ===");
        String id = leggiStringa("Inserisci ID del prodotto da rimuovere: ");        
        if (catalogo.rimuoviProdotto(id)) {
        	System.out.println("Operazione completata.");
        } else {
        	System.out.println("Impossibile rimuovere id="+id);
        }
    }

    private static void cercaProdotto() {
        System.out.println("\n=== CERCA PRODOTTO ===");
        String id = leggiStringa("Inserisci ID del prodotto: ");
        Prodotto prodotto = catalogo.cercaProdotto(id);

        if (prodotto != null) {
            System.out.println("Prodotto trovato: " + prodotto);
        } else {
            System.out.println("Nessun prodotto trovato con ID: " + id);
        }
    }

    private static void mostraProdottiPerCategoria() {
        System.out.println("\n=== PRODOTTI PER CATEGORIA ===");
        String categoria = leggiStringa("Inserisci categoria: ");
        Set<Prodotto> prodotti = catalogo.ProdottiPerCategoria(categoria);

        if (prodotti.isEmpty()) {
            System.out.println("Nessun prodotto nella categoria: " + categoria);
        } else {
            System.out.println("Prodotti nella categoria '" + categoria + "':");
            for (Prodotto p : prodotti) {
                System.out.println("- " + p);
            }
        }
    }

    private static String leggiStringa(String messaggio) {
        System.out.print(messaggio);
        return scanner.nextLine();
    }

    private static int leggiIntero(String messaggio) {
        while (true) {
            try {
                System.out.print(messaggio);
                int valore = Integer.parseInt(scanner.nextLine());
                return valore;
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
        }
    }
}