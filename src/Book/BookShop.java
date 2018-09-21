package Book;

//프로그램 출력 관련 클래스
public class BookShop {
	Book[] books = new Book[10];
	// 변수 10개가 선언되었다.

	public void displayBookInfo(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			Book book = books[i];
			book.print();
		}
	}

	public void rentBook(int num) {
		for (Book book : books) {
			if(book.getBookNo() == num) {
				book.rent();
				break;
			}
		}
	}
}
