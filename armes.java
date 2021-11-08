package RPG;

import java.util.ArrayList;

public class armes {
	
	//attributs
	private String typeArme; 
	private int quantite; 
	public int degatArme = 0; 
	private int prixArme; 
	private int nomArme; 
	public static int[] IndicesArmes = {1, 2, 3, 4, 5};
	public static String[] Valeurs = {"Épée(s)", "Sabre(s)", "Pistolet(s)", "Potion(s) magique(s)", "Baguette(s) magique(s)"};

	
	
	//constructeur 
	public armes (int armeAchat, int Quantite) {
		nomArme = armeAchat; 
		//typeArme = TypeArme; 
		quantite = Quantite; 
		//degatArme = DegatArme; 
		//prixArme = Price; 	
	}

	
	public void ascii_art() {
		
		
	}
	
	public static void TableauArme ( ArrayList TableauJoueurArme, String achat) {
		TableauJoueurArme.add(achat);
		System.out.println("Vous avez acheté " + TableauJoueurArme);
	}
	
	
	public int getdegatArme () {
		return degatArme; 
	}
}
