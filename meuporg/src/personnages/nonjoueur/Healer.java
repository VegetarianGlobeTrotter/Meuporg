package personnages.nonjoueur;

import personnages.joueur.PersonnageJoueur;

public class Healer extends Ami {

	@Override
	public void copiner(PersonnageJoueur pj) {
		pj.recevoirSoin();
	}

}
