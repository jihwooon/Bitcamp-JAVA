import java.util.Scanner;

public class LibarayMain {

	Scanner scan = new Scanner(System.in);
	LibarayService log = new LibarayService();


	public LibarayMain() {
		System.out.println("Hello World");
		System.out.println("�α��� �Ǵ� ȸ�� ������ �ʿ��մϴ�.");
		
		System.out.println("�޴�(1.ȸ������  2.�Ϲ�ȸ�� �α��� 3.������ �α��� 0.����)");

		int num = inputNum();

		switch (num) {

		case 1:
			log.member();
			break;
		case 2:
			//�Ϲ�ȸ�� �α���
		case 3:
			log.login();
			break;
		default:
			System.out.println("���� �ϰڽ��ϴ�.");
			break;
		}
	}

	public static void main(String[] args) {
		new LibarayMain();
	}

	public int inputNum() {
	
		System.out.print("�޴�>");
		int num = scan.nextInt();
		System.out.println("������ �޴� :" + num);
		System.out.println();
		return num;
	}

}
