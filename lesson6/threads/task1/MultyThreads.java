package lesson6.threads.task1;

public class MultyThreads {

	private Thread[] threadsArray;
	private int n;

	public MultyThreads(int n) {
		super();
		this.n = n;
		this.threadsArray = new Thread[this.n];
	}
	

	public MultyThreads() {
		super();
	}

	public void startCalc () {
		for (int i = 0; i < threadsArray.length; i++) {
			threadsArray[i] = new Thread(new FactoialNum(i));
			threadsArray[i].start();
		}
	}

}
