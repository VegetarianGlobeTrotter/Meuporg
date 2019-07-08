package rencontre;

import outils.UtilitaireRegles;
import personnages.joueur.PersonnageJoueur;
import personnages.nonjoueur.Monstre;

public class RencontreHostile extends Rencontre {

	private Monstre assaillant;

	@Override
	public void derouler(PersonnageJoueur pj) {
		System.out.println("Vous rencontrez un " + this.assaillant.toString());
		do {
			assaillant.effectuerAttaquePhysique(pj);
			pj.effectuerAttaqueMagique(assaillant);
		} while (pj.getPV() > 0 || assaillant.getPV() > 0);
	}

	public RencontreHostile(Monstre monstre) {
		this.assaillant = monstre;
	}

}
