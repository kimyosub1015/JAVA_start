package StringColl;

public class WrapperTest {
	static Integer i = new Integer(10);
	static Character c = new Character('c');
	static Float f = new Float(3.14);
	static Boolean b = new Boolean(true);
	
	static Integer i1 = new Integer("10");
	static Double d = new Double("3.14");
	static Boolean b1 = new Boolean("False");

	public static void main(String[] args) {	
	System.out.println(i);
	System.out.println(c);
	System.out.println(f);
	System.out.println(b);
	System.out.println(i1);
	System.out.println(d);
	System.out.println(b1);
	}
}
