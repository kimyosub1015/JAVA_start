package jv_0912;

public class MultithreadEx01 {

	public static void main(String[] args) {
		Thread thread = new DigitalThread();
		thread.start();
		for(char ch = 'A';ch<='Z';ch++)
			System.out.print(ch);
	}

}
