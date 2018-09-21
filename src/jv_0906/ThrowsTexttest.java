package jv_0906;

import java.io.IOException;

public class ThrowsTexttest {

	public static void main(String[] args) {
		ThrowsTextfinally throwsText = new ThrowsTextfinally();
			try {
				throwsText.suspiciousMEthod();
			} catch (IOException e) {
				System.out.println(e);
				e.printStackTrace();
			}
	}

}
