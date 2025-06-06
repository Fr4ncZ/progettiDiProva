package corsojava.ESERCIZIVARI.animali.nora;

public abstract class Animale implements ComportamentoAnimale {
	private String sesso;
	private String tipo;
	private String nome;
	
	
	public Animale () {
		super();
		this.nome = null;
		this.tipo = null;
		this.sesso = null;
	}
	
	public Animale (String nome,String tipo,String sesso) {
		super();
	this.nome = nome;
	this.tipo = tipo;
	this.sesso = sesso;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSesso() {
		return sesso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void mostraInfo() {
        System.out.println( "nome: "+ getNome()  + ", sesso: " + getSesso() + " tipo: " + getTipo());
  
    }
 
  
    }



