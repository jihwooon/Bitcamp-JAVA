import java.util.Scanner;
class ScannerTest 
{
	public static void main(String[] args) 
	{
		
		//Scanner : �ֿܼ��� ����,���ڸ� �Է¹��� �� �ִ� Ŭ����
		//1. Ŭ�������� ���������� ���(��ü�� ������ �ʰ� ���)
		//2. ��ü�� �����Ͽ� ����ϴ� ���
		// new : ��ü�� �����ϴ� Ű����(�����)
		
		Scanner scan = new Scanner(System.in);
		// nextInt() -> int,nextDouble() --> double, 
		// next() --> �Ѵܾ ���ڷ� �о��
		// nextline() -> 1���� ���ڷ� �о��
		System.out.print("�����Է�");
		int data = scan.nextInt(); //���ڷ� �Է¹޾� ������ �ٲ��ִ� �޼ҵ�
		
		// 1,2,3,4,5,6,.......
		//String result =(data%2==0)?"¦��" : "Ȧ��";
						//10/2    10/2.0		
		String result =(data/2==data/2.0)?"¦��" : "Ȧ��";

		System.out.println(data+"�� "+ result+"�Դϴ�.");

 /* ����
 	���� = 15
		  20
		  100
	�Է��� ���� ¦�� �Դϴ�. Ȧ�� �Դϴ�.
	*/
	
	
	}
}
