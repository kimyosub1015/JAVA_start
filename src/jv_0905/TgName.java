// 문자열(String)은 + 연산이 가능하다!(물론 문자로 처리되서 이어지는 형태다. 파이썬의 +하고 동일)
package jv_0905;

public class TgName {

	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < 5; i++) {
			s = s + "X";
			System.out.println(s);
		}

	}

}

