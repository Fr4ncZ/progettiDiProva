package corsojava.ESERCIZIVARI.polimorfismo.gruppo;

public abstract class Figura {
	private String nome;
	private String colore;
	
	
	public Figura() {
		this.nome = "Figura Generica";
		this.colore = "Trasparente";
	}
	
	public Figura(String nome, String colore){
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

	
		
	public void mostraInfo() {
		System.out.print("Nome Figura: "+ nome +" Colore: "+ colore);
	}
/*
	public double calcolaArea() {
	 	return 0;
	}
*/
	/*
	public double calcolaPerimetro() {
		 return 0;
	}
	*/
}
