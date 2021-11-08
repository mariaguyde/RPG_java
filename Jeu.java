package RPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Jeu {
	
	public static void main(String[] args) {
		
		boolean statusMenus = true;
    	ArrayList<armes> TabArmesPlayer = new ArrayList<armes>();
        int totalDegatArme = 0; 
        int CreatePersoStatus = 0; 
		
		
		/*------------------------------ DÉFINITION DE LA FENÊTRE (JFRAME) ET MESSAGE DE BIENVENUE ---------------------------------*/
		System.out.println("=================================== Bienvenue à MeyLand ===================================== \n \n \n");
		
		// carte ASCII 
		System.out.println("            ~        ~          ~            ~        ~\n"
				+ " ~                                  _.,-'=_.-'-._  ~        ~\n"
				+ "         ~     ~           ~   ._.-'             '-._   ~\n"
				+ "                      _.-':_.-'                      '-._   ~     ~\n"
				+ "                  _.-'                                   '-._.'-._\n"
				+ "   ~       .-'.-,'                                                '-.\n"
				+ "           '-._                       /\\   /\\                    _.-'\n"
				+ " ~             '-.           (o)(o)  /  \\ /  \\                ._'\n"
				+ "           ~      '-._         (/      /\\ (           _.'-._,-'\n"
				+ "                      '-._            /  \\ )      _.-'   (o o)\n"
				+ " ~     ) ( ) (    ~     .-'               (     .'       ))~((  ~\n"
				+ "      ) \" ( \" (        .-'                 )    '-._.,.            ~\n"
				+ "     )  \"  (\"  (       '-._               /           '-._  ~ \n"
				+ "    )   \"   (   ( ___      '-._          (                '.   ~\n"
				+ "        \"   \"    |   | ~      .'          )                '-._\n"
				+ "  ---._-|--|--|--|--/     _.-'           /  (o)(o)           _.'   ~\n"
				+ "       \\ o  o  o  o/     '-._           /    (  )           '-._-'-.\n"
				+ "   ~~~~~~~~~~~~~~~~~         '-._      (                        _.-'\n"
				+ "  ~          ~             ~     '-.    ) /\\            _.-\"._,'\n"
				+ "                  ~              _.'   / /\\ /\\         '.  ~    (o o)\n"
				+ "    (o o)              _.-'-._.-'     / /  \\  \\          '-._._ ))~((\n"
				+ "    ))~(( ~        _.-'              /                         '-. ~\n"
				+ "                .-'              .-'('-._                        '-.\n"
				+ " ~            _.'         _.-'-.-'~   ~  '.             _.'-.-'._  .'\n"
				+ "     .-'=_.'-'         .-'  ~   ~   _ _.-'          _.-'     ~   '.'\n"
				+ "  _.-'                 '-._,.-'._.-'    (o)(o)     '_   ~       ~\n"
				+ ".'                                         \\)         '-._   ~    ~\n"
				+ "'-.- = .-'.     (o)(o)                                    '=._\n"
				+ "          '._    (  )                                         '-.\n"
				+ "LGB     ~    :_                                            _.-'.-' ~\n"
				+ "     ~     ~   \"._,-'.-'._    .-`-._;'-._.='._          .-'  ~\n"
				+ "                    ~     '-_.\"      ~    ~   '-._:'=~_.'       ~\n"
				+ "           ~     ~      ~        ~     ~        ~          ~    ~");
	    System.out.println("\n");

		
		
		while (statusMenus = true) {	
			
			
			 	// CRÉATION DU PERSONNAGE 
				// 1. Choix du pseudo de son personage 

				if (CreatePersoStatus == 0) {
				    System.out.println("================================== Création de votre personnage ================================= \n ");
					String Name = "";
					Scanner NomPerso = new Scanner (System.in); 
					System.out.println("Rentrez un pseudo pour votre personnage : ");
					Name = NomPerso.nextLine();
					// Sorciere joueur = new Sorciere(Name);
					System.out.println("Votre personnage s'appellera donc " + Name + ".  \n");
					
					// 2. Choix du rôle de son personnage
					int Role ;
					Scanner RoleJoueur = new Scanner (System.in); 
					System.out.println("Quel type de personnage voulez-vous être ? ");
					System.out.println("1 - Sorcier(e) / 2 - Guerrier(re) / 3 - Magicien(nne)");
				    Role = RoleJoueur.nextInt();
				    //System.out.println(Role);
				    
				    if (Role == 1) {
				        Sorciere joueur = new Sorciere(Name);
					    System.out.println("\n");
					    System.out.println(joueur.getNomPerso() + " sera donc un ou une sorcier(e).");
						System.out.println(joueur.asciArt());
					    System.out.println("\n");
					    System.out.println("Bravo ! Vous avez crée votre personnage. \n" +
					           "Vous pouvez désormais rentrer dans le mode Aventure et jouer avec ce personnage !\n");
						System.out.println("Vous avez actuellement " + joueur.getPortefeuilleJoueur()+ " dinos.");
	
				    }
				    else if (Role == 2) {
				    	Guerrier joueur = new Guerrier(Name);
					    System.out.println("\n");
				    	System.out.println(joueur.getNomPerso() + " sera donc un ou une guerrier(e).");
						System.out.println(joueur.asciArt());
					    System.out.println("\n");
						System.out.println("Bravo ! Vous avez crée votre personnage. \n" +
						          "Vous pouvez désormais rentrer dans le mode Aventure et jouer avec ce personnage !\n");
						System.out.println("Vous avez actuellement " + joueur.getPortefeuilleJoueur()+ " dinos.");
					} 
				    else if (Role == 3) {
				    	Magicien joueur = new Magicien(Name);
					    System.out.println("\n");
				    	System.out.println(joueur.getNomPerso() + " sera donc un ou une magicien(nne).");
						System.out.println(joueur.asciArt());
					    System.out.println("\n");
						System.out.println("Bravo ! Vous avez crée votre personnage. \n" +
						          "Vous pouvez désormais rentrer dans le mode Aventure et jouer avec ce personnage !\n");
						System.out.println("Vous avez actuellement " + joueur.getPortefeuilleJoueur()+ " dinos. \n");
					}
				    CreatePersoStatus++;
					System.out.println("=============================================================================================== \n");
				}
				
			
				// Menus 
				System.out.println("====================================== Choix des menus ======================================== \n ");
			    Scanner MenuChoixInput = new Scanner (System.in); 
			    System.out.println("\n 1- Magasin d'armes / 2-  Mode Aventure / 3- Mini jeu ");
			    System.out.println("Veuillez rentrer le numéro du menu que vous voulez sélectionner.");
			    int MenuChoix = MenuChoixInput.nextInt();
			    MenuChoixInput.nextLine();		
			    Personnage joueurInfos = new Personnage ("joueurinfos");
				System.out.println("=============================================================================================== \n");

			    
		    
			    // On rentre dans le menu en fonction de celui qu'on a choisi 
				if (MenuChoix == 1) {
					
					// MAGASIN D'ARMES 
					System.out.println("====================================== Magasin d'armes ======================================== \n ");
					System.out.println("Bienvenue dans le magasin d'armes !!!" + 
							"Voici ce que l'on a en stock : \n" + 
							"1- Épées / 2- Sabres / 3- Pistolets / 4- Potions magiques / 5- Baguettes magiques \n" +
							"Que voulez - vous acheter ? "); 
				    System.out.println("Veuillez rentrer le numéro de l'arme que vous voulez sélectionner.");
					
					int ArmeAchat; 
					String Achat = "";
					Scanner ChoixArme = new Scanner (System.in);
					ArmeAchat = ChoixArme.nextInt();
					System.out.println("Combien voulez-vous en acheter ?");
					
					int QuantiteArme; 
					Scanner Quantite = new Scanner (System.in);
					QuantiteArme = Quantite.nextInt();
					Quantite.nextLine();
					armes arme1 = new armes(ArmeAchat, QuantiteArme);					
					
					if (ArmeAchat == 1) {
						System.out.println("Vous souhaitez acheter " + QuantiteArme + " " + armes.Valeurs[0]);
					    boolean resultRetrait = joueurInfos.retraitArgentPortefeuille(50, QuantiteArme);
					    // System.out.println(resultRetrait);
					    
					    if (resultRetrait == true) {
					    	  Achat =  QuantiteArme + " " + armes.Valeurs[0];
							  armes.TableauArme(TabArmesPlayer, Achat);
							  Epee epee1 = new Epee(1, QuantiteArme);
							  int degatArme = epee1.getDegat();
							  epee1.ascii_art();
							  //System.out.println(degatArme);
							  totalDegatArme += (degatArme * QuantiteArme); 
							  //System.out.println(totalDegatArme);
					    }
					    
					}
					else if (ArmeAchat == 2) {
						 System.out.println("Vous souhaitez acheter " + QuantiteArme + " " + armes.Valeurs[1]);
						 boolean resultRetrait = joueurInfos.retraitArgentPortefeuille(50, QuantiteArme);
					     Achat =  QuantiteArme + " " + armes.Valeurs[1];
						
						 if (resultRetrait == true) {
					    	  Achat =  QuantiteArme + " " + armes.Valeurs[1];
							  armes.TableauArme(TabArmesPlayer, Achat);
						      Sabre sabre1 = new Sabre (1, QuantiteArme);
							  int degatArme = sabre1.getDegat();
							  sabre1.ascii_art();
							  //System.out.println(degatArme);
							  totalDegatArme += (degatArme * QuantiteArme); 
							  //System.out.println(totalDegatArme);
					    }
						 
					}
					else if (ArmeAchat == 3) {
						 System.out.println("Vous souhaitez acheter " + QuantiteArme + " " + armes.Valeurs[2]);
						 boolean resultRetrait = joueurInfos.retraitArgentPortefeuille(50, QuantiteArme);
					     Achat =  QuantiteArme + " " + armes.Valeurs[2];
						
						 if (resultRetrait == true) {
					    	  Achat =  QuantiteArme + " " + armes.Valeurs[2];
							  armes.TableauArme(TabArmesPlayer, Achat);
							  Pistolet pistolet1 = new Pistolet (1, QuantiteArme);
							  int degatArme = pistolet1.getDegat();
							  pistolet1.ascii_art();
							  //System.out.println(degatArme);
							  totalDegatArme += (degatArme * QuantiteArme); 
							  //System.out.println(totalDegatArme);
					    }
					}
					else if (ArmeAchat == 4) {
						System.out.println("Vous souhaitez acheter " + QuantiteArme + " " + armes.Valeurs[3]);
						boolean resultRetrait = joueurInfos.retraitArgentPortefeuille(50, QuantiteArme);
					    Achat =  QuantiteArme + " " + armes.Valeurs[3];
						
						 if (resultRetrait == true) {
					    	  Achat =  QuantiteArme + " " + armes.Valeurs[3];
							  armes.TableauArme(TabArmesPlayer, Achat);
							  Potions Potions1 = new Potions (1, QuantiteArme);
							  int degatArme = Potions1.getDegat();
							  Potions1.ascii_art();
							  //System.out.println(degatArme);
				    		  totalDegatArme += (degatArme * QuantiteArme); 
							  //System.out.println(totalDegatArme);
					    }
					}
					else if (ArmeAchat == 5) {
						System.out.println("Vous souhaitez acheter " + QuantiteArme + " " + armes.Valeurs[4]);
						
						if (joueurInfos.getXP() > 10) {
							boolean resultRetrait = joueurInfos.retraitArgentPortefeuille(50, QuantiteArme);
						    Achat =  QuantiteArme + " " + armes.Valeurs[4];
							
							 if (resultRetrait == true) {
						    	  Achat =  QuantiteArme + " " + armes.Valeurs[4];
								  armes.TableauArme(TabArmesPlayer, Achat);
								  BaguetteMagique BaguetteMagique1 = new BaguetteMagique (1, QuantiteArme);
							   	  int degatArme = BaguetteMagique1.getDegat();
							   	  BaguetteMagique1.ascii_art();
								  //System.out.println(degatArme);
								  totalDegatArme += (degatArme * QuantiteArme); 
								  //System.out.println(totalDegatArme);
						    }
						} else {
							System.out.println("Vous n'avez pas assez de XP. Vous pouvez aller dans le mode Mini-jeu pour en gagner et pouvoir acheter cette arme ! \n");
						}	
					}
					System.out.println("=============================================================================================== \n");
				}
				else if (MenuChoix == 2) {
					
					// MODE AVENTURE
					System.out.println("=============================== Bienvenue au mode aventure ! ============================ ");
					System.out.println("Pour gagner ce jeu, vous devez passer les 3 niveaux qui ont chacun des obstacles différents. \n");
	
					System.out.println("         =============================== Étape 1 ============================ \n");

					// ÉTAPE 1
					Etape1 etape1 =  new Etape1();
					etape1.etapesMap();
					Monstre monstre1 = new Monstre ("MonstreEtape1", 100);
					System.out.println("Vous devez traverser la rivière Feinoi et vous rencontrez votre premier monstre qui court vers vous." + " \n" + 
					"Que feriez-vous ? " + "Vous avez deux choix");
					System.out.println("1 - L'attaquer / 2- Courir pour se réfurgir dans une cachette et attendre que le monstre part");
					
					int Etape1JoueurChoix; 
					Scanner Etape1Choix = new Scanner (System.in);
					Etape1JoueurChoix = Etape1Choix.nextInt();
					Etape1Choix.nextLine();
					boolean resultStep1 = etape1.resultatEtape(Etape1JoueurChoix);
					// System.out.println(resultStep1);
				
					
					if (resultStep1 == true) {
						 System.out.println("Voici les armes que vous possèdez : " + TabArmesPlayer);

						if ((totalDegatArme - monstre1.getMonstreVies()) > 0 ) {
							System.out.println("Vos armes sont assez puissants pour combattre le monstre. Étant donné que vous avez gagné contre le monstre, vous avez gagné 100 dinos. Vous avez actuellement : ");
							joueurInfos.ajoutArgentPortefeuille(100, 1);
							joueurInfos.augmenterXP();
						    System.out.println("\n");
						}
						else if ((totalDegatArme - monstre1.getMonstreVies()) < 0) {
							System.out.println("Vos armes ne sont assez puissants pour battre le monstre. Vous allez devoir vous cacher et attendre que les monstre repart. \n");

						}
					} 
					else if (resultStep1 == false) {
						joueurInfos.retraitArgentPortefeuille(150, 1);
					}
	
					System.out.println("         ==================================================================== \n");

					
					System.out.println("         =============================== Étape 2 ============================ \n");

					// ÉTAPE 2 
					Etape2 etape2 =  new Etape2();
					etape2.etapesMap();
	
					System.out.println("Une fois que vous avez traversée la rivière. Vous traversez une forêt et afin de "
							+ "la quitter un sorcier vous demander de gagner un jeu contre lui."
							+ "Il va falloir simplement que vous gagner à pierre feuille ciseaux au moins une fois contre le sorcier. Sinon vous allez devoir payer. " + " \n" + 
							"Que feriez-vous ? " + "Vous avez deux choix");
					System.out.println("1 - Jouer au jeu  / 2- Le payer directement pour quitter la forêt");
					int Etape2JoueurChoix;
					Scanner Etape2Choix = new Scanner (System.in);
					Etape2JoueurChoix = Etape2Choix.nextInt();
					Etape2Choix.nextLine();
					boolean resultStep2 = etape2.resultatEtape(Etape2JoueurChoix);
					
					if (resultStep2 == true) {
						System.out.println("Étant donné que vous avez gagné contre le sorcier, vous avez gagné 100 dinos. Vous avez actuellement : ");
						joueurInfos.ajoutArgentPortefeuille(100, 1);
						joueurInfos.augmenterXP();
					    System.out.println("\n");
					}
					else if (resultStep2 == false) {
						joueurInfos.retraitArgentPortefeuille(150, 1);
					}
					System.out.println("         ==================================================================== \n");

					
					System.out.println("         =============================== Étape 3 ============================ \n");

					// ÉTAPE 3 
					Etape3 etape3 = new Etape3();
					etape3.etapesMap();
					Monstre monstre3 = new Monstre ("MonstreEtape3", 400);
					System.out.println("Vous arrivez bientôt au royaume que vous devez rejoindre. "
							+ "Toutefois, vous voyez un monstre à nouveau cette fois bien plus gros que celui d'avant. "
							+ "Afin de rejoindre les portes du royaume qui se situent plus très loin, il va falloir le battre"+"Que feriez-vous ? " ); 
					System.out.println("1 - Combattre le monstre  / 2- S'enfuir et renoncer au nouveau royaume qui t'attend");
					int Etape3JoueurChoix;
					Scanner Etape3Choix = new Scanner (System.in);
					Etape3JoueurChoix = Etape3Choix.nextInt();
					Etape3Choix.nextLine();
					boolean resultStep3 = etape3.resultatEtape(Etape3JoueurChoix);
					
					if (resultStep3 == true) {
						
						System.out.println("Voici les armes que vous possèdez : " + TabArmesPlayer);
	
						if ((totalDegatArme - monstre3.getMonstreVies()) > 0 ) {
							System.out.println("Vos armes sont assez puissantes pour gagner contre le monstre. Étant donné que vous avez gagné contre le monstre, vous avez gagné 100 dinos. Vous avez actuellement : ");
							joueurInfos.ajoutArgentPortefeuille(100, 1);
							joueurInfos.augmenterXP();
						    System.out.println("\n");
						}
						else if ((totalDegatArme - monstre3.getMonstreVies()) < 0) {
							System.out.println("Vos armes ne sont assez puissants pour battre le monstre. Vous allez devoir vous enfuir et retenter l'aventure pour rejoindre le royaume.");
						}
					}
					else if (resultStep3 == false) {
						joueurInfos.retraitArgentPortefeuille(50, 1);
						//System.out.println("dinos");
					}
					System.out.println("=============================================================================================== \n");

					
				}
				
				else if (MenuChoix == 3) {
					System.out.println("====================================== Mini - jeu ============================================= \n ");

					System.out.println("Vous êtes dans le mode jeu individuel. Vous pouvez gagner des points d'XP afin de pouvoir acheter l'arme la plus puissante la baguette magique.");
					System.out.println("Connaissez-vous le principe de la bataille de cartes ? On va jouer au même jeu mais avec les nombres. Vous me donnerez un nombre au hasard compris entre 0 et 20.");
					System.out.println("Si vous gagnez, vous gagnerez des XP. Veuillez donc rentrer un nombre compris entre 0 et 20."); 
					
					int JoueurChoix;
					Scanner Choix = new Scanner (System.in);
					JoueurChoix = Choix.nextInt();
					Choix.nextLine();
				 
				    	 int winTime = 0; 
						 int min = 0;
					     int max = 20;
					     int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
					      
					      if (JoueurChoix > random_int) {
					    	  System.out.println("Le chiffre que j'ai choisi est " + random_int + " et vous avez choisi " + JoueurChoix);
					    	  System.out.println("Vous avez gagné !");
					    	  winTime++; 
				    		  joueurInfos.augmenterXP();
				    	  }
					      else if  (JoueurChoix < random_int){
					    	  System.out.println("Le chiffre que j'ai choisi est " + random_int + " et vous avez choisi " + JoueurChoix);
					    	  System.out.println("Votre nombre est plus petit malheuresement... Recommencez une prochaine fois.");
					      }
					System.out.println("=============================================================================================== \n");
			    }
		 }		
	 } 
}
