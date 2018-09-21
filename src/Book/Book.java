package Book;
//책방 기능들을 관리하는 메소드들을 모은 클래스
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
		System.out.println(title+"이(가) 대여되었습니다.");
		this.stateCode -= 1;
	}
	public void print() {
		System.out.print("제목 : "+getTitle()+",\t\t저자 : "+getAuthor()+",\t\t대여 유무 : ");
		//System.out.print("제목 : "+title+"저자 : "+author+"대여 유무"+(stateCode == 1 ? "재고있음" : "재고없음");
		if(this.stateCode == 1)
			System.out.println("재고 있음");
		else
			System.out.println("대여중");
	}

}
