package PClass;

public class LangClassTest {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		// 생성자 만들때 제발

		if (a.equals(b))
			System.out.println("A하고 B는 같습니다.");
		if (a.equals(c))
			System.out.println("A하고 C는 같습니다.");
		if (b.equals(c))
			System.out.println("B하고 C는 같습니다.");
		System.out.println("Hello\"JAVA\"!");
		/*
		String s1 = "abcd";
		String s2 = new String("abcd");
		String s3 = s1;
		String s4 = "abcd";
		//s1주소하고 s2는 다르고 s3하고 같고 s4하고 같다.
		//왜 s1하고 s4 주소가 같을까?
		//메모리를 아끼려고 하니까 그렇다. 어차피 스트링의 값은 못바꾸니까 그냥 같은 주소를 보게 만든다. new를 사용해야만 다른 주소를 가진다.
		
		System.out.println("(s1 == s2)"+(s1 == s2));
		System.out.println("(s1 == s3)"+(s1 == s3));
		System.out.println("(s1 == s4)"+(s1 == s4));
		System.out.println("s1.equals(s2)" + s1.equals(s2));
		System.out.println("s1.equals(s3)" + s1.equals(s3));
		System.out.println("s1.equals(s4)" + s1.equals(s4));
		
		String greeting = "Hello JAVA!";
		
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.substring(0,10));
		
		String str1 = "hello Java"; // 최초 생성한 문자열
		String str2 = str1.toUpperCase(); // str1을 대문자로 변환
		String str3 = str2.concat("??"); // str2에 "??"를 붙임
		String str4 = "!".concat("??"); // !하고 ??를 붙여서 str4에 생성
		
		System.out.println("Str1 : "+str1);
		System.out.println("Str2 : "+str2);
		System.out.println("Str3 : "+str3);
		System.out.println("Str4 : "+str4);
		*/
		/*
		 * String x = "aBcAbCabcABC"; System.out.println(x.charAt(3)); // 3번째 문자열을 출력한다.
		 * System.out.println(x.indexOf("abc")); // abc가 처음 출연하는 인덱스를 출력한다.(6번째에서 abc라고
		 * 출력한다면 6으로 출력) System.out.println(x.length()); // 문자 개수
		 * System.out.println(x.replace('a','R')); // a를 R로 대체한 결과
		 * System.out.println(x.replaceAll("abc", "123")); //abc를 123으로 대체한 결과
		 * System.out.println(x.substring(0,3)); // 0번째 인덱스부터 3번재 인덱스까지 출력(abc출력)
		 * System.out.println(x.toUpperCase()); // 문자열을 대문자로 변환
		 * System.out.println(x.toLowerCase()); // 문자열을 소문자로 변환
		 */

	}
}
