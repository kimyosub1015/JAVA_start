package jv_0910;

public class ArrayTest {

	public static void main(String[] args) {
		int[] scores = new int[5];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		
		for(int i = 0;i<scores.length;i++)
			System.out.println(scores[i]);
		//�迭�̳� ����Ʈ�� �ظ��ؼ� length�� ���� ���̸� ���ؼ� ����ϸ� ����?
	}

}
