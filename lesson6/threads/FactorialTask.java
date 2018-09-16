package lesson6.threads;

import java.math.BigInteger;

public class FactorialTask implements Runnable {

	private int number;

	// CONSTRACTOR
	public FactorialTask(int number) {
		super();
		this.number = number;
	}

	public FactorialTask() {
		super();
	}

	// GETTER and SETTER
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// FUNCTION
	public BigInteger caclculateFactorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		for (int i = 1; i <= number; i++) {
			System.out.println(thr.getName() + " => " + i + " != " + caclculateFactorial(i));

			if (thr.isInterrupted()) {
				System.out.println(thr.getName() + " interrupted");
				return;
			}
		}

	}
}
