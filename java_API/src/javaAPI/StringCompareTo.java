package javaAPI;

public class StringCompareTo {

	public StringCompareTo() {
		System.out.println("������....");

	}

	public void start() {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		// compareTo() : ���ڿ��� ũ�� ���ϱ�
		String str1 = new String("Best Java"); // 74
		String str2 = 			"Best Design"; // 68

		// ����=�������Ǻ����� Ŭ�� 	0=����, ��� = ���ʿ� �ִ� ������ Ŭ��
		int result1 = str1.compareTo(str2);
		int result2 = str2.compareTo(str1);

		if(result1>0) {
			System.out.println("str1�� str2���� ũ��");
		}else if(result1<0){
			System.out.println("str2�� st1���� ũ��.");
		}else {
			System.out.println("str1�� str2�� ����");
		}
		
		System.out.println("result1=" + result1);// str1 - str2
		System.out.println("resutl2=" + result2);// str2 - str1

	}

	public static void main(String[] args) {
		new StringCompareTo().start();

	}
}
