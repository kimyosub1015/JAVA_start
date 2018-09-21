package jv_0906;

public class ExcetpionTest {
	public static void main(String[] args) throws Exception{
		int a = 0;
		try {
			double b = 100/a;	
			System.out.println("Some more codes in try block");
		}catch (ArithmeticException e) {
			System.out.println("Exception occurred : "+e);
			e.printStackTrace();
		} finally {
			System.out.println("Some more codes in finally block.");
		}
		
		System.out.println("Some more codes.");
	}

}
