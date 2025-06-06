package corsojava.ESERCIZIVARI.polimorfismo.luongo;

public abstract class Figura {

	private String nome;
	private String colore;
	
	public Figura() {
		
		super();
		
	}
	
	public Figura(String nome, String colore) {
		
		this.nome = nome;
		this.colore = colore;
		
	}

	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
	}

	public String getColore() {
		
		return colore;
		
	}

	public void setColore(String colore) {
		
		this.colore = colore;
		
	}
	
	public String mostraInfo() {
		
		return getNome()+", "+getColore();
		
	}
	
}
