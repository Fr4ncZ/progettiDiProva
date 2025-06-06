package corsojava.ESERCIZIVARI.animali.nora;

public class Cane extends Animale {
	
	private String colore;
	private String razza;
	
	public String getColore() {
		return colore;
	}

	public String getRazza() {
		return razza;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	} 

	public Cane () {
		super();
		this.colore = null;
		this.razza = null;
	};

	public Cane (String nome,String tipo,String sesso,String razza,String colore ) {
		super(nome,tipo,sesso);
		this.colore = colore;
		this.razza = razza;
	};
	
	@Override
	public void emettiVerso() {
		System.out.println("Il vuo verso è: Bau Bau!");
	}
	
	@Override
	public void muoviti() {
		System.out.println("Il vuo movimento è: Corre");
	}	
	public void riportaOggetto() {
		System.out.println("Riporta il bastone");
	}
	
	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Razza: " + getRazza() + ", colore: " + getColore());
   
	}
}