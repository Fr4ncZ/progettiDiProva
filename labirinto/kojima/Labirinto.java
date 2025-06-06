package corsojava.ESERCIZIVARI.labirinto.kojima;

public class Labirinto {

	private int[][] mappa;					       
	private int posX = 0;
	private int posY = 6;
	
	public Labirinto(int[][] lab) {
		
		this.mappa = lab;
		
	}

	// Getters e setters.
	
	public int[][] getMappa() {
		
		return mappa;
		
	}

	public void setMappa(int[][] mappa) {
		
		this.mappa = mappa;
	}

	public int getPosX() {
		
		return posX;
		
	}

	public void setPosX(int posX) {
		
		this.posX = posX;
		
	}

	public int getPosY() {
		
		return posY;
		
	}

	public void setPosY(int posY) {
		
		this.posY = posY;
		
	}
	
	// Metodi.
	
	public void stampaLabirinto() {
		
		for(int i = 0; i < mappa.length; i++) {
			
			System.out.print("|");
			
			for(int j = 0; j < mappa[i].length; j++) {
				
				System.out.print(mappa[i][j]+" ");
				
			}
			
			System.out.println("|");
			
		}
		
	}
	
	public void controllaMovimento(int new_posX, int new_posY) {
		
		if(new_posX < 0 || new_posY < 0 || new_posX >= mappa.length || new_posY >= mappa[new_posX].length) {
			
			System.out.println("Attenzione sei fuori dal mondo!");
			
		} else if(mappa[new_posX][new_posY] == 1) {
			
			System.out.println("Attenzione c'è un muro!");
			
		} else {
		
			getMappa()[posX][posY] = 0;
			
			posX = new_posX;
			posY = new_posY;
			
			getMappa()[posX][posY] = 7;
			
		}
		
	}
	
	public boolean controlloVittoria(int posX, int posY) {
		
		return mappa[posX][posY] == mappa[6][4] ? true : false;
		
	}
	
}
