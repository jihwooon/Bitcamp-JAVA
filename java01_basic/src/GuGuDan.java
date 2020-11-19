import java.util.Scanner;

class GuGuDan 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		for(int i=1; i<=10; i++){
		
	
			
			System.out.println(num+"*"+i+"="+num*i);
	
		}
	

	}	
}


/*
=1단=	=2단=	=3단=
1*2=2	2*2=4   3*2=6
1*3=3	2*3=6	3*3=9
:		:		:


9단까지
*/