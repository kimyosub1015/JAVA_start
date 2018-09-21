package jv_0905;

public class intarray {

	public static void main(String[] args) {
		int[] intAr;
		intAr = new int[5];
		intAr[0] = 3;
		intAr[1] = 6;
		intAr[2] = 9;
		int result = 0;
		for(int i = 0; i < intAr.length ; i++) {
			result = result + intAr[i];
		}
	System.out.print(result);

	}

}
