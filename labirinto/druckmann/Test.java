package corsojava.ESERCIZIVARI.labirinto.druckmann;

public class Test {
	

	public static void printXY(int[][] arrXY) {

		
		 for( int i = 0; i<arrXY.length;i++) {
			 for( int j = 0; j<arrXY[i].length;j++) {
				 System.out.print(arrXY[i][j] +" ");
			 }
			 System.out.println();			 
		 }
	}

	public static void main(String[] args) {
		 // Definizione del labirinto (0 = percorso libero, 1 = muro, 7 = partenza, 9 = uscita)
        int[][] dungeonMap = {
            {1, 1, 9, 1, 1, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 0, 1, 0, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 7, 1, 1, 1}
        };

        // Crea la logica del gioco
        LabyrinthLogic gameLogic = new LabyrinthLogic(dungeonMap);
        
        printXY (dungeonMap);
        
         int[][] copyMap = dungeonMap.clone();
        

        printXY (copyMap);

        printXY (gameLogic.getDisplayMap());
	}

}
