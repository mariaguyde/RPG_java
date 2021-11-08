package RPG;

public class Sabre extends armes {

	int degatArme = 180; 

	
	public Sabre(int NomArme, int Quantite) {
		super(NomArme, Quantite);
		//TypeArme = "Sabre";
	}
	
	public int getDegat () {
		return degatArme;
	}
	
public void ascii_art() {
	
        System.out.println("\n");
		System.out.println ( ",---,_\n"
				+ " /'_______`\\\n"
				+ "(/'       `\\|___________----------\"\"\"\"\"\"\"------,\n"
				+ " \\#########||______                          /'\n"
				+ "  ^^^^^^^^^||      \"\"\"\"\"\"-----_____        /'\n"
				+ "            \\                      \"\"\"--_/"); 
	    System.out.println("\n");
		
	}
	

}

         