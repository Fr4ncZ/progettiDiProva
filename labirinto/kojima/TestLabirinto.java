package corsojava.ESERCIZIVARI.labirinto.kojima;

import java.util.Scanner;

public class TestLabirinto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Labirinto lab = new Labirinto(new int[][] {{1, 1, 1, 1, 1, 1, 7, 1},
											       {1, 0, 0, 0, 0, 0, 0, 1 ,1 , 1 , 1},
											       {1, 0, 1, 0, 1, 1, 0, 1, 1 , 0 , 1},
											       {1, 0, 1, 0, 1, 0, 0, 0, 0 , 0 , 1},
											       {1, 0, 1, 1, 1, 1, 0, 1, 0 , 1},
											       {1, 0, 0, 0, 0, 1, 0, 1, 1},
											       {1, 1, 1, 1, 9, 1, 1, 1}});
		
		System.out.println("Fuggi dal labirinto!");
		
		boolean vittoria = false;
		
		while(!vittoria) {
			
			System.out.println();
			System.out.println("------------------------");
			lab.stampaLabirinto();
			System.out.println("------------------------");
			
			System.out.println("\n"+"Dove vuoi andare? (W(su) / A(sx) / S(giù) / D(dx))");
			char direzione = input.next().toUpperCase().charAt(0);
			
			switch(direzione) {
			
				case 'W':
					
					lab.controllaMovimento(lab.getPosX() - 1, lab.getPosY());
					
					break;
					
				case 'A':
					
					lab.controllaMovimento(lab.getPosX(), lab.getPosY() - 1);
					
					break;
					
				case 'S':
					
					lab.controllaMovimento(lab.getPosX() + 1, lab.getPosY());
					
					break;
					
				case 'D':
					
					lab.controllaMovimento(lab.getPosX(), lab.getPosY() + 1);
				
					break;
					
				default:
					
					System.out.println("Tasto non richiesto riprova!");
			
					break;
					
			}
			
			vittoria = lab.controlloVittoria(lab.getPosX(), lab.getPosY());
			
		}
		
		System.out.println();
		System.out.println("------------------------");
		lab.stampaLabirinto();
		System.out.println("------------------------");
		System.out.println("\n"+"Vittoria!");
		
		input.close();
		
	}

}