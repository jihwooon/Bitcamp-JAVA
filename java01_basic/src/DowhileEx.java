import java.util.Scanner;

class DowhileEx

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("정수입력 =");
		int inData = scan.nextInt();

		int sum = 0, oddsum = 0, evensum = 0;
		int i = 0;
		
		while(i<inData) {

		i++;
		sum +=i;
		if(i%2 == 0) {
			evensum +=i;

		}else 
			oddsum +=i;
		}

		System.out.println("1~"+inData+"까지의 합은"+sum);
		System.out.println("1~"+inData+"까지의 홀수의 합은"+oddsum);
		System.out.println("1~"+inData+"까지의 짝수의 합은"+evensum);

		
	}
}



/*
==반드시 while 또 do~while

실행
정수입력=100
1~100까지의 합은 5050 sum 
1~100까지의 홀수의 합은 2500 
1~100까지의 짝수의 합은 2550 

정수입력= 150
1~150까지의 합은
1~150까지의 홀수의 합은
1~150까지의 짝수의 합은

정수입력=-1
프로그램이 종료되었습니다.



*/