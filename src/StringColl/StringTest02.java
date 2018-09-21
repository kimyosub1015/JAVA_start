package StringColl;

public class StringTest02 {

	public static void main(String[] args) {
		String a = new String("abcd");
		String b = new String(",efg");
		// 문자열 연결
		a = a.concat(b);
		System.out.println(a);

		// 공백제거
		a = a.trim();
		System.out.println("---" + a + "---");

		a = a.replaceAll("ab", "12");
		System.out.println(a);

		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		a = a.substring(3);
		System.out.println(a);

		char c = a.charAt(2);
		System.out.println(c);

	}

}