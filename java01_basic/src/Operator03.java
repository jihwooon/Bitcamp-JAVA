import java.util.Scanner;

class Operator03
{
	public static void main(String[] args) 
	{
	 
	 //��ü
	 Scanner s =new Scanner(System.in);

	 System.out.print("�����Է�");
	 int data = s.nextInt();

	//						  true         false
	 String result =(data>0)?"���":(data<0)?"����":"0";
	 System.out.printf("%d�� %s�Դϴ�.\n",data,result);

	/*����
	������ �Է��ϼ���? 500
				  52
				 -52

	*/
	}
}
