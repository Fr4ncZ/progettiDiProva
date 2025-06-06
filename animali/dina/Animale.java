package corsojava.ESERCIZIVARI.animali.dina;
public abstract class Animale {
    private String nome;


    public Animale() {
    	super();
        this.nome = null;
    }

    
    public Animale(String nome) {
    	super();
        this.nome = nome;
    }

    public abstract void emettiVerso();
    public abstract void muoviti();

    public void mostraInfo() {
        System.out.println("Nome: " + nome + " | Tipo: " + this.getClass().getSimpleName());
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
    
    
}