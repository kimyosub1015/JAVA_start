package jv_0906;

public class ArrayException {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;

		for (int i = 0; i < 5; i++) {
			try {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "] = " + intArray[i]);
			} catch (ArithmeticException e) {
				System.out.println("Exception occurred : " + e);
				e.printStackTrace();
			} finally {
				System.out.println("Some more codes in finally block.");
			}
			System.out.println(intArray);

		}

	}

}
