package Pack;

public class Depart {

	public static void main(String[] args) {

		/*
		 * int[] tab = new int[100]; ArrarUtils.fillTab(tab);
		 * ArrarUtils.printTab(tab);
		 *
		 * int max = ArrarUtils.getMax(tab); System.out.println("max = " + max);
		 *
		 * int so = ArrarUtils.somme(tab); System.out.println("somme = " + so);
		 *
		 *
		 */

		/*
		 * Maison maison = new Maison();
		 *
		 * //maison.largeur = 5; //maison.longueur = 3;
		 * ExoMaison.printMaison(maison);
		 */

		DeBean de1 = new DeBean();
		System.out.println("valuur de départ = " + de1.getValue());

		de1.setValue(5);
		System.out.println("valeur d'après = " + de1.getValue());

		de1.lancer();
		System.out.println("valeur aléatoire = " + de1.getValue());

		GobletBean goblet1 = new GobletBean();

		goblet1.lancer();// lancement du goblet

		System.out.println(goblet1.getScoreDe()); // recuperation de la valeur
													// Score des deux dés

		/*
		 *
		 * 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
		 *
		 * package toto;
		 *
		 * import toto.de.DeBean;
		 *
		 * public class Depart {
		 *
		 * public static void main(String[] args) { DeBean de = new DeBean();
		 * DeBean de1 = new DeBean();
		 *
		 * System.out.println("Avant value = " + de.getValue()); de.setValue(5);
		 * System.out.println("Apres value = " + de.getValue()); de.lancer();
		 * System.out.println("Random value = " + de.getValue()); }
		 *
		 * }
		 *
		 *
		 */

	}

}
