package corsojava.ESERCIZIVARI.polimorfismo.gruppo;

public class Triangolo extends Figura implements FormaGeometrica{
		private double latoA;
		private double latoB;
		private double latoC;
		private double s;
		

		public Triangolo() {
			super();
			latoA= 0;
			latoB = 0;
			latoC = 0;
			s = ((latoA+latoB+latoC)/2);
			
		}
		
		// Overload
		public Triangolo(String nome, String colore, double latoA, double latoB, double latoC) {
			super(nome,colore);
			this.latoA=latoA;
			this.latoB=latoB;
			this.latoC=latoC;
			this.s = ((latoA+latoB+latoC)/2);
		}
		
	
		public double getS() {
			return s;
		}

		public void setS(double s) {
			this.s = s;
		}

		public double getLatoA() {
			return latoA;
		}

		public void setLatoA(double latoA) {
			this.latoA = latoA;
		}

		public double getLatoB() {
			return latoB;
		}

		public void setLatoB(double latoB) {
			this.latoB = latoB;
		}

		public double getLatoC() {
			return latoC;
		}

		public void setLatoC(double latoC) {
			this.latoC = latoC;
		}

		
		double radiceQuadrata(double numero) {
			double tolleranza=0.0001;
	        double stima = numero / 2.0;
	        while ((stima * stima - numero) > tolleranza || (numero - stima * stima) > tolleranza) {
	            stima = (stima + numero / stima) / 2.0;
	        }
	        return stima;
	    }
		
		@Override
		public double calcolaArea() {
			double numero = s*(s-latoA)*(s-latoB)*(s-latoC);
			return radiceQuadrata(numero);
		}

		
		
		@Override
		public double calcolaPerimetro() {
			return latoA+latoB+latoC;
		}
		
		@Override
		public void mostraInfo() {
			super.mostraInfo();
			System.out.print(" LatoA: "+ latoA + " LatoB: "+ latoB+ " LatoC: "+ latoC);
		}
}
