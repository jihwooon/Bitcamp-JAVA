//package P1,P2,P3;
import java.lang.String;
import java.util.Scanner;
import java.io.*;

public class BasicOOP {
	// �������� (�������)
	int a = 1234;
	String name;// null

	// ������ �޼ҵ� : ��ü(object)�� �����Ҷ� �ѹ� �����մϴ�.
	// �޼ҵ���� �ݵ�� Ŭ������� ���ƾ� �մϴ�.

	// (������ �޼ҵ�)�� ��ȯ���� ����.
	public BasicOOP() {
		System.out.println("������ =" + a);

	}

	public BasicOOP(int a) {
	}

	// �޼ҵ� ��ȯ��
	// �޼ҵ�� �ҹ��ڽ���, �ռ����� ��� �ι�°�ܾ��� ù��°���ڸ� �빮��...���ڻ�밡��
	// ù��°���� ���� �ҹ����̿����Ѵ�.
	public void sum() {
		// ��ɱ���
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			s += i;
		}
		System.out.println("s=" + s);
		System.out.println("sum->a" + a);
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("c=" + c);

		// ����Ŭ���� - �޼ҵ峻�� ����Ŭ����
		class BBB {

		}
	}

	public String getName() {
		return "ȫ�浿";
	}

	// ����Ŭ����
	class AAAA {
		// ��ɱ���

	}
}// public end
