import java.util.Scanner;

class OperatorEx 
{
	public static void main(String[] args) 
	
	{
	
	Scanner scan = new Scanner(System.in);
	//1. 급여입력
	System.out.print("급여입력");
	int salary = scan.nextInt();
	//2. 계산							  200이상      200미만
	double bonus= (salary>=200)? salary*0.05: salary*0.1;
	double payment= salary + bonus;
	//3. 출력
	System.out.printf("급여=%d\n보너스=%f\n지급액=%f\n",salary,bonus,payment);
	

	}
}
