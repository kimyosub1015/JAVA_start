package jv_0912;

public class AlphabetThread extends Thread{
	public void run() {
		for(char ch = 'A';ch<='Z';ch++) {
			System.out.print(ch);
		}
	}

}
