package corsojava.ESERCIZIVARI.animali.dina;

public class Zoo {
    private Animale[] animali;
    private int count;

    public Zoo() {
        animali = new Animale[15]; // dimensione fissa, modificabile
        count = 0;
    }

    public void aggiungiAnimale(Animale a) {
        if (count < animali.length) {
            animali[count] = a;
            count++;
        } else {
            System.out.println("Zoo pieno, impossibile aggiungere altri animali.");
        }
    }

    public void mostraTutti() {
        for (int i = 0; i < count; i++) {
            animali[i].mostraInfo();
            animali[i].emettiVerso();
            animali[i].muoviti();
            System.out.println();
        }
    }

    public Animale[] getAnimali() {
        Animale[] presenti = new Animale[count];
        System.arraycopy(animali, 0, presenti, 0, count);
        return presenti;
    }
    
    public void vola(String s) {
    	for ( Animale a : animali) {
    		if (a == null ) {
    			break;
    		}
    		if (a.getNome().equals(s)) {
	    		if ( a instanceof  Uccello ) {
	    			((Uccello) a).vola();
	    		} else {
	    			System.out.println(s +" non può volare");
	    		}
	    		return;
    		}
    	}
    	System.out.println(s +" non è nello zoo");
    }
    
    
}