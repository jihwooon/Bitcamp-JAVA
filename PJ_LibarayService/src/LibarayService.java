import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class LibarayService {

	Scanner scan = new Scanner(System.in);
	
	private Utils utils;

	// libaryVo ��ü����
	private Database lvo = new Database();
	// BookVO ��ü����
	public static HashMap<String, BookVO> all;
	public LibarayService() {
		utils = new Utils();
	}

	// �α���
	public void login() {
		System.out.println();
		System.out.println("�α����� �����մϴ�.");
		String userId = conInput("���̵�>");
		String password =conInput("��й�ȣ>");

		if (userId.equals(utils.getID()) && password.equals(utils.getPASS())) {
			System.out.println("������ �α��� �ϰڽ��ϴ�.");
			all = Database.allview();
			Menu();
		}
	}
	
	//�ֿܼ��� �����Է�
	public String conInput(String msg) {
		System.out.print(msg + "=");
		return scan.nextLine();
	}
	
	// �޴�
	public void Menu() {
		int input = 0;
		while (true) {
			try {
				System.out.println("1.�������� 2.ȸ������ 0.�α׾ƿ�");
				System.out.print("����> ");
				input = scan.nextInt();

				switch (input) {
				// ���� �޴� 1
				case 1:
					MenuSub1();
					break;

				// ���� �޴� 2
				case 2:
					MenuSub2(scan);
					break;

				default:
					System.out.println("�α׾ƿ� �մϴ�.");
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("�߸� �Է� �Ͽ����ϴ�.");
				scan.nextLine();
			}
		}
	}// ������ �޴�

	//���� ���� 
	public void MenuSub1() {
		int input = 0;
		System.out.println("1.��ü ����   2.���� �߰�   3.���� ����  4.���� ����  0.���� �޴�");
		System.out.print("����>");
		input = scan.nextInt();

		switch (input) {
		case 1:

			System.out.println("å ���");
			BookList();
			break;
		case 2:
			System.out.println("���ϴ� å�� ����Ͻÿ�");
			Bookinsert();
			break;
		case 3:
			System.out.println("���� �� ������ �Է��ϼ���");
			BookEdit();
			break;
		case 4:
			System.out.println("���� �� ��������� �Է��ϼ���");
			BookDelete();
			break;
		default:
			System.out.println("���� �޴��� ���ư��ڽ��ϴ�.");
		}
	}// sub 1 end
	
	//���� ���
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
	
	//���� ����
	public void BookDelete() {
		String key = conInput("������ ������ȣ�Է� : ");
		
		all.remove(key);
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
	}
	
	//���� ����
	public void BookEdit() {
		String num = conInput("���� �� å��ȣ : ");
		BookVO bv = all.get(num);
		if (bv != null) {	
			bv.toString();
			String subMenu = conInput("������ �и��� �����Ͻÿ�(1.���� 2.����  3.���ǻ�)");
			String data = conInput("������ ������ �Է�=");
			if(subMenu.equals("1")) {
				bv.setBooktitle(data);
				
			}else if(subMenu.equals("2")) {
				bv.setAuthor(data);
			}else if(subMenu.equals("3")) {
				bv.setPublisher(data);
			}else {
				System.out.println("������ �׸����߸������Ͽ����ϴ�.");
			}
			
		}else {
			System.out.println(num + "�� ���� ��ȣ �Դϴ�.");			
		}
	}

	//���� �߰�
	public void Bookinsert() {
		String Num = conInput("å��ȣ");
		scan.nextLine();
		String title = conInput("������");
		String author = conInput("����");
		String publisher = conInput("���ǻ�");
		
		BookVO bo = new BookVO(Num, title, author, publisher);
		
		all.put(Num, bo);
		BookList();
	}

	// 2.ȸ������
	public void MenuSub2(Scanner sc) {
		while (true) {

			System.out.println();
			System.out.println("1.��ü ȸ��   2.ȸ�� �˻�     0.������");
			System.out.print("����>");
			int input = scan.nextInt();

			switch (input) {
			case 1:
				// this.allmember();

			case 2:
				// this.Serchmember();

			default:
				System.out.println("�˼� �����ϴ�. �ٽ� �Է����ּ���.");

			}
		}
	}// sub2 end

//ȸ������

	// ȸ������
	public void member() {

		System.out.println();
		System.out.println("ȸ�������� �����մϴ�.");

		System.out.print("���̵�> ");
		String userId = scan.next();
		System.out.print("��й�ȣ(����+���� ���� 8�� �̻�)> ");
		String password = scan.next();

		System.out.print("�̸�>");
		String name = scan.next();
		System.out.print("��ȭ��ȣ(ex 010-xxxx-xxxx)>");
		String phone = scan.next();

		System.out.println("ȸ�� ������ �Ϸ� �Ǿ����ϴ�.");
		System.out.println();
		System.out.println("ȸ�� ������ ���ϵ帳�ϴ�.");

	}
}
