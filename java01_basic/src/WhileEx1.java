import java.util.Scanner;

class WhileEx1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("����");
		
		System.out.print("������ �� =");
			int ran = scan.nextInt();
		
				
			int i=1;
			int sum=0;
						 
			while (true)	{
				sum += i;
				if(sum>=ran) {
					System.out.println("1~"+ran+"������ ����"+sum+"�̴�");
					break;
				}
				 i++;
		 }	
	}
}
