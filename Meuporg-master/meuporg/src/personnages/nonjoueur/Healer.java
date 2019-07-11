package personnages.nonjoueur;

import personnages.joueur.PersonnageJoueur;

public class Healer extends Ami {
	
	private String name = "Healer";

	@Override
	public void copiner(PersonnageJoueur pj) {
		pj.recevoirSoin();
	}
	
	public String toString() {

		return "Vous avez rencontré un ami, il s'agit d'un :" + this.name + " !";
	}

}
