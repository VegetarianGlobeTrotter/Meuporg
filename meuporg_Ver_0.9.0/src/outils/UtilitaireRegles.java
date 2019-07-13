package outils;

import java.util.Random;
import java.util.Scanner;

import personnages.joueur.*;
import personnages.nonjoueur.*;
import rencontre.*;

public class UtilitaireRegles {

	public static Rencontre pickRencontre() {
		int nombreAleatoire = operationAleatoire(100);
		if (nombreAleatoire < 70) {
			Monstre monstre = pickMonstre();
			return new RencontreHostile(monstre);
		} else if (nombreAleatoire < 90) {
			Ami coach = new Healer();
			return new RencontreAmi(coach);
		} else {
			Ami healer = new Coach();
			return new RencontreAmi(healer);
		}
	}

	public static PersonnageJoueur pickPersonnage() {
		PersonnageJoueur pj;
		boolean estChoisi = false;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Choisissez un personnage: Guerrier/Voleur/Mage ");
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("Guerrier")) {
				System.out.print("Vous avez cree un Guerrier du nom de " + name + " .");
				return pj = new Guerrier(name);
			} else if (name.equalsIgnoreCase("Voleur")) {
				System.out.print("Vous avez cree un Voleur du nom de " + name + " .");
				return pj = new Voleur(name);
			} else {
				System.out.print("Vous avez cree un Mage du nom de " + name + " .");
				return pj = new Mage(name);
			}
		} while (estChoisi);

	}

	public static Monstre pickMonstre() {
		int nombreAleatoire = operationAleatoire(100);
		if (nombreAleatoire < 70) {
			return new Gobelin();
		} else if (nombreAleatoire < 90) {
			return new Hobgobelin();
		} else {
			return new Gobelours();
		}
	}

	public static int operationAleatoire(int valeurAleatoire) {
		Random rand = new Random();
		int nombreAleatoire = rand.nextInt(valeurAleatoire) + 1;
		return nombreAleatoire;
	}

	public static void afficherStatusActuelPj(PersonnageJoueur pj) {
		System.out.println("Votre personnage est un "+pj.getNomClasse()+".");
		System.out.println("Son total de pv actuels est de "+pj.getPV()+" \n");
		System.out.println("Son potentiel max de pv est de "+pj.getPvMax()+" \n");
		System.out.println("Son total de xp actuels est de "+pj.getXp()+" \n");
		System.out.println("Sa caracteristique de force est de "+pj.getForce()+" \n");
		System.out.println("Sa caracteristique d'agilité est de "+pj.getAgilite()+" \n");
		System.out.println("Sa caracteristique d'intelligence est de "+pj.getIntelligence()+" \n");
	}

}
