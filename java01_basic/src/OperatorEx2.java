import java.util.Scanner;

class OperatorEx2 
{
	public static void main(String[] args) 


	{

	Scanner scan = new Scanner(System.in);
	
	System.out.print("�޴�(1:�簢���ǳ���, 2:�簢���ǵѷ�)->");
	int menu= scan.nextInt();
	
	System.out.print("�غ�");
	int width = scan.nextInt();
	
	System.out.print("�ѷ�");
	int height = scan.nextInt();
	

	int result = (menu == 1)? width*height:(width*height)*2;

	String msg = (menu == 1)? "����" : "�ѷ�";	
	System.out.printf("�簢���� %s�� %d\n",msg,result);
	}
}


/* �μ� �Է��� �޾� �簢�Ǿ��� �Ǵ� �簢���� �ѷ��� ���϶�
	�簢���� ���� = �غ�(����) * ����(����)
	�簢���� �ѷ� = (�غ�+����)*2

����


�޴�{1: �簢�� ����, 2: �簢���� �ѷ� -> 1
�غ�
����
�簢���� ���̴�

�޴�{1: �簢�� ����, 2: �簢���� �ѷ� -> 2
�غ�
����
�簢���� ���̴�
*/
