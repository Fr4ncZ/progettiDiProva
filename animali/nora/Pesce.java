package corsojava.ESERCIZIVARI.animali.nora;

public class Pesce extends Animale{
	private String provenienza;
	private String colore;

	
	public Pesce () {
		super();
	};
	public Pesce (String nome, String tipo, String sesso,String provenienza, String colore) {
		super(nome,tipo,sesso);
		this.provenienza = provenienza;
		this.colore = colore;
	};
	
	public String getProvenienza() {
		return provenienza;
	}
	public String getColore() {
		return colore;
	}
	public void setProvenienza(String provenienza) {
		this.provenienza = provenienza;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Provenienza: " + getProvenienza() + ", colore: " + getColore() );
  
    }
	
	@Override
	public void emettiVerso() {
		System.out.println("Il vuo verso è: blub blub");
	
	}
	@Override
	public void muoviti() {
		System.out.println("Il suo movimento è: Nuotare");
	}	
	public void nuota() {
		System.out.println("Fa delle nuotate rapide");
	}
	
	
	
	
	
	

}
