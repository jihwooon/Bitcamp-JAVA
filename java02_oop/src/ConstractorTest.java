
public class ConstractorTest {// ������ �޼ҵ�

	int num = 10;
	String name;
	String tel = "010-1111-2222";

	public ConstractorTest() {// �����Ϸ��� public ConstractorTest() �������ش�.�Ű������� ��������

	}

	public ConstractorTest(int num) {
		System.out.println("ConstractorTest(int num) ������");
		this.num = num; // this ����Ǵ� Ŭ������ ������ ����
	}

	public ConstractorTest(String name) {//

	}

	public ConstractorTest(int num, String name, String tel) {// ct3 ����
		// �����ڿ��� �ٸ� �����ڸ� ȣ���ϱ� ���ؼ��� �ݵ�� ù��° ���๮���� ó�� �ؾ��Ѵ�.
		//
		this(num);
		System.out.println("ConstractorTest(int num, String name, String tel)������");
		// this.num = num;
		this.name = name;// this�� ���� Ŭ������ ��� ����
		this.tel = tel;

	}

	public ConstractorTest(String name, String tel, int num) { // ()������ �ٸ��� ����� �� �ִ�.
		this(num,name,tel);
		
		
	}

	public void prn() {
		System.out.println("��ȣ=" + num);
		System.out.println("�̸�=" + name);
		System.out.println("����ó=" + tel);
	}
}
