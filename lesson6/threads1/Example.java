package lesson6.threads1;

class SomeThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Number = " + i);

		}
	}

}

public class Example {

	public static void main(String[] args) {
		SomeThread test1 = new SomeThread();
		SomeThread test2 = new SomeThread();
		
		test1.start();
		test2.start();

	}

}
