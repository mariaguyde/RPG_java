package RPG;

public class Pistolet extends armes {
	
	int degatArme = 250; 


	public Pistolet(int NomArme, int Quantite) {
		super(NomArme, Quantite);
		 // TypeArme = "Pistolet";
	}

	public int getDegat () {
		return degatArme;
	}
	
	public void ascii_art() {
		
	    System.out.println("\n");
		System.out.println ( "+--^----------,--------,-----,--------^-,\n"
				+ " | |||||||||   `--------'     |          O\n"
				+ " `+---------------------------^----------|\n"
				+ "   `\\_,---------,---------,--------------'\n"
				+ "     / XXXXXX /'|       /'\n"
				+ "    / XXXXXX /  `\\    /'\n"
				+ "   / XXXXXX /`-------'\n"
				+ "  / XXXXXX /\n"
				+ " / XXXXXX /\n"
				+ "(________(                \n"
				+ " `------' "); 
	    System.out.println("\n");
		
	}
}
