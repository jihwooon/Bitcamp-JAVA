
public class AAA {

	static int num = 100;

}// class

class BBB {
	int num = 200;

	BBB() {
	}

	static BBB getInstance() {
		return new BBB();
	}

}// class

class CCC {

	static int num = 300;
	static String name = "ȫ�浿";
	static String addr = "����� ������";

	// ��������
	static final int MAX = 100;
	static final int MIN = 1;

	CCC() {
	}

	static void print() {
		// final ������ ���� �����Ұ�
		// MAX = 200;
		System.out.println("��ȣ=" + num);
		System.out.println("�̸�=" + name);
		System.out.println("�ּ�=" + addr);
		System.out.println("MIN=" + MIN + ", MAX=" + MAX);

	}
}
