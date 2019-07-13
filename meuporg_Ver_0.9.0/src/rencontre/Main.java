package rencontre;

import java.util.Scanner;

import outils.GestionSauvegarde;
import outils.UtilitaireRegles;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String reponse;
		Partie partie = null;
		int nbreToursAvtSauvegarde = 5;

		System.out.println("Voulez-vous charger une partie existante");
		reponse = scanner.nextLine();
		if (reponse.contentEquals("oui")) {
			partie = GestionSauvegarde.chargement();
		} else {
			partie = new Partie();
			partie.demarrerpartie();

		}

		do {
			partie.partieEnCours();
			nbreToursAvtSauvegarde--;

			if (nbreToursAvtSauvegarde <= 0) {
				UtilitaireRegles.afficherStatusActuelPj(partie.getPj());
				System.out.println("Voulez-vous sauvegarder votre progression?");
				reponse = scanner.nextLine();
				if (reponse.equalsIgnoreCase("oui")) {
					GestionSauvegarde.sauvegarde(partie);
				}
				System.out.println("Voulez-vous quitter la partie? oui/non");
				reponse = scanner.nextLine();
				if (reponse.equalsIgnoreCase("oui")) {
					System.out.println("Merci d'avoir joué");
					System.exit(0);
				} else {
					System.out.println("L\'aventure continue");
				}
				nbreToursAvtSauvegarde = 5;
			}

		} while (partie.getPj().isAlive() || partie.getNbTours() < 15);
		scanner.close();
		System.out.println("Vous avez gagné, votre " + partie.getPj().getName() + " a triomphé, Merci d'avoir joué");

	}

}
