

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		int temp = 0;
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		if(n1>n2)
			System.out.println("n1 is bigger than n2");
		else if(n1<n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
			System.out.println("option is change");
			System.out.println("n1 : "+n1);
			System.out.println("n2 : "+n2);
			System.out.println("n1 is bigger than n2");
		}
		else
			System.out.println("n1 is same number with n2");
		int a1 = 20, a2 = 10, a3 = 0;
		if (a1 > a2) {
			if(a1>a3){
				System.out.println("Max number is a3 : "+ a3);
			}
			else{
				System.out.println("Max number is a1 : "+ a1);
			}
		}
		else {
			if(a2>a3){
				System.out.println("Max number is a2 : "+ a2);
			}
			else{
				System.out.println("Max number is a3 : "+ a3);
			}
		}
	}
}