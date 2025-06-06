package corsojava.ESERCIZIVARI.animali.dina;
public class Uccello extends Animale {
	public Uccello() {
		super();
	} 
    public Uccello(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println(getNome() + " cinguetta: Cip Cip!");
    }

    @Override
    public void muoviti() {
        System.out.println(getNome() + " saltella.");
    }

    public void vola() {
        System.out.println(getNome() + " vola nel cielo.");
    }
}