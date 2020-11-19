import java.util.Scanner;

class WhileEx1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("실행");
		
		System.out.print("임의의 수 =");
			int ran = scan.nextInt();
		
				
			int i=1;
			int sum=0;
						 
			while (true)	{
				sum += i;
				if(sum>=ran) {
					System.out.println("1~"+ran+"까지의 합은"+sum+"이다");
					break;
				}
				 i++;
		 }	
	}
}
