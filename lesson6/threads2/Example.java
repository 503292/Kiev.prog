package lesson6.threads2;

class Some implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Number = " + i);

		}
	}

}

public class Example {

	public static void main(String[] args) {
		Thread thrOne = new Thread(new Some());
		Thread thrTwo = new Thread(new Some());

		thrOne.start();
		thrTwo.start();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Number = " + i);

				}

			}
		});
		
		t1.start();
	}

}
