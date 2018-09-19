package lesson7.s1;

public class Voiger {
	private boolean turn = true;

	public boolean isStop() {
		return turn;
	}

	public void setStop(boolean turn) {
		this.turn = turn;
	}

	public synchronized void printText(String text, boolean turn) {

		for (; this.turn == turn;) {
			try {
				wait();
			} catch (InterruptedException e) {

			}

		}

		System.out.println(text + " - ");
		this.turn = !this.turn;
		notifyAll();
	}

}
