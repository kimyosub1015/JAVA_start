package jv_0905;

public class for_vs_while {

	public static void main(String[] args) {
		int i = 6;
		while(i<10) {
			if(i>5) {
				System.out.println("�ʴ� �̹� �׾��ִ�.");
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
