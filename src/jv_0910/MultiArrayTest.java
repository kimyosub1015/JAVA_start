package jv_0910;

public class MultiArrayTest {

	public static void main(String[] args) {
		int [][] a = {{110,20,30,40},{50,60},{70}};
		//2���� �迭�� �����Ѵ�.
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.println("a["+i+"]"+"["+j+"] = "+a[i][j]);
			}
		}
		//2���� �迭�� 2���������� ����Ѵ�.
		//length�� ��� 1���迭 ������ ���̸� ������.
		//2���迭 ������ ���ϸ� [i]��� 1�����迭 ������ ����� �Ѵ�.

	}

}
