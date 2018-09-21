package jv_0912_mt;

import java.util.List;

public class AlphabetThread extends Thread {
	private List list;

	public AlphabetThread(List list) {
		this.list = list;
	}

	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++)
			synchronized (list) {
				System.out.print(ch);
				list.add(ch);
			}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
