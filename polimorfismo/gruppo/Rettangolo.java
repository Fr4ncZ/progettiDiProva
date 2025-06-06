package corsojava.ESERCIZIVARI.polimorfismo.gruppo;

public class Rettangolo extends Figura implements FormaGeometrica{
		private double base;
		private double altezza;
		

		public Rettangolo() {
			super();
			base = 0;
			altezza = 0;
		}
		
		// Overload
		public Rettangolo(String nome, String colore, double base, double altezza) {
			super(nome,colore);
			this.base=base;
			this.altezza=altezza;
		}
		
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double base) {
		this.altezza = altezza;
	}
	
	
	
		@Override
		public double calcolaArea() {
			return base*altezza;
			
		}

		@Override
		public double calcolaPerimetro() {
			return 2*(base+altezza);
		}
		
		@Override
		public void mostraInfo() {
			super.mostraInfo();
			System.out.print(" Base: "+ base + " Altezza: "+altezza);
		}
}
