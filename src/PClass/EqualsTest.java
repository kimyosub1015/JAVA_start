package PClass;

public class EqualsTest {

	public static void main(String[] args) {
		String a = "aaa";
		String b = a;
		String c = new String("aaa");
		
		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
		
		
	}

}
