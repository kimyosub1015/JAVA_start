package jv_0910;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) throws Exception{
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] arr = new byte[2];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = -1;	
		
		
		while((data = input.read())!= -1);{
			output.write(data);
			
			}
		
		outSrc = output.toByteArray();
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("Onput Source : "+Arrays.toString(outSrc));
		
		input.close();
		output.close();

	}

}
