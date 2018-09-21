package jv_0906;

import java.io.IOException;

public class ThrowsTextfinally {
	public void suspiciousMEthod()throws IOException{
		System.out.println("예외발생 전");
		throw new IOException();
	}

}
