package corsojava.ESERCIZIVARI.animali.ellie;

public class Zoo {
	
	private Animale[] ar;
	private int count;
	
	public Zoo() {
		super();
		this.ar=null;
		count=0;
	}
	
	public Zoo(Animale[] ar, int count) {
		super();
		this.count=count;
		this.ar=ar;
		
	}
	
	public void aggiungiAnimale(Animale nuovo) {
		Animale[] nAr = new Animale[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            nAr[i] = ar[i];
        }
        nAr[ar.length] = nuovo;
        ar = nAr;
        count++;
    }
	
	 
	public Animale[] getAr() {
		return ar;
	}
/*
	public void setAr(Animale[] ar) {
		this.ar = ar;
	}
*/	
	
	public  void comportamentoTipico(String nome) {
		for (Animale ver : ar) {
			if (ver.getNome().equals(nome)) {
				ver.comportamentoTipico();			
				return;
			}
		}
		System.out.println("Animale "+nome+" non trovato");
		
	}
	/*	
	public void mostraDettagli() {
		for (ComportamentiAnimali det: ar) {
			if(det instanceof Animale) {
				Animale an = (Animale) det;
				System.out.println(an.mostraInfo());
				System.out.println("--------------------------------------------------------------------------------");
			}
		}
			
		
	}
*/
}
