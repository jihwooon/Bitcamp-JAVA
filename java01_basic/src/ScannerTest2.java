import java.util.Scanner;

class ScannerTest2
{
	public static void main(String[] args) 
	{

	Scanner scan = new Scanner(System.in);
	
	System.out.print("정수입력");
	
	int date = scan.nextInt();
	
	String result =(date/2==date/2.0)? "짝수" : "홀수";
	
	System.out.println(date +" 는 "+ result + " 입니다. ");

	}
}
