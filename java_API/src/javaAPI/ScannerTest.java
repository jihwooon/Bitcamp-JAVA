package javaAPI;

import java.util.Scanner;

class ScannerTest 
{
	public static void get(String[] args) 
	{
		// Scanner : �ֿܼ��� ����, ���ڸ� �Է� ���� �� �ִ� Ŭ������ ��ĳ�ʸ� �̿� 
		
		/* Ŭ������ ����ϴ� ��� 
		   1. Ŭ�������� ���������� ���(��ü�� ������ �ʰ� ����ϴ� ���)
		   2. ��ü�� �����Ͽ� ����ϴ� ��� */


		// new : ��ü�� �����ϴ� Ű����(�����)
		Scanner scan = new Scanner(System.in);
		

		System.out.print("������ �Է��ϼ��� = ");


		// nextInt() --> int, nextDouble() --> doule
		// next() --> �� �ܾ ���ڷ� �о��
		// nextLine() --> ������ ���ڷ� �о�� 
		int data = scan.nextInt(); // ���ڷ� �Է¹޾� ������ �ٲ��ִ� �޼ҵ� 


		// 1,2,3,4,5,6,.......
		//
		//String result = (data%2 == 0)? "¦��":"Ȧ��"; 
		//               9/2 --> 4    9/2.0 --> 4.5
		String result = (data/2 == data/2.0)? "¦��":"Ȧ��"; 

		System.out.println(data+"��(��) "+ result+"�Դϴ�");


	}
}
