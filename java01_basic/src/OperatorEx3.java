import java.util.Scanner;

class OperatorEx3 
{
	public static void main(String[] args) 
	{
	
	Scanner scan = new Scanner(System.in);

		System.out.print("�޴�(1:�簢������, 2:�簢���ѷ�)->");
			int menu = scan.nextInt();
		System.out.print("�غ�->");
			int width = scan.nextInt();
		System.out.print("����->");
			int height = scan.nextInt();
	

		int result = (menu==1)? width*height : (width+height)*2;
	
	String msg = (menu==1)? "����":"�ѷ�";
	System.out.printf("�簢���� %s�� %d\n",msg, result);
	
	}
}