package RPG;

public class Etape1 extends Etapes {
	
	boolean winGame = false;

	
	public Etape1() {
		
	}
	
	public boolean resultatEtape (int JoueurChoix) {
		if ( JoueurChoix == 1) {
		    // System.out.println("Vous avez attaqué le monstre ! Vous avez gagné, vous passez donc au niveau suivant ! ");
		    // System.out.println("Vous avez gagné 100 pesos. ");
		    winGame = true; 
		}
		else if (JoueurChoix == 2) {
		    System.out.println("Vous avez décidé de fuir. Vous perdez donc 150 pesos.");
		    winGame = false;
		}
		return winGame;
	}
	
	public void etapesMap () {
		System.out.println("Votre position sur la carte : \n");
		int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++)
                System.out.print(arr[row][col] + " ");
                System.out.println(" ");

        }
	    System.out.println("\n");
	}

}
