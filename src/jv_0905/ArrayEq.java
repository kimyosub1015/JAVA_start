package jv_0905;

public class ArrayEq {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {10,20,30};
		int[] c = null;
		
		boolean result = equals(a,b);
		System.out.println("equals a,b : "+result);
		System.out.println("al.equals(b) : "+(a.equals(b))); // 내부적으로 주소 비교
		System.out.println("a == b : "+(a==b)); // 주소 비교
		//결국 둘이 같다는 거다.
		//배열을 비교하기 위해서는 하나하나 배열 값에 들어가는 함수를 만들어야 한다.
		//
		c = a;
		a[0] = 100;
		System.out.println("c[0] : "+c[0]);
	}
	public static boolean equals(int [] a, int [] b) {
		if(a == null) {
			return false;
		}
		if(b == null) {
			return false;
		}
		if(a.length != b.length) {
			return false;
		}
		int length = a.length;
		for(int i = 0; i<length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

}
