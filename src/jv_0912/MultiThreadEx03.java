package jv_0912;

public class MultiThreadEx03 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new AlphaRunnableImpl());
		Thread thread2 = new Thread(new DigitRunnableImpl());
		
		thread1.start();
		thread2.start();
	}

}

