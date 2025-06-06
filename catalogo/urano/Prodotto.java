package corsojava.ESERCIZIVARI.catalogo.urano;

/* ASSUNZIONI: 
 * - l'id è autoincrementale;
 * - se l'ultimo id assegnato viene rimosso, il campo ultimo_id non incrementa.
 */

public class Prodotto  implements Comparable<Prodotto>{

	private static int ultimo_id;  // = 0   ultimo id inserito
	
	private Integer id;
	private String nome;
	private String categoria;
	
	public Prodotto() {
		
		super();
		
		this.id = ++ultimo_id;
		this.nome = null;
		this.categoria = null;
		
	}
	
	public Prodotto(String nome, String categoria) {
		
		super();
		
		this.id = ++ultimo_id;
		this.nome = nome;
		this.categoria = categoria;
		
	}

	public int getId() {
		
		return id;
		
	}

	public void setId(int id) {
		
		if(id > ultimo_id) ultimo_id = id;  // riassegna ultimo id col valore massimo 
		
		this.id = id;
		
	}
 
	public String getNome() {
		
		return nome;
		
	}
	
	public String getCategoria() {
		
		return categoria;
		
	}

	@Override
	public String toString() {
		
		return getId()+": "+getNome()+", "+getCategoria();
		
	}

	@Override
	public int compareTo(Prodotto o) {
		
		return  this.id.compareTo(o.getId());
	}
	
}
