import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Database {
//	private Utils utils = Utils.getInstance();
//
//	Scanner scan = new Scanner(System.in);
//	// ȸ�� ����
//	private Map<String, UserVO> user = new HashMap<String, UserVO>();
//	// ���� ����
//	private Map<String, BookVO> book = new HashMap<String, BookVO>();
//	// üũ ����Ʈ
//	// private Array<CheckOut> list= new ArrayList<CheckOut>();

	public Database() {}	
	
	//ȸ������
	public static HashMap<String, UserVO> allmember(){
		HashMap<String, UserVO> am = new HashMap<String, UserVO>();
		am.put("1111", new UserVO("1111","seoul","1234","ȫ�浿","010-5555-7783"));
		am.put("2222", new UserVO("2222","hanoi","2222","������","010-1234-7283"));
		am.put("3333", new UserVO("3333","kim123","3333","������","010-5666-8833"));
		am.put("4444", new UserVO("4444","jun123","4444","������","010-7986-4567"));
		am.put("5555", new UserVO("1234","ahn333","5555","���켺","010-9696-1234"));
		am.put("6666", new UserVO("6666","kang234","6666","������","010-7823-5552"));
		am.put("7777", new UserVO("7777","num123","7777","������","010-2043-9999"));
		am.put("8888", new UserVO("8888","ook123","8888","������","010-9561-2333"));
		am.put("9999", new UserVO("9999","qwe333","9999","���","010-4321-3456"));
		return am;
	}
	
	// ���� ��� 
	public static HashMap<String, BookVO> allview() {
		HashMap<String, BookVO> al = new HashMap<String, BookVO>();
		al.put("0001", new BookVO("0001", "���Ƕ� �����ΰ�?", "����Ŭ����", "������"));
		al.put("0002", new BookVO("0002", "��ȭ�� ����", "���̺�� A.��Ŭ����.�Ž� D.���÷�Ʈ ", "��Ű"));
		al.put("0003", new BookVO("0003", "�ڷγ� ���� ���� ", "���ϱ�", "���ǵ� Ŭ��"));
		al.put("0004", new BookVO("0004", "Ÿ��ź�� ������", "���丮��", "����̵�"));
		al.put("0005", new BookVO("0005", "1�� �ð��� ��߰�", "�ȵ����� ������", "�����Ͻ� �Ͻ�"));
		al.put("0006", new BookVO("0006", "��Ÿ��Ͼ�, �ĵ��� ĥ ���� ������ ", "�̺� ������", "�������Ͽ콺"));
		al.put("0007", new BookVO("0007", "������ : ���� ���� ����� ����� ������ ���� ���� ��Ģ ", "������ ����Ʈ", "�迵��"));
		al.put("0008", new BookVO("0008", "�ӽ� �÷��� ũ����", "������������", "û������"));
		al.put("0009", new BookVO("0009", "��� �� ����ũ", "�ִ� �׷�Ʈ", "����������"));
		al.put("0010", new BookVO("0010", "����Ŀ�� �ص� ����Ŀ��", "�� ������", "��Ű"));
		return al;

	}
	//public String searchForBook(String word, String key) {
		
	
}
	

	

