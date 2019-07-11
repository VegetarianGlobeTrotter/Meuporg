package rencontre;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import outils.GestionSauvegarde;
import outils.UtilitaireRegles;
import personnages.joueur.PersonnageJoueur;

public class Partie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nbTours;
	private PersonnageJoueur pj;
	private Rencontre rencontreEnCours;

	public Partie(PersonnageJoueur pj, int nbTours) {
		this.pj = pj;
		this.nbTours = nbTours;
	}

	public Partie() {

	}

	public int getNbTours() {
		return nbTours;
	}

	public void compteurNbTours() {
		this.nbTours++;
	}

	public PersonnageJoueur getPj() {
		return this.pj;
	}

	public void demarrerpartie() {
		this.pj = UtilitaireRegles.pickPersonnage();
	}

	public void partieEnCours() {

		this.rencontreEnCours = deroulerTour(pj);
		this.rencontreEnCours.derouler(pj);
	}

	public Rencontre deroulerTour(PersonnageJoueur pj) {
		System.out.println("L\'aventure continue");
		compteurNbTours();
		return UtilitaireRegles.pickRencontre();
	}
}
