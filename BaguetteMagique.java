package RPG;

public class BaguetteMagique extends armes {

	int degatArme = 350; 

	
	public BaguetteMagique(int armeAchat, int Quantite) {
		super(armeAchat, Quantite);
	}
	
	public int getDegat () {
		return degatArme;
	}
	
	public void ascii_art() {
		
	    System.out.println("\n");
		System.out.println ( "\n"
				+ " \\.`',/  \n"
				+ " = ,. = \n"
				+ " / || \\\n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   || \n"
				+ "   ||"); 
	    System.out.println("\n");
		
	}

}
