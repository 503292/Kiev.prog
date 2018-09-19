package lesson7.s1;

public class PushPull implements Runnable {

	private Voiger voi;
	private String text;
	private boolean turn;

	public PushPull(Voiger voi, String text, boolean turn) {
		super();
		this.voi = voi;
		this.text = text;
		this.turn = turn;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			voi.printText(text, turn);
		}

	}

}
