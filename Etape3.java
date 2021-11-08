package RPG;

public class Etape3 {
	boolean winGame = false;


	public boolean resultatEtape (int JoueurChoix) {
		if ( JoueurChoix == 1) {
		    //System.out.println("Vous avez gagné contre le monstre ! ");
		    //System.out.println("Vous allez pouvoir rejoindre le royaume.");
		    winGame = true; 
		}
		else if (JoueurChoix == 2) {
		    System.out.println("Vous avez décidé de vous enfuir malheuresment.");
		    winGame = false;
		}
		return winGame;
	}
	
	
	public void etapesMap () {
		System.out.println("Votre position sur la carte : \n");
		int[][] arr = {{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++)
                System.out.print(arr[row][col] + " ");
                System.out.println(" ");
        }
	    System.out.println("\n");
	}

}
