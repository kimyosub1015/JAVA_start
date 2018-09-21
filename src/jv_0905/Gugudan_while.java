package jv_0905;

public class Gugudan_while {
	public static void main(String[] args) {
		int i = 1, j = 1;
		while (j < 10) {
			while (i < 10) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");
				i++;
			}
			System.out.println("");
			j++;
			i = 1;
		}
	}
}