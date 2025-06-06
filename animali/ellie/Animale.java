package corsojava.ESERCIZIVARI.animali.ellie;


public abstract class Animale  implements ComportamentiAnimali {
	private String nome;
	private int eta;
	private int numeroZampe;
	
	
	public Animale() {
		this.nome="N/A";
		this.eta=-1;
	}
	
	public Animale(String n,int e, int nZ) {
		this.nome=n;
		this.eta=e;
		this.numeroZampe=nZ;
	}
	
	
		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	public int getNumeroZampe() {
		return numeroZampe;
	}

	public void setNumeroZampe(int numeroZampe) {
		this.numeroZampe = numeroZampe;
	}

//	@Override
	public String mostraInfo() {
		String info="|Nome:"+nome+"| |Età: "+eta+"|";
		return info;
	}
	
/* 
  - se non implemento l'interfaccia ComportamentiAnimali,
    devo esplicitare i metodi astratti 
    
	public abstract void emettiVerso();
	public abstract void muoviti();
	// public abstract String mostraInfo();
	public abstract void comportamentoTipico();
*/		
	
	


}
