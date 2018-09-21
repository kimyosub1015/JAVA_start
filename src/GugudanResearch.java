public class GugudanResearch {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i * j);
				if (i * j < 10)
					System.out.print("\t\t");
				else
					System.out.print("\t");
			}
			System.out.println("");
		}
	}
}
