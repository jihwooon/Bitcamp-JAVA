import java.util.Scanner;

public class LibarayMain {

	Scanner scan = new Scanner(System.in);
	LibarayService log = new LibarayService();


	public LibarayMain() {
		System.out.println("Hello World");
		System.out.println("로그인 또는 회원 가입이 필요합니다.");
		
		System.out.println("메뉴(1.회원가입  2.일반회원 로그인 3.관리자 로그인 0.종료)");

		int num = inputNum();

		switch (num) {

		case 1:
			log.member();
			break;
		case 2:
			//일반회원 로그인
		case 3:
			log.login();
			break;
		default:
			System.out.println("종료 하겠습니다.");
			break;
		}
	}

	public static void main(String[] args) {
		new LibarayMain();
	}

	public int inputNum() {
	
		System.out.print("메뉴>");
		int num = scan.nextInt();
		System.out.println("선택한 메뉴 :" + num);
		System.out.println();
		return num;
	}

}
