package Book;

import java.util.Scanner;

//å�� �Է����ִ� Ŭ����

public class BookShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		
		BookShop bookShop = new BookShop();
		
		bookShop.books[0] = new Book( 1, "Ʈ���϶���", "�����Ĵϸ��̾�" );
		bookShop.books[1] = new Book( 2,"����", "�����Ĵϸ��̾�" );
		bookShop.books[2] = new Book( 3,"��Ŭ����","�����Ĵϸ��̾�");
		bookShop.books[3] = new Book( 4,"�극��ŷ��","�����Ĵϸ��̾�");
		bookShop.books[4] = new Book( 5,"�Ƹ���","������");
		bookShop.books[5] = new Book( 6,"�����׵�","�赿��");
		bookShop.books[6] = new Book( 7,"�����ϱ� û���̴�","�賭��");
		bookShop.books[7] = new Book( 8,"��õ","õ��");
		bookShop.books[8] = new Book( 9,"�¹���","������");
		bookShop.books[9] = new Book( 10,"Ǯ�Ͽ콺","������");
		
		bookShop.displayBookInfo(bookShop.books);
		
		Book book1 = new Book(10,"Ǯ�Ͽ콺","������");
		bookShop.books[9] = book1;
		book1.print();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~10�� ���ڸ� �Է����ּ���. : ");
		num = scanner.nextInt();
		if(num>10) {
			System.out.print("1~10�� ���ڸ� �Է����ּ���.");
		}
		scanner.close();
		
		bookShop.rentBook(num);

		bookShop.displayBookInfo(bookShop.books);

	}

}
