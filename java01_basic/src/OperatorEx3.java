import java.util.Scanner;

class OperatorEx3 
{
	public static void main(String[] args) 
	{
	
	Scanner scan = new Scanner(System.in);

		System.out.print("메뉴(1:사각형넓이, 2:사각형둘레)->");
			int menu = scan.nextInt();
		System.out.print("밑변->");
			int width = scan.nextInt();
		System.out.print("세로->");
			int height = scan.nextInt();
	

		int result = (menu==1)? width*height : (width+height)*2;
	
	String msg = (menu==1)? "넓이":"둘레";
	System.out.printf("사각형의 %s는 %d\n",msg, result);
	
	}
}