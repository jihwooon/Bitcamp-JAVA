import test.CCC;

public class ModfiyTest {

	public ModfiyTest() {
		//public : � Ŭ���������� ������ ����Ѵ�.(Ŭ����, �������,�����ڸ޼ҵ�,�޼ҵ�)
		//default : ���������� �����Ѱ��� ���Ѵ�. ���� ��Ű�� �������� ������ �����ϴ�.
		//private : �ٸ� Ŭ�������� ���� �� �� ����.���� Ŭ���� �������� ������ �����ϴ�.(�ٸ� Ŭ�������� ����� ��� �� �ϰ� 'ĸ��ȭ'�Ѵ�.)
		//			��������� private�� ��� ��ü�� ���� ������ �Ұ����ϴ�.
		
		AAA a = new AAA();
		System.out.println("a.name="+a.name);
		a.print();
		
		//CCC c = new CCC();
		CCC c = CCC.getInstance();
		
		System.out.println("c.tel="+c.tel);
		
		
		//������ �޼ҵ� private �̸� ��ü�� ������ �� �ִ�.
		BBB b = new BBB();
		//private ������� �����ϱ� : �Ұ���
		
		//System.out.println("addr="+b.addr);
		b.output();
	}

	public static void main(String[] args) {
		new ModfiyTest();
	}

}
