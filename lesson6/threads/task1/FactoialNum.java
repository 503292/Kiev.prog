package lesson6.threads.task1;

import java.math.BigInteger;

public class FactoialNum implements Runnable {
	private int num;

	public FactoialNum(int num) {
		super();
		this.num = num;
	}

	public FactoialNum() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public BigInteger calcFactorial() {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= this.num; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + this.num + "! = " + this.calcFactorial());
	}

}
