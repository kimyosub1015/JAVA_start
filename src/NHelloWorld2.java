
import java.util.*;
public class NHelloWorld2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int count = scanner.nextInt();
			for(int i = 0;i<count;i++)
			System.out.println("Hello World");
		scanner.close();//scanner�� JAVA API ����� �����ֹǷ� ������ �� �� �ݾ���� �Ѵ�.
	}
}