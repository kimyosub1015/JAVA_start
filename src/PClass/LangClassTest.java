package PClass;

public class LangClassTest {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		// ������ ���鶧 ����

		if (a.equals(b))
			System.out.println("A�ϰ� B�� �����ϴ�.");
		if (a.equals(c))
			System.out.println("A�ϰ� C�� �����ϴ�.");
		if (b.equals(c))
			System.out.println("B�ϰ� C�� �����ϴ�.");
		System.out.println("Hello\"JAVA\"!");
		/*
		String s1 = "abcd";
		String s2 = new String("abcd");
		String s3 = s1;
		String s4 = "abcd";
		//s1�ּ��ϰ� s2�� �ٸ��� s3�ϰ� ���� s4�ϰ� ����.
		//�� s1�ϰ� s4 �ּҰ� ������?
		//�޸𸮸� �Ƴ����� �ϴϱ� �׷���. ������ ��Ʈ���� ���� ���ٲٴϱ� �׳� ���� �ּҸ� ���� �����. new�� ����ؾ߸� �ٸ� �ּҸ� ������.
		
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
		
		String str1 = "hello Java"; // ���� ������ ���ڿ�
		String str2 = str1.toUpperCase(); // str1�� �빮�ڷ� ��ȯ
		String str3 = str2.concat("??"); // str2�� "??"�� ����
		String str4 = "!".concat("??"); // !�ϰ� ??�� �ٿ��� str4�� ����
		
		System.out.println("Str1 : "+str1);
		System.out.println("Str2 : "+str2);
		System.out.println("Str3 : "+str3);
		System.out.println("Str4 : "+str4);
		*/
		/*
		 * String x = "aBcAbCabcABC"; System.out.println(x.charAt(3)); // 3��° ���ڿ��� ����Ѵ�.
		 * System.out.println(x.indexOf("abc")); // abc�� ó�� �⿬�ϴ� �ε����� ����Ѵ�.(6��°���� abc���
		 * ����Ѵٸ� 6���� ���) System.out.println(x.length()); // ���� ����
		 * System.out.println(x.replace('a','R')); // a�� R�� ��ü�� ���
		 * System.out.println(x.replaceAll("abc", "123")); //abc�� 123���� ��ü�� ���
		 * System.out.println(x.substring(0,3)); // 0��° �ε������� 3���� �ε������� ���(abc���)
		 * System.out.println(x.toUpperCase()); // ���ڿ��� �빮�ڷ� ��ȯ
		 * System.out.println(x.toLowerCase()); // ���ڿ��� �ҹ��ڷ� ��ȯ
		 */

	}
}
