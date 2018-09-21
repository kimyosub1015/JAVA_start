package PClass;

public class LandClassTest {

	public static void main(String[] args) {
		/*
		Point p = new Point(2,3);
		
		
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		*/
		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = a;
		
		
		System.out.println("----------------------");
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("a.equals(b) : "+a.equals(b));
		System.out.println("a.equals(c) : "+b.equals(c));	

	}

}
