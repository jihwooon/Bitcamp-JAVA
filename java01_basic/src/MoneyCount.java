import java.util.Scanner;


class MoneyCount 
{
	public static void main(String[] args) 	{
		
		int count;
		
		Scanner scan = new Scanner(System.in);
			System.out.print("�ݾ��� �Է��ϼ���?=");
			count = scan.nextInt();

			while(!(count==0)) {
				int a = (count%50000);
				if(a>50000){
						break;

					}

				System.out.print("50000��="+a);
			}//while end	
			System.out.println();
	}//public
}//class
