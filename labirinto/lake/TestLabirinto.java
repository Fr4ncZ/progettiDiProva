package corsojava.ESERCIZIVARI.labirinto.lake;



import java.util.Scanner;

public class TestLabirinto {
    public static void main(String[] args) {
    	// 1 rappresenta un muro e 0 la via e 7 la presenza dell'omino e 9 il punto di arrivo
        int[][] mappa = new int[][] {
	        { 1, 1, 1, 1, 1, 1, 1, 1 },
	        { 1, 0, 0, 0, 0, 0, 0, 1 ,1 , 1 , 1},
	        { 1, 0, 1, 0, 1, 1, 0, 1, 1 , 7 , 1},
	        { 1, 0, 1, 0, 1, 0, 0, 0, 0 , 0 , 1 },
	        { 1, 0, 1, 1, 1, 1, 0, 1, 0 , 1 },
	        { 1, 0, 0, 1, 0, 0, 0, 1, 1 },
	        { 1, 1, 1, 1, 9, 1, 1, 1 },
        };
        Labirinto labirinto = new Labirinto(mappa);
        Scanner scanner = new Scanner(System.in);
        boolean uscitaRaggiunta = false;

        System.out.println("Benvenuto nel Gioco del Labirinto!");
        System.out.println("Inserisci w per spostare l'omino verso l'alto ");
        System.out.println("Inserisci s per spostare l'omino verso il basso ");
        System.out.println("Inserisci a per spostare l'omino verso sinistra ");
        System.out.println("Inserisci d per spostare l'omino verso destra ");
        while (!uscitaRaggiunta) {
            labirinto.mostraMappa();
            System.out.print("Inserisci un comando (w/a/s/d): ");
            String comando = scanner.nextLine();
            uscitaRaggiunta = labirinto.muoviGiocatore(comando);
        }

        System.out.println("Complimenti! Hai raggiunto l'uscita!");
        scanner.close();
    }
}