import java.util.Scanner;

class IfEx02 
{
	public static void main(String[] args) 	{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("����");
	
	int a,b;
	System.out.print("ù��°��= ");
		a = scan.nextInt();
	System.out.print("�ι�°��= ");	
		b = scan.nextInt();
		

	if (a>0 && b>0);	{
		
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;

		System.out.println("��="+c);
		System.out.println("����="+d);
		System.out.println("���ϱ�="+e);
		System.out.println("������="+f);
	

		}
	}
}


/*
�ݵ�� if�� ���

�μ��� �Է¹޾� �μ��� ����϶��� ��Ģ������ �Ͽ� ����϶�.

����
ù��°��=6 (ù��° > 0 && �ι�° >0)
�ι�°��=4
6 + 4 = 10
6 - 4 = 2
6 * 4 = 24
6 / 4  =1

*/