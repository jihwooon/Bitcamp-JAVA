import java.util.Scanner;

class IfElse01

{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		//정수를 입력받아 양수일때는 양수에 100을 곱하여 출력하고
		//			 음수일때 입력받은 값을 양수로 변경한음 200을 곱하여 출력하라.
		System.out.print("정수입력=");
		int inData = scan.nextInt();

		if (inData<0){//-
			int result= -inData*200;
			
				
		} else{//0,+
			int result= inData*100;
			System.out.println("result="+result);
		
		}
		
	}
	
}
