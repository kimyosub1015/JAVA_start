package jv_0910;

import java.util.Formatter;

public class FomatterTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Formatter f = new Formatter(sb);
		String name = "��⵿";
		int score = 100;
		f.format("%s ���� ������ %d �Դϴ�.",name,score);
		System.out.println(f.toString());
		
		String s = String.format("%s�� ������ %d �Դϴ�.",name,score);
		System.out.println(s);

	}

}
