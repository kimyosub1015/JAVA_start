package jv_0910;

public class MultiArrayTest {

	public static void main(String[] args) {
		int [][] a = {{110,20,30,40},{50,60},{70}};
		//2차원 배열을 생성한다.
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.println("a["+i+"]"+"["+j+"] = "+a[i][j]);
			}
		}
		//2차원 배열을 2중포문으로 출력한다.
		//length의 경우 1차배열 구조로 길이를 따진다.
		//2차배열 구조를 원하면 [i]등등 1차원배열 지정을 해줘야 한다.

	}

}
