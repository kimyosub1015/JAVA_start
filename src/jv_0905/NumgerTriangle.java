package jv_0905;

//�ƱԸ����� ���� ���ڴ� ��Ʈ���̴�.
//���������� ���Ÿ� ����ȯ�� �ؾ� �Ѵ�.
public class NumgerTriangle {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("���ڸ� �Է����ּ���. : ");
		}
		int count = new Integer(args[0]).intValue();

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}