package for_test;
import java.util.Scanner;

class ForEx05 
{
	public static void main(String[] args) 		{
	
		Scanner scan = new Scanner(System.in);

			System.out.println("실행");
			
			System.out.print("임의의 수 =");	
			int score = scan.nextInt();

			int sum = 0;
			for (int i = 1; i<=score; i++ ){
				sum += i;

				if (score <= sum){// if(sum>score);내가 쓴 답
					System.out.println("1에서"+i+"까지의 합은"+sum+"이다");
					break;
				}	

			}

}
}
/*
임의수를 입력받아
1부터 합은 구하는 합이 입력받은 값을 최초로 초과하는 시점의 수와 합을 구하라.

실행
임의의 수 = 12315
1에서___까지의 합은 ____이다.

*/