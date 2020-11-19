package liberiy_project;

public class BookVO {

	private int bookNo;// ��Ϲ�ȣ
	private String bookTitle;// ������
	private String author;// ����
	private String publisher;// ���ǻ�
	private String bookStatus;// ������� ��Ȳ

	public BookVO(int bookNo, String bookTitle, String author, String publisher, String bookStatus) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.author = author;
		this.publisher = publisher;
		this.bookStatus = bookStatus;

	}

	public void print() {
		System.out.println(bookNo + "," + author + "," + bookTitle + "," + publisher + "," + bookStatus);
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

}
