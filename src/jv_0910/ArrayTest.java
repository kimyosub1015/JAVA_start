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
		//배열이나 리스트나 왠만해선 length를 통해 길이를 정해서 출력하면 좋다?
	}

}
