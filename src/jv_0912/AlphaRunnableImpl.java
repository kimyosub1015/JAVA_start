package jv_0912;

public class AlphaRunnableImpl implements Runnable {
	public void run() {
		for(char ch = 'A';ch<='Z';ch++) {
			System.out.print(ch);
		}
	}
}
