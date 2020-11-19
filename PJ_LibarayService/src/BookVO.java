
public class BookVO {

	private String BookNo;
	private String Booktitle;
	private String author;
	private String publisher;

	public BookVO(String BookNo, String Booktitle, String author, String publisher) {

		this.BookNo = BookNo;
		this.Booktitle = Booktitle;
		this.author = author;
		this.publisher = publisher;

	}

	public String getBookNo() {
		return BookNo;
	}

	public void setBookNo(String bookNo) {
		BookNo = bookNo;
	}

	public String getBooktitle() {
		return Booktitle;
	}

	public void setBooktitle(String booktitle) {
		Booktitle = booktitle;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				String.format("%-10s%-20s%-20s%-10s%-10s%n", this.BookNo, this.Booktitle, this.author, this.publisher));
		return sb.toString();

	}
}
