package jv_0912_mt;

import java.util.ArrayList;
import java.util.List;

public class MultiSynTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		Thread t1 = new AlphabetThread(list);
		Thread t2 = new DigitThread(list);
		Thread t3 = new DigitThread(list);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
