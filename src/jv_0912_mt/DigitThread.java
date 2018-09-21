package jv_0912_mt;

import java.util.List;

public class DigitThread extends Thread {

	private List list;

	public DigitThread(List list) {
		this.list = list;
	}

	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
			synchronized (list) {
				System.out.print(cnt);
				list.add(cnt);
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}