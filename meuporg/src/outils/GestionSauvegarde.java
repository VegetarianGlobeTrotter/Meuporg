package outils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import rencontre.Partie;

public class GestionSauvegarde {

	public static void sauvegarde(Partie partie) {
		try {
			// ecrire objet dans un fichier

			File file = new File("C:\\Users\\formation.DESKTOP-P20EK9L\\Desktop\\save.txt");

			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(partie);
			oos.close();

			System.out.println("La partie a �t� sauvegard�");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Partie chargement() {
		Partie partie = null;
		try {
			File file = new File("C:\\Users\\formation.DESKTOP-P20EK9L\\Desktop\\save.txt");
			// lire objet depuis un fichier
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			partie = (Partie) ois.readObject();
			ois.close();

			System.out.println(
					"La partie charg� est � :" + partie.getNbTours() + ", le personnage choisi est :" + partie.getPj());


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return partie;
	}

}
