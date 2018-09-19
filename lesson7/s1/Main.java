package lesson7.s1;

public class Main {

	public static void main(String[] args) {

		Voiger voi = new Voiger();

		PushPull pull = new PushPull(voi, "Pull", true);
		PushPull push = new PushPull(voi, "Push", false);

		Thread th1 = new Thread(push);
		Thread th2 = new Thread(pull);

		th1.start();
		th2.start();

	}

}
