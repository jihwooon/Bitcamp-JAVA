package javaAPI;

public class WrapperTest {

	public WrapperTest() {

	}

	public void start() {
		// Wrapper Ŭ���� : �⺻���������� ���� ��ü�� �����Ҽ� �ִ� Ŭ�������� ���Ѵ�.
		// Byte, Short, Integer, Long, Float, Double, Boolean, Character

		int num = 15;
		// Integer numObj= new Integer(num);
		Integer numObj = Integer.valueOf(num);
		System.out.println("numObj=" + numObj);

		Integer numObj2 = Integer.valueOf("1234") + 2000;
		System.out.println("numObj2=" + numObj2);
		Integer numObj3 = Integer.parseInt("5555") + 100;
		System.out.println("numObj3=" + numObj3);

		double numDb1 = Double.valueOf("52.36") + 10; // 62.39
		System.out.println("numDb1=" + numDb1);

		// jdk 1.5���� �������� ��.

		Integer i = 5; // ����ڽ�: �⺻������ Ÿ���� ��ü�� �ڵ����� �ٲ�� ��
		int ii = i; // �����ڽ� : ��ü�� �⺻������������ �ڵ����� �ٲ�� ��
		System.out.println(i + "-->" + ii);

		System.out.println("byte=" + numObj.BYTES);// 4
		System.out.println("max_value" + Integer.MAX_VALUE);// -21��
		System.out.println("max_value" + Integer.MIN_VALUE);// -21��
		System.out.println("size=" + Integer.SIZE);// 32

		System.out.println("hex=" + Double.toHexString(235.3658));

		System.out.println("intHex=" + Integer.toHexString(15));
		System.out.println("intOct=" + Integer.toOctalString(15));
	}

	public static void main(String[] args) {
		new WrapperTest().start();
	}
}
