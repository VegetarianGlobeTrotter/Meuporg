package rencontre;

import java.io.Serializable;

import personnages.joueur.PersonnageJoueur;

public abstract class Rencontre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void derouler(PersonnageJoueur pj);

}
