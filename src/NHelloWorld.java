
import java.util.*;
public class NHelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int count = scanner.nextInt();
		while(count != 0) {
			System.out.println("Hello World");
			count--;
		}
		scanner.close();//scanner�� JAVA API ����� �����ֹǷ� ������ �� �� �ݾ���� �Ѵ�.
	}
}