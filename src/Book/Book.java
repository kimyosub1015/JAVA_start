package Book;
//å�� ��ɵ��� �����ϴ� �޼ҵ���� ���� Ŭ����
public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	public Book(int bookNo, String title, String author){
		this.stateCode = 1;
		setTitle(title);
		setAuthor(author);
		setBookNo(bookNo);
		
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void rent() {
		System.out.println(title+"��(��) �뿩�Ǿ����ϴ�.");
		this.stateCode -= 1;
	}
	public void print() {
		System.out.print("���� : "+getTitle()+",\t\t���� : "+getAuthor()+",\t\t�뿩 ���� : ");
		//System.out.print("���� : "+title+"���� : "+author+"�뿩 ����"+(stateCode == 1 ? "�������" : "������");
		if(this.stateCode == 1)
			System.out.println("��� ����");
		else
			System.out.println("�뿩��");
	}

}
