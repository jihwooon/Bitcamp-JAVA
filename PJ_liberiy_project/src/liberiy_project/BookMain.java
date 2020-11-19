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
			String userid = ("아이디");
			String userpw = ("비밀번호");
			LoginMemberHashMap login = new LoginMemberHashMap();
			BookHashMap booking = new BookHashMap();
			
						
			if(login.logincheck(userid, userpw)) {
				loginlist = LoginMemberHashMap.LoginEmp();
				
				
				do {
				String Loginin = conInput("로그인(1:회원가입2:로그인");
				if(Loginin.equals("1")) {
					
				} else if(Loginin.equals("2")) {
					
				}else {
					System.out.println("시스템 종료합니다.");
				}
								
			}while (true);
		}else {//로그인 실패
			loginCnt++;
			if (loginCnt > 3) {
				break;
			}
		}
			
	}while(true);

	//콘솔 입력
	public String conInput(String msg) {
		System.out.print(msg + "=");
		return scan.nextLine();
	}
	
	public void memberinsert() {
		int num = Integer.parseInt(conInput("번호"));
		String name = conInput("");
		String 
	}
	
}

	public static void main(String[] argn) {
		System.out.println("------------------------도서관 관리 시스템------------------------");
		HashMap<String, BookVO> Booklist = new HashMap<String, BookVO>();
		outter: while (true) {
			System.out.println("1.도서열람  2.도서 검색  3.도서추가 4.신간목록 5.도서 대여 6.도서반납");
			System.out.println("-------------------------------------------------------------");
			int menu = scan.nextInt();
			switch (menu) {
			// 도서열람

			case 1:
				System.out.print("도서 번호 :");
				int num = scan.nextInt();
				System.out.println("도서 이름 :");
				String bookname = scan.next();
				System.out.println("작가 :");
				String author = scan.next();
				System.out.println();
				break;

			// 도서검색
			/*
			 * case 2: System.out.println("원하는 도서를 입력하세요."); String bookName = scan.next();
			 * for(int i =0; i <Booklist.size(); i++) { Book b1 = Booklist.get(i); String
			 * title = b1.gettitle(); if(bookName.equals(title)) { b1.print(); break; }else
			 * if(i == Booklist.size() -1) { System.out.println("찾을 수 없습니다."); } }
			 */
			// 도서추가
			case 3:
				System.out.print("도서번호 :");
				int number = scan.nextInt();
				System.out.print("도서 이름 :");
				String Bookname = scan.next();
				System.out.print("작가 :");
				String Bookauthor = scan.next();
				Booklist.add(BookHashMap);

			case 4:
				System.out.print("올해 신간목록 리스트");
				Iterator<BookHashMap> it = Booklist.iterator();
				while (it.hasNext()) {
					BookStart = it.next();
					System.out.println();
				}
				break;

			// case 5:

			case 6:
				System.out.println("종료");
				break;
			}
			break outter;
		}

	}
}

public void main
