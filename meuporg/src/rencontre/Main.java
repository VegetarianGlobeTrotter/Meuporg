package rencontre;

import java.util.Scanner;

import outils.GestionSauvegarde;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String reponse;
		Partie partie = null;

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
			}
		} while (partie.getPj().estEnVie() || partie.getNbTours() < 15);
		scanner.close();
	}

}
