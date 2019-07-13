package rencontre;

import personnages.joueur.PersonnageJoueur;
import personnages.nonjoueur.Ami;

public class RencontreAmi extends Rencontre {

	private Ami ami;

	@Override
	public void derouler(PersonnageJoueur pj) {
		System.out.println(this.ami.toString());
		ami.copiner(pj);
	}

	public RencontreAmi(Ami ami) {
		this.ami = ami;
	}

}
