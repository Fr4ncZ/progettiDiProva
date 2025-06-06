package corsojava.ESERCIZIVARI.polimorfismo.levorato;

public abstract class Figura {
    private String nome;
    private String colore;
    
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
    
    public void mostraInfo() {
        System.out.println("La figura " + nome + " è di colore " + colore);
    }
    
}
