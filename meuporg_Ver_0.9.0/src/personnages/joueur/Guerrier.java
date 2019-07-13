package personnages.joueur;

import personnages.Combattant;

public class Guerrier extends PersonnageJoueur implements Combattant {

	private static int intelligenceDepart = 10;
	private static int agiliteDepart = 10;
	private static int forceDepart = 10;
	private static int pvDepart = 300;
	private static int gainForceParNiveauGuerrier = 2;
	private static int gainIntelligenceParNiveauGuerrier = 2;
	private static int gainAgiliteParNiveauGuerrier = 2;
	private static int gainPvMaxParNiveauGuerrier = 200;
	public static String nomClasseGuerrier = "Guerrier";

	public Guerrier(String name) {
		super(forceDepart, agiliteDepart, intelligenceDepart, pvDepart, gainForceParNiveauGuerrier,
				gainIntelligenceParNiveauGuerrier, gainAgiliteParNiveauGuerrier, gainPvMaxParNiveauGuerrier, name,
				nomClasseGuerrier);
	}
}
