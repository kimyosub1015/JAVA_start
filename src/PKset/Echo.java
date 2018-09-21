package PKset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		InputStreamReader input = new InputStreamReader(System.in);				
		BufferedReader reader = new BufferedReader(input);
		String keyboardinput = "";
		try {
			keyboardinput = reader.readLine();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		System.out.print(keyboardinput);
		System.out.println("han entered");

	}

}
