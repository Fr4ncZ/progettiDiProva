package corsojava.ESERCIZIVARI.animali.dina;
public class Cane extends Animale {
	public Cane() {
		super();
	}
    
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println(getNome() + " abbaia: Bau Bau!");
    }

    @Override
    public void muoviti() {
        System.out.println(getNome() + " corre.");
    }

    public void riportaOggetto() {
        System.out.println(getNome() + " riporta la palla.");
    }
}