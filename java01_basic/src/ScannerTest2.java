import java.util.Scanner;

class ScannerTest2
{
	public static void main(String[] args) 
	{

	Scanner scan = new Scanner(System.in);
	
	System.out.print("�����Է�");
	
	int date = scan.nextInt();
	
	String result =(date/2==date/2.0)? "¦��" : "Ȧ��";
	
	System.out.println(date +" �� "+ result + " �Դϴ�. ");

	}
}
