
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner scan = new Scanner(System.in);

	public ExceptionTest() {
	}

	public void start() {
		try {
			// 두수를 입력받아 합, 차, 곱, 몫을 구하는 프로그램을 작성한다.
			System.out.println("첫번째 수=");
			int n1 = scan.nextInt(); // -------------------- InputMismatche
			System.out.println("두번째 수=");
			int n2 = scan.nextInt();// ---------------------

			int hap = n1 + n2;
			int cha = n1 - n2;
			int gob = n1 * n2;
			int mok = n1 / n2;// ---------------- ArithmeticException : 어떤수를 0으로 나누면 예외발생

			System.out.println("합:" + hap + ",빼기:" + cha + ",곱:" + gob + ",나누기:" + mok);

			String names[] = { "홍길동", "이순신", "세종대왕" };
			// 3
			names[names.length] = "광개통대왕";

			for (int i = 0; i < names.length; i++) {
				System.out.println("names[" + i + "]=" + names[i]);
			}

		} catch (InputMismatchException ime) {
			// System.out.println(ime.getMessage());
			// ime.printStackTrace();
			System.out.println("숫자를 입력하여야 합니다.");
		} catch (ArithmeticException ae) {
			// System.out.println(ae.getMessage());
			// ae.printStackTrace();
			System.out.println("두번째 수는 0을 제외하고 입력하세요...");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열의 index가 잘못사용되었습니다." + ae.getMessage());
		} finally {
			// try 영역의 실행문이 예외 발생과 상관없이 무조건 실행되는 영역이다.
			System.out.println("finally: 예외와 상관없이 무조건 실행됨...");
		}

		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void main(String[] args) {
		new ExceptionTest().start();
		System.out.println("프로그램이 종료되었습니다.main");

	}

}

/*
 * try{
 * 
 * 예외발생할 가능성이 있는 코드를 표기한다.
 * 
 * }catch(InputMismatchException e) { system.out.print 발생한 예외종류에 따라서 이동하는 곳
 * 
 * }catch() {
 * 
 * 
 * }finally {
 * 
 * 
 * 
 * }
 * 
 * 
 */
