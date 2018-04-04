package Pack;

import java.util.Random;

public class ExoMaison {

	Maison m = new Maison();
	Maison m2 = new Maison();

	/// ** Affiche la largeur, longueur de la maison
	public static void printMaison(Maison m) {

		System.out.println("La maison : " + m.largeur + "x" + m.longueur);

	}

	// Double les tailles de la maison
	public static void doubleMaison(Maison m) {

		m.largeur *= 2;
		m.longueur *= 2;

	}

	// Retourne la maison la plus grande*/
	public static Maison bigMaison(Maison m1, Maison m2) {
		if (m1 == null && m2 == null) {// cette partie au cas ou la maison est
										// nulle
			return null;

		} else if (m1 == null) {

			return m2;

		}

		else if (m2 == null) {

			return m1;
		}

		else if (m1.largeur * m1.longueur > m2.largeur * m2.longueur) {
			return m1;

		}

		else if (m1.largeur * m1.longueur < m2.largeur * m2.longueur) {
			return m2;
		}

		return null;
	}

	// Remplit le tableau de maison avec des tailles aléatoires

	public static void createMaisons(Maison[] tab) {

		for (int i = 0; i < tab.length; i++) {

			tab[i] = new Maison();
			tab[i].largeur = new Random().nextInt(100);
			tab[i].longueur = new Random().nextInt(100);

		}

	}

	// Double les tailles de la maison
	public static void printMaisons(Maison[] tab) {

	}

	// Retourne la maison la plus grande*/
	/*
	 * public static Maison bigMaison (Maison[] tab) {
	 *
	 *
	 * }
	 */

}