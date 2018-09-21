

public class TypeCast2 {
	public static void main(String[] args) {
		byte b;
		int i = 414;
		float f= 123.4f;
		
		b = (byte)i;
		System.out.println("int 414 to byte : "+b);
		i = (int)f;
		System.out.println("int 414 to byte : "+b);
		b = (byte)f;
		System.out.println("int 414 to byte : "+b);
				
		}
}
