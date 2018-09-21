package jv_0910;

import java.util.Formatter;

public class FomatterTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Formatter f = new Formatter(sb);
		String name = "김기동";
		int score = 100;
		f.format("%s 님의 점수는 %d 입니다.",name,score);
		System.out.println(f.toString());
		
		String s = String.format("%s님 점수는 %d 입니다.",name,score);
		System.out.println(s);

	}

}
