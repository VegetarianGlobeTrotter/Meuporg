package rencontre;

import outils.UtilitaireRegles;
import personnages.joueur.PersonnageJoueur;
import personnages.nonjoueur.Monstre;

public class RencontreHostile extends Rencontre {

	private Monstre assaillant;

	@Override
	public void derouler(PersonnageJoueur pj) {
		System.out.println(this.assaillant.toString());
		do {System.out.println(pj.getPV());
			pj.effectuerAttaquePhysique(assaillant);
			System.out.println(assaillant.getPV());
			assaillant.effectuerAttaquePhysique(pj);
		} while (pj.getPV() > 0 && assaillant.getPV() > 0);
		if (pj.isAlive()) {
			pj.gagnerExperience(assaillant);
			pj.gagnerNiveau(false);
		} else {
			UtilitaireRegles.afficherStatusActuelPj(pj);
			System.out.println(pj.toString() + " a succombé");
			System.out.println("Merci d'avoir joué");
			System.exit(0);
		}
	}

	public RencontreHostile(Monstre monstre) {
		this.assaillant = monstre;
	}

}
