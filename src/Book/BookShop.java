package Book;

//���α׷� ��� ���� Ŭ����
public class BookShop {
	Book[] books = new Book[10];
	// ���� 10���� ����Ǿ���.

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
