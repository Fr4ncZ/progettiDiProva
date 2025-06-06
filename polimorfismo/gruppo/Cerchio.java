package corsojava.ESERCIZIVARI.polimorfismo.gruppo;

public class Cerchio extends Figura implements FormaGeometrica{
		private double raggio;
		final double pi = 3.141592653589793;

		public Cerchio() {
			super();
			raggio = 0;
		}
		
		// Overload
		public Cerchio(String nome, String colore, double raggio) {
			super(nome,colore);
			this.raggio=raggio;
		}
		
	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

		@Override
		public double calcolaArea() {
			// double area = pi * raggio * raggio;
			return pi * raggio * raggio;
		}


		@Override
		public double calcolaPerimetro() {
			return 2*pi*raggio;
		}
		
		@Override
		public void mostraInfo() {
			super.mostraInfo();
			System.out.print(" Raggio: "+ raggio);
		}
}
