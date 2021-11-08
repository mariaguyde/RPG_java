package RPG;

public class Personnage implements Humain {
	
	// Attributs 
	String nomPerso; 
    //Compte Solde du joueur 
	static int Portefeuille = 500; 
	 // XP du joueur 
	static int xp = 0; 
	String Arme; 
	
	public Personnage (String nom) {
		this.nomPerso = nom;
	}


	//méthodes 
	public String getNomPerso () {
		return nomPerso;
	}
	
	public int getPortefeuilleJoueur () {
		return Portefeuille; 
	}
	
	public static void ajoutArgentPortefeuille (int gain, int quantite) {
		int gainRelle = gain * quantite; 
		int result = Portefeuille += gainRelle;
		System.out.println(result + " dinos");
	}	
	
	public static boolean retraitArgentPortefeuille (int perte, int quantite) {
		int perteRelle = perte * quantite; 
		boolean resultCompte = false; 
		if (Portefeuille - perteRelle < 0 ) {
			System.out.println("Il vous reste " + Portefeuille + " dinos.");
			System.out.println("Vous pouvez plus rien acheter ou vous n'avez pas assez d'argent pour acheter cela. ");
			resultCompte = false;
		} else {
			System.out.println("Il vous reste "+ (Portefeuille -= perteRelle) + " dinos.");
			resultCompte = true;
		}
		return resultCompte;
	}
	
	public static void augmenterXP () {
		System.out.println("XP : " + (xp += 1)); 
	}
	
	public int getXP () {
		return xp;
	}
}
