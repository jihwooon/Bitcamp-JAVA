
public class MethodInner {

	String username = "�̼���";
	int age = 30;

	public MethodInner() {

	}

	public void getInfor() {
		String addr = "����� ������ �����";
		
		// �޼ҵ峻�� ���� Ŭ����
		class Inner {
			String tel = "010-1234-5678";
			String username = "�������";

			Inner(){}
			void print() {
				System.out.println("�̸�=" + username);
				System.out.println("����ó=" + tel);
				// �޼ҵ峻�� ����Ŭ���������� �ܺ�Ŭ������ ��������� ����Ҽ� �ִ�.
				System.out.println("����=" + age);
				System.out.println("�ּ�="+addr);
				//�޼ҵ��� �������� Ŭ���� ���� ������ ������ ������ ������ �����ϴ�.
				//System.out.println("�̸���="+email);
			}
		}
		String email = "abcdef@nate.com";
		// �޼ҵ峻�� ����Ŭ���� ��ü�� class���� �� ��ü�� �����Ѵ�.
		Inner i = new Inner();
		i.print();

	}

	public static void main(String[] args) {
		MethodInner mi = new MethodInner();
		mi.getInfor();
	}
}
