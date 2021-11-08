package RPG;

public class Potions extends armes {

	int degatArme = 450; 

	
	public Potions(int armeAchat, int Quantite) {
		super(armeAchat, Quantite);
	}

	public int getDegat () {
		return degatArme;
	}
	
	public void ascii_art() {
		
	    System.out.println("\n");
		System.out.println ( "   `.___,'\n"
				+ "      (___)\n"
				+ "      <   >\n"
				+ "       ) (\n"
				+ "      /`-.\\\n"
				+ "     /     \\\n"
				+ "    / _    _\\\n"
				+ "   :,' `-.' `:\n"
				+ "   |         |\n"
				+ "   :         ;\n"
				+ "    \\       /\n"
				+ "     `.___.'   "); 
	    System.out.println("\n");
	}
}
