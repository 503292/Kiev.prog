package lesson6.threads.task1;

public class Main {

	public static void main(String[] args) {
		MultyThreads mt = new MultyThreads(100);
		try {
			mt.startCalc();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}
}
