package corsojava.ESERCIZIVARI.animali.nora;

public class Zoo {
	private Animale[] animali;
	private int count;

	public Zoo () {
		super();
		animali = new Animale[10];
		count = 0;
	}

	public Zoo (int dimensione) {
		super();
		animali = new Animale[dimensione];
		count = 0;
	}


	public void aggiungiAnimali(Animale animale) {
		if(count < animali.length) {
			animali[count] = animale;
			count++;
		} else {
			System.out.println("Lo zoo è pieno");
		}

	}
	public void mostraTuttiGliAnimali() 
	{
		
		// TODO - [NTH] usare for each in mostratuttiGli Animali
		for (int i = 0; i < count; i++) 
		{
			Animale a = animali[i];
			a.mostraInfo();
			a.emettiVerso();
			a.muoviti();
 
		
			if (a instanceof Cane) 
			{
				((Cane) a).riportaOggetto();
			} else if (a instanceof Aquila) 
			{
				((Aquila) a).vola();
			} else if (a instanceof Pesce) 
			{
				((Pesce) a).nuota();
			}

			System.out.println();
		}
	}





}