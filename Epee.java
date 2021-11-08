package RPG;

public class Epee extends armes {
	
	int degatArme = 150; 

	public Epee(int NomArme, int Quantite) {
		super(NomArme, NomArme);
		// TypeArme = "Epee";
	}
	
	//méthode pour attaquer avec son arme 
	public String EpeeAttack () {
		return "Vous avez attaqué le monstre.";
	}
	
	public void ascii_art() {
		
	    System.out.println("\n");
		System.out.println ( "      /| ________________\n"
				           + "O|===|* >________________>\n"
			           	+ "      \\| "); 
	    System.out.println("\n");
	}
	
	public int getDegat () {
		return degatArme;
	}
}
