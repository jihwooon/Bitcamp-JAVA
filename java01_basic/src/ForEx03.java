import java.util.Scanner;

class ForEx03 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
			System.out.println("실행");
			
			System.out.print("단입력=");
			int data = scan.nextInt();
			
		for(int i=2; i<10; i++) {
			int result = data * i;
			System.out.println(data+" * "+i+ " = "+ result);
		}
			
		

			
		


	}
}
/*
실행
단입력=5
5*2 = 10
:
:
5*9 = 45

*/