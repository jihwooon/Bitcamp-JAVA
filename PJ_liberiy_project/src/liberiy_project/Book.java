package liberiy_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Book {

	private String num;
	private String title;
	private String author;

	public Book(String num, String title, String author) {
		this.num = num;
		this.title = title;
		this.author = author;

	}

	public String getnum() {
		return num;
	}
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public void print() {
		System.out.println("책번호" + num);
		System.out.println("책제목" + title);
		System.out.println("작가" + author);

	}

	
	public static void main(String[] args) {

		System.out.println("------------------------도서관 관리 시스템------------------------");
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<>();
		loop: while (true) {
			System.out.println("1.도서추가 2.도서검색 3.도서삭제 4.도서수정 5.전체도서정보출력 6.종료");
			int selec = scan.nextInt();
			switch (selec) {

			case 1:
				System.out.print("책번호: ");
				String num = scan.next();
				System.out.print("책제목: ");
				String title = scan.next();
				System.out.println("작가: ");
				String author = scan.next();
				Book book = new Book(num, title, author);
				list.add(book);
				break;

			case 2:
				System.out.print("원하는 책의 번호를 입력하시요 : ");
				String bookNum1 = scan.next();
				for (int i = 0; i < list.size(); i++) {
					Book b1 = list.get(i);
					String num1 = b1.getnum();
					if (bookNum1.equals(num1)) {
						b1.print();
						break;
					} else if (i == list.size() - 1) {
						System.out.println("해당 도서는 없습니다.");
					}

				}
				break;
			case 3:
				System.out.print("삭제하고싶은 책의 도서 번호를 입력하세요");
				String bookNum2 = scan.next();
				for (int i = 0; i < list.size(); i++) {
					Book b2 = list.get(i);
					String num2 = b2.getnum();
					if (bookNum2.equals(num2)) {
						Book b3 = list.remove(i);
						System.out.println(b3.gettitle() + "도서 목록에서 삭제되었습니다.");
					}
				}
				break;

			case 4:
				System.out.print("수정이 필요한 도서 번호를 입력하세요 :");
				String bookNum3 = scan.next();
				for (int i = 0; i < list.size(); i++) {
					Book b3 = list.get(i);
					String num3 = b3.getnum();
					if (bookNum3.equals(num3)) {
						System.out.print("도서번호: ");
						String setNum = scan.next();
						System.out.print("도서제목: ");
						String setTitle = scan.next();
						System.out.print("저자: ");
						String setAuthor = scan.next();
						Book b4 = list.set(i, new Book(setNum, setTitle, setAuthor));
					}
				}
				break;

			case 5:
				Iterator<Book> it = list.iterator();
				while (it.hasNext()) {
					Book result = it.next();
					result.print();
					System.out.println();
				}
				break;

			case 6:
				System.out.println("종료하겠습니다.");
				break loop;
			}// switch

		} // while
	}// main void
}
