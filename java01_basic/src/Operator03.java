import java.util.Scanner;

class Operator03
{
	public static void main(String[] args) 
	{
	 
	 //객체
	 Scanner s =new Scanner(System.in);

	 System.out.print("정수입력");
	 int data = s.nextInt();

	//						  true         false
	 String result =(data>0)?"양수":(data<0)?"음수":"0";
	 System.out.printf("%d는 %s입니다.\n",data,result);

	/*실행
	정수를 입력하세요? 500
				  52
				 -52

	*/
	}
}
