import java.util.Scanner;

class ForEx03 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
			System.out.println("����");
			
			System.out.print("���Է�=");
			int data = scan.nextInt();
			
		for(int i=2; i<10; i++) {
			int result = data * i;
			System.out.println(data+" * "+i+ " = "+ result);
		}
			
		

			
		


	}
}
/*
����
���Է�=5
5*2 = 10
:
:
5*9 = 45

*/