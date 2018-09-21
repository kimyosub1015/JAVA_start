package jv_0912;

public class DigitRunnableImpl implements Runnable{
	public void run() {
		for (int cnt = 0; cnt <= 10; cnt++)
			System.out.print(cnt);
	}

}