package lesson6.threads;

public class Main {

	public static void main(String[] args) {
		Thread thr = Thread.currentThread();
		
		FactorialTask task1 = new FactorialTask(10);
		FactorialTask task2 = new FactorialTask(10);
		FactorialTask task3 = new FactorialTask(10);
		
		Thread thread1 = new Thread(task1); 
		Thread thread2 = new Thread(task2); 
		Thread thread3 = new Thread(task3); 
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread1.interrupt();  //перевод з false на true
		thread2.interrupt();
		thread3.interrupt();
		
		// зупиняє main поки не закінчятся потоки
//		try {
//			thread1.join();
//			thread2.join();
//			thread3.join();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		
		
		System.out.println(thr.getName() + " Stop");

	}
	
	int proc = Runtime.getRuntime().availableProcessors();
	
	

}
