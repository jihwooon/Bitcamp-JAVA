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
		System.out.println("å��ȣ" + num);
		System.out.println("å����" + title);
		System.out.println("�۰�" + author);

	}

	
	public static void main(String[] args) {

		System.out.println("------------------------������ ���� �ý���------------------------");
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<>();
		loop: while (true) {
			System.out.println("1.�����߰� 2.�����˻� 3.�������� 4.�������� 5.��ü����������� 6.����");
			int selec = scan.nextInt();
			switch (selec) {

			case 1:
				System.out.print("å��ȣ: ");
				String num = scan.next();
				System.out.print("å����: ");
				String title = scan.next();
				System.out.println("�۰�: ");
				String author = scan.next();
				Book book = new Book(num, title, author);
				list.add(book);
				break;

			case 2:
				System.out.print("���ϴ� å�� ��ȣ�� �Է��Ͻÿ� : ");
				String bookNum1 = scan.next();
				for (int i = 0; i < list.size(); i++) {
					Book b1 = list.get(i);
					String num1 = b1.getnum();
					if (bookNum1.equals(num1)) {
						b1.print();
						break;
					} else if (i == list.size() - 1) {
						System.out.println("�ش� ������ �����ϴ�.");
					}

				}
				break;
			case 3:
				System.out.print("�����ϰ���� å�� ���� ��ȣ�� �Է��ϼ���");
				String bookNum2 = scan.next();
				for (int i = 0; i < list.size(); i++) {
					Book b2 = list.get(i);
					String num2 = b2.getnum();
					if (bookNum2.equals(num2)) {
						Book b3 = list.remove(i);
						System.out.println(b3.gettitle() + "���� ��Ͽ��� �����Ǿ����ϴ�.");
					}
				}
				break;

			case 4:
				System.out.print("������ �ʿ��� ���� ��ȣ�� �Է��ϼ��� :");
				String bookNum3 = scan.next();
				for (int i = 0; i < list.size(); i++) {
					Book b3 = list.get(i);
					String num3 = b3.getnum();
					if (bookNum3.equals(num3)) {
						System.out.print("������ȣ: ");
						String setNum = scan.next();
						System.out.print("��������: ");
						String setTitle = scan.next();
						System.out.print("����: ");
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
				System.out.println("�����ϰڽ��ϴ�.");
				break loop;
			}// switch

		} // while
	}// main void
}
