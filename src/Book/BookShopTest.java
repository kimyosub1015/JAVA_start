package Book;

import java.util.Scanner;

//책을 입력해주는 클래스

public class BookShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		
		BookShop bookShop = new BookShop();
		
		bookShop.books[0] = new Book( 1, "트와일라잇", "스테파니메이어" );
		bookShop.books[1] = new Book( 2,"뉴문", "스테파니메이어" );
		bookShop.books[2] = new Book( 3,"이클립스","스테파니메이어");
		bookShop.books[3] = new Book( 4,"브레이킹던","스테파니메이어");
		bookShop.books[4] = new Book( 5,"아리랑","조정래");
		bookShop.books[5] = new Book( 6,"젊은그들","김동인");
		bookShop.books[6] = new Book( 7,"아프니깐 청춘이다","김난도");
		bookShop.books[7] = new Book( 8,"귀천","천상병");
		bookShop.books[8] = new Book( 9,"태백산맥","조정래");
		bookShop.books[9] = new Book( 10,"풀하우스","원수연");
		
		bookShop.displayBookInfo(bookShop.books);
		
		Book book1 = new Book(10,"풀하우스","원수연");
		bookShop.books[9] = book1;
		book1.print();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~10의 숫자를 입력해주세요. : ");
		num = scanner.nextInt();
		if(num>10) {
			System.out.print("1~10의 숫자를 입력해주세요.");
		}
		scanner.close();
		
		bookShop.rentBook(num);

		bookShop.displayBookInfo(bookShop.books);

	}

}
