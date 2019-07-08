package personnages.nonjoueur;

import personnages.joueur.PersonnageJoueur;

public class Coach extends Ami {

	@Override
	public void copiner(PersonnageJoueur pj) {
		pj.gagnerNiveau();
	}

}
