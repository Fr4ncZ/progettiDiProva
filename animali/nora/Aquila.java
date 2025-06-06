package corsojava.ESERCIZIVARI.animali.nora;

public class Aquila extends Animale {
	private String specie;
	private String colore;
	
	
	
	public String getSpecie() {
		return specie;
	}

	public String getColore() {
		return colore;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}


	public Aquila () {
		super();
	};

	public Aquila (String nome,String tipo, String sesso, String specie,String colore) {
		super(nome,tipo,sesso);
		this.specie = specie;
		this.colore = colore;
	}
	
	
	@Override
	public void emettiVerso() {
		System.out.println("Il vuo verso è: kiii-iiih!");
		
	}
	
	@Override
	public void muoviti() {
		System.out.println("Il vuo movimento è: Spicca il volo");
	}	
	public void vola() {
		System.out.println("Vola alto nel cielo");
	}
	
	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Razza: " + getSpecie() + ", colore: " + getColore());
  
    }
	
	
	
	
	
	
	
	
	
	
	
	

}
