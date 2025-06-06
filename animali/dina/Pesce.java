package corsojava.ESERCIZIVARI.animali.dina;
public class Pesce extends Animale {
	public Pesce() {
		super();
	}
    public Pesce(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println(getNome() + " fa: Blub Blub!");
    }

    @Override
    public void muoviti() {
        System.out.println(getNome() + " nuota.");
    }

    public void nuota() {
        System.out.println(getNome() + " nuota velocemente.");
    }
}