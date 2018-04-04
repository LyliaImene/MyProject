package Pack;

public class AutreClasse {

	static void multiplyAndAdd(int a, int b, int c) {

		int result = a * (c + b);

		System.out.println("resultat : " + result);

	}

	static int max(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println("le plus grand est : " + a);
			return a; // return c'est toujours à la fin (donc apres
						// system.out...)(la methode max retourne un entier int)

			// jamais un int dans return

		}

		else if (b > a && b > c) {
			System.out.println("le plus grand est: " + b);
			return b;
		}

		else {
			System.out.println("le plus grand est:: " + c);
			return c;
		}
	}

	// static valeurRetour nomMethode(typage nomParametre) {
	static double photocopie(int nbrephoto) {
		if (nbrephoto <= 10) {
			return nbrephoto * 0.1;

		} else if (nbrephoto <= 30) {
			return 1 + (nbrephoto - 10) * 0.9;
		} else {
			return 2.8 + (nbrephoto - 30) * 0.8;
		}
	}

	// on déclare les parametres apres la parenthese
	static void exo1() {
		int i = 7;
		int j = 3;
		int divEntiere = i / j;
		int reste = i % j;
		double divClassique = i / (double) j;
		double somme = divClassique + divEntiere + +reste;

		System.out.println("La division entière : " + divEntiere);
		System.out.println("La reste : " + reste);
		System.out.println("La division classique : " + divClassique);
		System.out.println("La somme des 3 : " + somme);

		System.out.println("La somme : " + i + j);

	}

	// void ne retourne rien
	static void exo2(int v1) {
		int somme = v1 + 5;
		System.out.println("la somme" + (v1 + 5));

	}

	/*
	 * static void sub(int a, int b) { System.out.println("l)); }
	 *
	 */

	static void sub(int a, int b) {

		System.out.println("resultat : " + (a - b));

	}

	/*
	 *
	 * static void multiplyAndAdd(int a, int b, int c) {
	 *
	 *
	 * int result = a * (c + b);
	 *
	 * System.out.println("resultat : " + result);
	 *
	 *
	 */

	/*
	 * deuxieme solution
	 *
	 * System.out.println("resultat : " + (a * (c + b)));
	 */

	public static void multiple() {

		for (int i = 1; i < 10000; i++) {
			if (i % 47 == 0) {
				System.out.print(i);
			}

		}

	}

	public static void conditions() {
		int i = 0;
		while (i < 10000) {
			if (i % 7 == 0 && i % 11 == 0 && i % 15 == 0 && (i + (i - 1) % 36 == 1)) {
				;
			}

		}

	}

}
