import java.util.Scanner;

class IfEx02 
{
	public static void main(String[] args) 	{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("실행");
	
	int a,b;
	System.out.print("첫번째수= ");
		a = scan.nextInt();
	System.out.print("두번째수= ");	
		b = scan.nextInt();
		

	if (a>0 && b>0);	{
		
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;

		System.out.println("합="+c);
		System.out.println("빼기="+d);
		System.out.println("곱하기="+e);
		System.out.println("나누기="+f);
	

		}
	}
}


/*
반드시 if문 사용

두수를 입력받아 두수가 양수일때만 사칙연산을 하여 출력하라.

실행
첫번째수=6 (첫번째 > 0 && 두번째 >0)
두번째수=4
6 + 4 = 10
6 - 4 = 2
6 * 4 = 24
6 / 4  =1

*/