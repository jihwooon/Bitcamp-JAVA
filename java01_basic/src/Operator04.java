import java.util.Scanner;
class Operator04 
{
	public static void main(String[] args) 
	{
		
		Scanner x = new Scanner(System.in);

		System.out.print("정수입력");
		int inDate = x.nextInt();
		//and : &&, or : ||, not !
		String result = (inDate>=1 && inDate<=100)? "참" : "거짓";
		System.out.println(inDate+"는 값의 범위내에 "+ result);
	}
}


