import java.lang.String;

public class BasicOPPMain {

	public static void main(String[] args) {

		String name = new String();

		// ��ü���� - sum�޼ҵ� ȣ�� ��ü�����Ҷ� 1�� ����: ��ü�� �ʱ�ȭ
		BasicOOP oop1 = new BasicOOP(); // ��ü�� ����°�
		BasicOOP oop2 = new BasicOOP();

		// ��ü ���� �޼ҵ� ȣ�� ��ü��.�޼ҵ��
		// �޼ҵ�� ��ɴ����� ����
		oop1.sum();

		name = oop1.getName();
		System.out.println("name=" + name);

		// ��ü���� ��������� �����͸� ��� ���ų� �����ϱ�
		// ��ü��.������
		oop1.a = 2500;

		System.out.println("oop1.a =" + oop1.a);
		System.out.println("oop2.a =" + oop2.a);

		oop1.sum();
		oop1.sum();

	}// public

}// class
