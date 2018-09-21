package jv_0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eggMonster {

	public static void main(String[] args) {
		String morningEgg;
		String lunchEgg;
		String dinnerEgg;
		
		try {
			BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("아침에 먹은 계란 갯수 : ");
			morningEgg = keybd.readLine();
			System.out.println("아침에 계란 : "+morningEgg+"개");
			System.out.println();
			System.out.print("점심에 먹은 계란 갯수 : ");
			lunchEgg = keybd.readLine();
			System.out.println("점심에 계란 : "+lunchEgg+"개");
			System.out.println();
			System.out.print("저녁에 먹은 계란 갯수 : ");
			dinnerEgg = keybd.readLine();
			System.out.println("저녁에 계란 : "+dinnerEgg+"개");
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}/*
		finally {
			try {
				if(keybd != null)
					keybd.close();
			}catch(IOException e1) {
		}*/
	}

}
