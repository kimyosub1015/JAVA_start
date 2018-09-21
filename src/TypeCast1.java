

public class TypeCast1 {

	public static void main(String[] args) {
	byte b = 25;
	short s = b;
	int i = s;
	long l = i;
	float f = i;
	double d = f;
	
	short bl = 256;
	
	System.out.println("b = "+b);
	System.out.println("s = "+s);
	System.out.println("i = "+l);
	System.out.println("l = "+l);
	
	System.out.println("f = "+f);
	System.out.println("d = "+d);
	System.out.println("bl = "+bl);
	

	}

}
