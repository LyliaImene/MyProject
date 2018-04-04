package Pack;

public class JoueurBean {
	private GobletBean gobelet;
	private String nom;
	private int scorePartie;

	public JoueurBean(String nom) {
		gobelet = new GobletBean();
		this.nom = nom;
	}

	public void lancer() {
		gobelet.lancer();
	}

	public void ajouter1Pts() {
		scorePartie++;
	}

	// GETTER / SETTER

	public GobletBean getGobelet() {
		return gobelet;
	}

	public void setGobelet(GobletBean gobelet) {
		this.gobelet = gobelet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScorePartie() {
		return scorePartie;
	}

	public void setScorePartie(int scorePartie) {
		this.scorePartie = scorePartie;
	}

	public GobletBean getGoblet() {
		return gobelet;
	}
	/*
	 * private String prenom;
	 *
	 * private int scorePartie;
	 *
	 * private GobletBean goblet;
	 *
	 * public JoueurBean(String nom) {
	 *
	 * goblet = new GobletBean();
	 *
	 * prenom = nom; }
	 *
	 * public void ajouter1Pts() {
	 *
	 * scorePartie++; }
	 *
	 * DeBean d1, d2;
	 *
	 * public void lancer() {
	 *
	 * d1.lancer(); d2.lancer();
	 *
	 * }
	 *
	 *
	 */

}
