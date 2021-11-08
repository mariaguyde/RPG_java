package RPG;

import java.util.Scanner;

public class Etape2 extends Etapes {


	boolean winGame = false;

	
	public boolean resultatEtape (int JoueurChoix) {

		if ( JoueurChoix == 1) {
			
			boolean statusMiniGame;
			do {
				 System.out.println("\n");
			     System.out.println("Veuillez choisir entre ces 3 choix : ");
			     System.out.println("1 - Feuille 2 - Ciseaux 3 - Pierre"); 
			     System.out.println("Rentrez le numéro de votre choix.");

			     
			     int JoueurChoix2;
				 Scanner Choix = new Scanner (System.in);
			     JoueurChoix2 = Choix.nextInt();
				 Choix.nextLine();
				 int min = 1;
			     int max = 3;
			     int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			      //System.out.println(random_int);
			      
			     
			      // Choix de l'ordinateur
			      if (random_int == 1) {
			    	  System.out.println("Le sorcier a choisi la feuille.");
			      }
			      else if (random_int == 2) {
			    	  System.out.println("Le sorcier a choisi ciseaux.");
			      }
			      else if (random_int == 3) {
			    	  System.out.println("Le sorcier a choisi pierre.");
			      }
			      
			      
			 
			      // Résultats du mini-jeu
			      if ((JoueurChoix2 == 3 && random_int == 1) ||  (JoueurChoix2 == 1 && random_int == 2 ) || (JoueurChoix2 == 2 && random_int == 3 )) {
					    System.out.println("Vous avez perdu contre le sorcier ! Veuillez rejouer! ");
					    statusMiniGame = true;
					    winGame = false;
			      }
			      else if ((JoueurChoix2 == 1 && random_int == 3) ||  (JoueurChoix2 == 2 && random_int == 1 ) ||  (JoueurChoix2 == 3 && random_int == 2 )) {
			    	  System.out.println("Vous avez gagné contre le sorcier ! ");
					    System.out.println("Vous pouvez désormais quitter la forêt et vous diriger vers la dernière étape de votre aventure.  ");
					    statusMiniGame = false;
					    winGame = true;
					    break;
			    	  
			      }
			      else if (JoueurChoix2 == random_int) {
			    	  System.out.println("Il y a égalité ! Veuillez rejouer! ");
					    statusMiniGame = true;
					    winGame = false;
			      }
		      		      
			} while (statusMiniGame  = true);
		      
        }
		
		// dans le cas, le joueur ne veut pas jouer au mini-jeu
		else if (JoueurChoix == 2) {
		    System.out.println("Vous avez décidé de payer afin de quitter la forêt. Vous avez perdu 150 pesos. Et vous pouvez continuer votre aventure. \n");
		     winGame = false;
		}
		return winGame;
	}

	
	public void etapesMap () {
		System.out.println("Votre position sur la carte : \n");
		int[][] arr = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++)
                System.out.print(arr[row][col] + " ");
                System.out.println(" ");

        }
	    System.out.println("\n");
	}
}
