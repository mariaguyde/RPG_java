package RPG;

public class Guerrier extends Personnage {
	
	protected int portefeuilleGuerrier = 500; 

	public Guerrier(String nom) {
		super(nom);
	}
	
	
	public String asciArt () {
		return "      _,.\n"
				+ "    ,` -.)\n"
				+ "   ( _/-\\\\-._\n"
				+ "  /,|`--._,-^|            ,\n"
				+ "  \\_| |`-._/||          ,'|\n"
				+ "    |  `-, / |         /  /\n"
				+ "    |     || |        /  /\n"
				+ "     `r-._||/   __   /  /\n"
				+ " __,-<_     )`-/  `./  /\n"
				+ "'  \\   `---'   \\   /  /\n"
				+ "    |           |./  /\n"
				+ "    /           //  /\n"
				+ "\\_/' \\         |/  /\n"
				+ " |    |   _,^-'/  /\n"
				+ " |    , ``  (\\/  /_\n"
				+ "  \\,.->._    \\X-=/^\n"
				+ "  (  /   `-._//^`\n"
				+ "   `Y-.____(__}\n"
				+ "    |     {__)\n"
				+ "          ()";
		
	}
	

	public int getPortefeuilleJoueur () {
		return portefeuilleGuerrier; 
	}


}
