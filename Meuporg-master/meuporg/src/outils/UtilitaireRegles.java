package outils;

import java.util.Random;
import java.util.Scanner;

import personnages.joueur.*;
import personnages.nonjoueur.*;
import rencontre.*;

public class UtilitaireRegles {

	public static Rencontre pickRencontre() {
		Rencontre rencontre;
		int nombreAleatoire = operationAleatoire(100);
		if (nombreAleatoire < 70) {
			Monstre monstre = pickMonstre();
			return rencontre = new RencontreHostile(monstre);
		} else if (nombreAleatoire < 90) {
			Ami coach = new Healer();
			return rencontre = new RencontreAmi(coach);
		} else {
			Ami healer = new Coach();
			return rencontre = new RencontreAmi(healer);
		}
	}

	public static PersonnageJoueur pickPersonnage() {
		PersonnageJoueur pj;
		boolean estChoisi = false;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Choisissez un personnage: Guerrier/Voleur/Mage ");
			String name = scanner.nextLine();
			System.out.print("Choisissez le niveau du personnage: " + name);
			int niveauSouhaite = scanner.nextInt();
			System.out.print("Vous avez cree un " + name + " de niveau " + niveauSouhaite + " .");
			if (name.equalsIgnoreCase("Guerrier")) {
				return pj = new Guerrier(name, niveauSouhaite);
			} else if (name.equalsIgnoreCase("Voleur")) {
				return pj = new Voleur(name, niveauSouhaite);
			} else {
				return pj = new Mage(name, niveauSouhaite);
			}
		} while (estChoisi);

	}

	public static Monstre pickMonstre() {
		Monstre monstre;
		int nombreAleatoire = operationAleatoire(100);
		if (nombreAleatoire < 70) {
			return monstre = new Gobelin();
		} else if (nombreAleatoire < 90) {
			return monstre = new Hobgobelin();
		} else {
			return monstre = new Gobelours();
		}
	}

	public static int operationAleatoire(int valeurAleatoire) {
		Random rand = new Random();
		int nombreAleatoire = rand.nextInt(valeurAleatoire) + 1;
		return nombreAleatoire;
	}

}
