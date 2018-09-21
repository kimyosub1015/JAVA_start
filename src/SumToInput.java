// 0부터 입력된 숫자(input_num)까지 더한 합


import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input the numbber = ");
		int input_num = scanner.nextInt();
		int sum = 0;
		for(int i=0;i<=input_num;i++) {
			sum += i;
		}
		System.out.print("The Sum is = "+sum);
	}
}
