package RPG;

public class Sorciere extends Personnage {
	
	public Sorciere(String nom) {
		super(nom);
	}
	
	public String asciArt () {
		return "                      /\\\n"
				+ "                    _/__\\_\n"
				+ "                    /( o\\\n"
				+ "               /|  // \\-'\n"
				+ "          __  ( o,    /\\\n"
				+ "            ) / |    / _\\\n"
				+ "     >>>>==(_(__u---(___ )-----\n"
				+ "                       //\n"
				+ "                      /__)ns\n"
				+ "-";
		
	}


}
