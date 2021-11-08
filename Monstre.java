package RPG;

public class Monstre {
	
	//attributs 
    private String nomMonstre; 
    private int nombreViesMonstre; 
    
    //constructeur 
    public Monstre (String NomMonstre, int NombreVies) {
    	nomMonstre = NomMonstre; 
    	nombreViesMonstre = NombreVies; 
    }
    
    
    //méthode pour enlever une vie au monstre
    public int diminueNombreViesMonstre () {
        nombreViesMonstre -= nombreViesMonstre; /*- armes.getdegatArme(); */
    	return nombreViesMonstre;
    }
    
    public int getMonstreVies () {
		return nombreViesMonstre;
    	
    }

}
