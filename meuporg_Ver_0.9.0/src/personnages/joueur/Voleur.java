package personnages.joueur;

import personnages.Combattant;

public class Voleur extends PersonnageJoueur implements Combattant {

	private static int intelligenceDepart = 10;
	private static int agiliteDepart = 10;
	private static int forceDepart = 10;
	private static int pvDepart = 300;
	private static int gainForceParNiveauVoleur = 2;
	private static int gainIntelligenceParNiveauVoleur = 2;
	private static int gainAgiliteParNiveauVoleur = 2;
	private static int gainPvMaxParNiveauVoleur = 200;
	public static String nomClasseVoleur = "Voleur";

	public Voleur(String name) {
		super(forceDepart, agiliteDepart, intelligenceDepart, pvDepart, gainForceParNiveauVoleur,
				gainIntelligenceParNiveauVoleur, gainAgiliteParNiveauVoleur, gainPvMaxParNiveauVoleur, name,
				nomClasseVoleur);
	}

}
