package for_test;
import java.util.Scanner;

class ForEx04 
{
	public static void main(String[] args) 
	{
		
	Scanner scan = new Scanner(System.in);
	System.out.println("����");

	System.out.print("���Է�=");
	int inData = scan.nextInt();
	
	int sum = 0, oddsum=0, evensum=0;
	for(int i= 1; i<=inData; i++){
		sum +=i;// ��ü��
		if(i%2==0){//¦��
			evensum +=i;
	
		} else {//Ȧ��
			oddsum +=i;
			}
	}
		System.out.println("1~"+inData+"������ ��"+sum);
		System.out.println("1~"+inData+"������ Ȧ���� ����"+oddsum);
		System.out.println("1~"+inData+"������ ����"+evensum);
	
		}
	}
















/*
���(����)�� �Է¹޾�
�Է¹��� ������ ¦���� ��, Ȧ���� ��, �������� ���Ͽ���.

����
���Է�=100
1~100������ �� 5050
1~100���� Ȧ���� ���� 2500
1~100���� ¦���� ���� 2550
*/