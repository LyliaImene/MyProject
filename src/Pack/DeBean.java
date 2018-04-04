package Pack;

import java.util.Random;

public class DeBean {

	public int value;

	public DeBean() {
		this(1);
	}

	public DeBean(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {

		this.value = value;
	}

	public void lancer() {

		value = new Random().nextInt(6) + 1;// sans le "+1"on avait un
											// intervalle [0-6[ on rajoutant +1
											// l intervalle devient [1-7[

	}

}
