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
			System.out.print("��ħ�� ���� ��� ���� : ");
			morningEgg = keybd.readLine();
			System.out.println("��ħ�� ��� : "+morningEgg+"��");
			System.out.println();
			System.out.print("���ɿ� ���� ��� ���� : ");
			lunchEgg = keybd.readLine();
			System.out.println("���ɿ� ��� : "+lunchEgg+"��");
			System.out.println();
			System.out.print("���ῡ ���� ��� ���� : ");
			dinnerEgg = keybd.readLine();
			System.out.println("���ῡ ��� : "+dinnerEgg+"��");
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
