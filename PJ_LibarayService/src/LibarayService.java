import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class LibarayService {

	Scanner scan = new Scanner(System.in);
	
	private Utils utils;

	// libaryVo 객체생성
	private Database lvo = new Database();
	// BookVO 객체생성
	public static HashMap<String, BookVO> all;
	public LibarayService() {
		utils = new Utils();
	}

	// 로그인
	public void login() {
		System.out.println();
		System.out.println("로그인을 진행합니다.");
		String userId = conInput("아이디>");
		String password =conInput("비밀번호>");

		if (userId.equals(utils.getID()) && password.equals(utils.getPASS())) {
			System.out.println("관리자 로그인 하겠습니다.");
			all = Database.allview();
			Menu();
		}
	}
	
	//콘솔에서 문자입력
	public String conInput(String msg) {
		System.out.print(msg + "=");
		return scan.nextLine();
	}
	
	// 메뉴
	public void Menu() {
		int input = 0;
		while (true) {
			try {
				System.out.println("1.도서관리 2.회원관리 0.로그아웃");
				System.out.print("선택> ");
				input = scan.nextInt();

				switch (input) {
				// 서브 메뉴 1
				case 1:
					MenuSub1();
					break;

				// 서브 메뉴 2
				case 2:
					MenuSub2(scan);
					break;

				default:
					System.out.println("로그아웃 합니다.");
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("잘못 입력 하였습니다.");
				scan.nextLine();
			}
		}
	}// 관리자 메뉴

	//도서 관리 
	public void MenuSub1() {
		int input = 0;
		System.out.println("1.전체 도서   2.도서 추가   3.도서 수정  4.도서 삭제  0.시작 메뉴");
		System.out.print("선택>");
		input = scan.nextInt();

		switch (input) {
		case 1:

			System.out.println("책 목록");
			BookList();
			break;
		case 2:
			System.out.println("원하는 책을 등록하시오");
			Bookinsert();
			break;
		case 3:
			System.out.println("수정 할 도서를 입력하세요");
			BookEdit();
			break;
		case 4:
			System.out.println("삭제 할 도서목록을 입력하세요");
			BookDelete();
			break;
		default:
			System.out.println("시작 메뉴로 돌아가겠습니다.");
		}
	}// sub 1 end
	
	//목차 출력
	public void BookList() {
		Collection<BookVO> value = all.values();

		Iterator<BookVO> bo = value.iterator();
		while (bo.hasNext()) {
			System.out.println("===================================================================================");
			BookVO bo1 = bo.next();
			System.out.println(bo1.getBookNo() + " || " + bo1.getBooktitle() + " || " + bo1.getAuthor() + " || "
					+ bo1.getPublisher());
		}
	}
	
	//도서 삭제
	public void BookDelete() {
		String key = conInput("삭제할 도서번호입력 : ");
		
		all.remove(key);
		System.out.println("삭제가 완료 되었습니다.");
	}
	
	//도서 수정
	public void BookEdit() {
		String num = conInput("수정 할 책번호 : ");
		BookVO bv = all.get(num);
		if (bv != null) {	
			bv.toString();
			String subMenu = conInput("수정할 학목을 선택하시요(1.제목 2.저자  3.출판사)");
			String data = conInput("수정할 데이터 입력=");
			if(subMenu.equals("1")) {
				bv.setBooktitle(data);
				
			}else if(subMenu.equals("2")) {
				bv.setAuthor(data);
			}else if(subMenu.equals("3")) {
				bv.setPublisher(data);
			}else {
				System.out.println("수정할 항목을잘못선택하였습니다.");
			}
			
		}else {
			System.out.println(num + "는 없는 번호 입니다.");			
		}
	}

	//도서 추가
	public void Bookinsert() {
		String Num = conInput("책번호");
		scan.nextLine();
		String title = conInput("도서명");
		String author = conInput("저자");
		String publisher = conInput("출판사");
		
		BookVO bo = new BookVO(Num, title, author, publisher);
		
		all.put(Num, bo);
		BookList();
	}

	// 2.회원관리
	public void MenuSub2(Scanner sc) {
		while (true) {

			System.out.println();
			System.out.println("1.전체 회원   2.회원 검색     0.나가기");
			System.out.print("선택>");
			int input = scan.nextInt();

			switch (input) {
			case 1:
				// this.allmember();

			case 2:
				// this.Serchmember();

			default:
				System.out.println("알수 없습니다. 다시 입력해주세요.");

			}
		}
	}// sub2 end

//회원가입

	// 회원가입
	public void member() {

		System.out.println();
		System.out.println("회원가입을 진행합니다.");

		System.out.print("아이디> ");
		String userId = scan.next();
		System.out.print("비밀번호(영문+숫자 조합 8자 이상)> ");
		String password = scan.next();

		System.out.print("이름>");
		String name = scan.next();
		System.out.print("전화번호(ex 010-xxxx-xxxx)>");
		String phone = scan.next();

		System.out.println("회원 가입이 완료 되었습니다.");
		System.out.println();
		System.out.println("회원 가입을 축하드립니다.");

	}
}
