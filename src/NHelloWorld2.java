
import java.util.*;
public class NHelloWorld2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int count = scanner.nextInt();
			for(int i = 0;i<count;i++)
			System.out.println("Hello World");
		scanner.close();//scanner는 JAVA API 사용을 열어주므로 마무리 할 시 닫아줘야 한다.
	}
}