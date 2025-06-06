package corsojava.ESERCIZIVARI.polimorfismo.rotondo;
public abstract class Figura {
	
    protected String nome;
    protected String colore;

    public Figura(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public void mostraInfo() {
        System.out.println("Figura: " + nome + ", Colore: " + colore);
    }
    
}
