package corsojava.ESERCIZIVARI.polimorfismo.soluzione;

public abstract class Figura {
    protected String nome;
    protected String colore;
	private boolean valido;


	public Figura() {
    	this.nome = null;
        this.colore = null;
        valido = false;
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
    
    public void mostraInfo() {
        System.out.println("La figura " + nome + " è di colore " + colore);
    }


    public boolean isValido() {
		return valido;
	}


	protected void setValido(boolean valido) {
		this.valido = valido;
	}

    
    public abstract boolean verificaFigura();
    
    
}
