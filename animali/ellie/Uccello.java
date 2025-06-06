package corsojava.ESERCIZIVARI.animali.ellie;

public class Uccello extends Animale   {
	private double misuraAli;
	
	
	public Uccello() {
		super();
		this.misuraAli=-1;
	}
	
	public Uccello(String n,int e, double mA) {
		super(n,e,2);
		this.misuraAli=mA;
	}
	
	
	public double getMisuraAli() {
		return misuraAli;
	}

	public void setMisuraAli(double misuraAli) {
		this.misuraAli = misuraAli;
	}

	@Override
	public void emettiVerso() {
		System.out.println("CIP CIP");
	}

	@Override
	public void muoviti() {
		System.out.println(super.getNome()+" l'uccello sta volando con apertura alare "+misuraAli);
	}
	
	@Override
	public String mostraInfo() {
		String info = super.mostraInfo()+" |Misura: "+misuraAli+"| |Numero Zampe: "+super.getNumeroZampe()+"|";
		return info;
	}
	
	
	public void faIlNido() {
		System.out.println(super.getNome()+" sta facendo il nido");
	}

	@Override
	public void comportamentoTipico() {
		faIlNido(); 
		
	}
	
	
	
}
