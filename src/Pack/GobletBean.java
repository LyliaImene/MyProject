package Pack;

public class GobletBean {

	DeBean d1, d2;

	public GobletBean() {

		d1 = new DeBean();
		d2 = new DeBean();

	}

	public void lancer() {

		d1.lancer();
		d2.lancer();

	}

	int scoreDe = 0;

	public int getScoreDe() {
		// la somme du lancement d1 et d2

		scoreDe = d1.getValue() + d2.getValue();

		return scoreDe;
	}

}
