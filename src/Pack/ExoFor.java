package Pack;

public class ExoFor {

	public static int testFor(String maChaine) {
		int compt = 0;

		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			if (c == 'a') {
				compt++;
			}
		}

		return compt;

	}

	public static char lettrePlusPetite(String maChaine) {
		char resultat = 'z';

		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			// action
			if (c < resultat) {

				resultat = c;
			}
		}

		return resultat;

	}

	public static char lettrePlusgrande(String maChaine) {
		char resultat = 'a';
		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			// action
			if (c > resultat) {

				resultat = c;

			}
		}

		return resultat;

	}

	public static int combien(String maChaine) {
		char lettrePlusGrande = lettrePlusgrande(maChaine);
		int cpt = 0;

		for (int i = 0; i < maChaine.length(); i++) {
			char c = maChaine.charAt(i);
			if (c == lettrePlusGrande) {

				cpt++;

			}

		}
		return cpt;
	}

	/*
	 * public static String reverse(String maChaine) {
	 * 
	 * for (int i = 0; i < maChaine.length(); i++) { int a = maChaine.length();
	 * char c = maChaine.charAt(a);
	 * 
	 * 
	 * 
	 * }
	 */

	public static char istrier(String maChaine) {
		char resultat = 'a';
		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			// action
			if (c > resultat) {

				resultat = c;

			}
		}

		return resultat;

	}

}
