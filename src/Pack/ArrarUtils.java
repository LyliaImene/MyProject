package Pack;

import java.util.Random;

public class ArrarUtils {

	public static int[] fillTab(int[] tab) {

		for (int i = 0; i < tab.length; i++) {

			tab[i] = new Random().nextInt(100); // rempli le tableau de 0 à 99
												// aléatoirement

		}

		return tab;

	}

	public static void printTab(int[] tab) {

		for (int i = 0; i < tab.length; i++) {

			System.out.print(tab[i] + " ");

		}
		System.out.println(); // retour a la ligne pour les prochains affiochage

	}

	public static int getMax(int[] tab) {

		int max = 0;

		for (int i = 0; i < tab.length; i++) {

			if (tab[i] > max) {

				max = tab[i];
			}

		}

		return max;
	}

	public static int somme(int[] tab) {

		int somme = 0;

		for (int i = 0; i < tab.length; i++) {

			int valeur = tab[i];

			somme += valeur;

		}

		return somme;

	}

	public static double moyenne(int[] tab) {

		for (int i = 0; i < tab.length; i++) {

		}
		return somme(tab) / tab.length;
	}

	public static void supMoyenne(int[] tab) {
		double moyenne = moyenne(tab);
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] >= moyenne) {
				System.out.print(tab[i] + " ");
			}
		}
		System.out.println();
	}

	public static int nbMax(int[] tab) {
		int max = getMax(tab);
		int resultat = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				resultat++;
			}
		}
		return resultat;
	}

	public static int nbMaxOpti(int[] tab) {
		int max = Integer.MIN_VALUE;
		int nbOccu = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				nbOccu++;
			} else if (tab[i] > max) {
				nbOccu = 1;
				max = tab[i];
			}
		}
		return nbOccu;
	}

	public static int[] fusion(int[] tab1, int[] tab2) {
		int[] resultat = new int[tab1.length + tab2.length];
		for (int i = 0; i < tab1.length; i++) {
			resultat[i] = tab1[i];
		}

		for (int i = 0; i < tab2.length; i++) {
			resultat[tab1.length + i] = tab2[i];
		}

		return resultat;

	}

}

/*
 *
 * public static int[] exoTableau(int max) {
 *
 * int[] monTab = new int[max]; // Création d'un tableau d'entier de taille
 * 'max' for (int i = 0; i < monTab.length; i++) { monTab[i] = new
 * Random().nextInt(100); // Chiffre Aléatoire de 0 à 99
 *
 * }
 *
 * return monTab;
 *
 * }
 */
