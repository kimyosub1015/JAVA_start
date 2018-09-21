package jv_0905;

//아규먼츠로 들어온 인자는 스트링이다.
//정수형으로 쓸거면 형변환을 해야 한다.
public class NumgerTriangle {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("숫자를 입력해주세요. : ");
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