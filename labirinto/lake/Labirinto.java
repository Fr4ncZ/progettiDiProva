package corsojava.ESERCIZIVARI.labirinto.lake;

public class Labirinto {
    private int[][] mappa;
    private int giocatoreX = -1;
    private int giocatoreY = -1;

    public Labirinto(int[][] mappa) {
        
        this.mappa = mappa;
        // Assumiamo una posizione fissa di partenza
        
        for (int i = 0; i < mappa.length; i++) {
            for (int j = 0; j < mappa[i].length; j++) {
            		if (mappa[i][j] == 7) {
            			mappa[i][j] = 0;
            			if (giocatoreX < 0) {
	            			giocatoreX = i;
	            			giocatoreY = j;
            			}
            		}
            			
            }
        }
        // non trovo la posizione gliene assegno una in automatico
        if (giocatoreX < 0) {
        	for (int i = 0; i < mappa.length; i++) {
                for (int j = 0; j < mappa[i].length; j++) {
                	if (mappa[i][j] == 0) {
	            			giocatoreX = i;
	            			giocatoreY= j;
            			break;
            		}
                }
        	}
        }
        
        
    }

    public void mostraMappa() {
        for (int i = 0; i < mappa.length; i++) {
            for (int j = 0; j < mappa[i].length; j++) {
                if (i == giocatoreX && j == giocatoreY) {
                    System.out.print("7 ");
                } else {
                    System.out.print(mappa[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean muoviGiocatore(String direzione) {
        int nuovoX = giocatoreX;
        int nuovoY = giocatoreY;

        switch (direzione) {
            case "w": nuovoX--; break; // Alto
            case "s": nuovoX++; break; // Basso
            case "a": nuovoY--; break; // Sinistra
            case "d": nuovoY++; break; // Destra
            default:
                System.out.println("Comando non valido!");
                return false;
        }

        if (nuovoX < 0 || nuovoX >= mappa.length || nuovoY < 0 || nuovoY >= mappa[nuovoX].length || mappa[nuovoX][nuovoY] == 1) {
            System.out.println("Movimento non valido!");
            return false;
        }

        giocatoreX = nuovoX;
        giocatoreY = nuovoY;

        return mappa[giocatoreX][giocatoreY] == 9;
    }
}
