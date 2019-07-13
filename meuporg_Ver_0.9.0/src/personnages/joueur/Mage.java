package personnages.joueur;

import personnages.Combattant;

public class Mage extends PersonnageJoueur implements Combattant {

	private static int intelligenceDepart = 10;
	private static int agiliteDepart = 10;
	private static int forceDepart = 10;
	private static int pvDepart = 300;
	private static int gainForceParNiveauMage = 2;
	private static int gainIntelligenceParNiveauMage = 2;
	private static int gainAgiliteParNiveauMage = 2;
	private static int gainPvMaxParNiveauMage = 200;
	private static String nomClasseMage = "Mage";

	public Mage(String name) {
		super(forceDepart, agiliteDepart, intelligenceDepart, pvDepart, gainForceParNiveauMage,
				gainIntelligenceParNiveauMage, gainAgiliteParNiveauMage, gainPvMaxParNiveauMage, name, nomClasseMage);
	}

}
