package liberiy_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class BookMain {
	static Scanner scan = new Scanner(System.in);
	HashMap<String, LoginMemberVO> loginlist = new HashMap<String, LoginMemberVO>();

	
	
	public  LoginStart() {
		int loginCnt = 0;
		
		do{
			String userid = ("���̵�");
			String userpw = ("��й�ȣ");
			LoginMemberHashMap login = new LoginMemberHashMap();
			BookHashMap booking = new BookHashMap();
			
						
			if(login.logincheck(userid, userpw)) {
				loginlist = LoginMemberHashMap.LoginEmp();
				
				
				do {
				String Loginin = conInput("�α���(1:ȸ������2:�α���");
				if(Loginin.equals("1")) {
					
				} else if(Loginin.equals("2")) {
					
				}else {
					System.out.println("�ý��� �����մϴ�.");
				}
								
			}while (true);
		}else {//�α��� ����
			loginCnt++;
			if (loginCnt > 3) {
				break;
			}
		}
			
	}while(true);

	//�ܼ� �Է�
	public String conInput(String msg) {
		System.out.print(msg + "=");
		return scan.nextLine();
	}
	
	public void memberinsert() {
		int num = Integer.parseInt(conInput("��ȣ"));
		String name = conInput("");
		String 
	}
	
}

	public static void main(String[] argn) {
		System.out.println("------------------------������ ���� �ý���------------------------");
		HashMap<String, BookVO> Booklist = new HashMap<String, BookVO>();
		outter: while (true) {
			System.out.println("1.��������  2.���� �˻�  3.�����߰� 4.�Ű���� 5.���� �뿩 6.�����ݳ�");
			System.out.println("-------------------------------------------------------------");
			int menu = scan.nextInt();
			switch (menu) {
			// ��������

			case 1:
				System.out.print("���� ��ȣ :");
				int num = scan.nextInt();
				System.out.println("���� �̸� :");
				String bookname = scan.next();
				System.out.println("�۰� :");
				String author = scan.next();
				System.out.println();
				break;

			// �����˻�
			/*
			 * case 2: System.out.println("���ϴ� ������ �Է��ϼ���."); String bookName = scan.next();
			 * for(int i =0; i <Booklist.size(); i++) { Book b1 = Booklist.get(i); String
			 * title = b1.gettitle(); if(bookName.equals(title)) { b1.print(); break; }else
			 * if(i == Booklist.size() -1) { System.out.println("ã�� �� �����ϴ�."); } }
			 */
			// �����߰�
			case 3:
				System.out.print("������ȣ :");
				int number = scan.nextInt();
				System.out.print("���� �̸� :");
				String Bookname = scan.next();
				System.out.print("�۰� :");
				String Bookauthor = scan.next();
				Booklist.add(BookHashMap);

			case 4:
				System.out.print("���� �Ű���� ����Ʈ");
				Iterator<BookHashMap> it = Booklist.iterator();
				while (it.hasNext()) {
					BookStart = it.next();
					System.out.println();
				}
				break;

			// case 5:

			case 6:
				System.out.println("����");
				break;
			}
			break outter;
		}

	}
}

public void main
