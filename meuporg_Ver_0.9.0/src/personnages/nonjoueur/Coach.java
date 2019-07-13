package personnages.nonjoueur;

import personnages.joueur.PersonnageJoueur;

public class Coach extends Ami {
	
	private String name = "Coach";


	@Override
	public void copiner(PersonnageJoueur pj) {
		pj.gagnerNiveau(true);
	}
	
	public String toString() {

		return "Vous avez rencontr� un ami, il s'agit d'un :" + this.name + " !";
	}

}
