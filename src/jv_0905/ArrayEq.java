package jv_0905;

public class ArrayEq {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {10,20,30};
		int[] c = null;
		
		boolean result = equals(a,b);
		System.out.println("equals a,b : "+result);
		System.out.println("al.equals(b) : "+(a.equals(b))); // ���������� �ּ� ��
		System.out.println("a == b : "+(a==b)); // �ּ� ��
		//�ᱹ ���� ���ٴ� �Ŵ�.
		//�迭�� ���ϱ� ���ؼ��� �ϳ��ϳ� �迭 ���� ���� �Լ��� ������ �Ѵ�.
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
