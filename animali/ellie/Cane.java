
package corsojava.ESERCIZIVARI.animali.ellie;

public class Cane extends Animale  {
	private String razza;

	public Cane() {
		super();
		this.razza="N/A";
	}
	
	public Cane(String nome, int eta, String razza) {
		super(nome,eta,4);
		this.razza=razza;
	}

	

	
	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	@Override
	public void emettiVerso() {
		System.out.println("BAU BAU");
		
	}

	@Override
	public void muoviti() {
		System.out.println(super.getNome()+" il cane si sta muovendo...");
		
	}
	

// dalla superclasse
	public void riportaOggetto() {
		System.out.println(super.getNome()+" riporta l'oggetto lanciato...");
		
	}
	
	@Override
	public String mostraInfo() {
		String info=super.mostraInfo()+"|Razza: "+razza+"| |Numero Zampe: "+super.getNumeroZampe()+"|";
		return info;
	}

	@Override
	public void comportamentoTipico() { 
		riportaOggetto();
	}

}
