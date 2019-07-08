package personnages.joueur;

import personnages.Combattant;

public class Guerrier extends PersonnageJoueur implements Combattant {

	private static int intelligenceDepart = 10;
	private static int agiliteDepart = 10;
	private static int forceDepart = 10;
	private static int pvDepart = 300;

	public Guerrier(String name, int niveauDepart) {
		super(forceDepart, agiliteDepart, intelligenceDepart, pvDepart, niveauDepart, name);
	}

}
