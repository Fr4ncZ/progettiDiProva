package corsojava.ESERCIZIVARI.animali.ellie;

public class Pesce extends Animale  {
	private int numPinne;

	public Pesce() {
	super();
	this.numPinne=-1;
	}
	
	public Pesce(String nome, int eta, int nP) {
		super(nome,eta,0);
		this.numPinne=nP;
	}

	
	
	
	public int getNumPinne() {
		return numPinne;
	}

	public void setNumPinne(int numPinne) {
		this.numPinne = numPinne;
	}

	@Override
	public void emettiVerso() {
		System.out.println("BLUP BLUP");
		
	}

	@Override
	public void muoviti() {
		System.out.println(super.getNome()+ " il pesce sta nuotando felice...");
		
	}
	
	public String mostraInfo() {
		String info=super.mostraInfo()+" |Numero Pinne: "+getNumPinne()+"|";
		return info;
	}
	
	public void abboccaAllAmo() {
		System.out.println(super.getNome()+" ha abboccato all'amo...");
	}

	@Override
	public void comportamentoTipico() { 		
		abboccaAllAmo();
	}

}
