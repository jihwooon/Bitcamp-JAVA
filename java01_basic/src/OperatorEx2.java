import java.util.Scanner;

class OperatorEx2 
{
	public static void main(String[] args) 


	{

	Scanner scan = new Scanner(System.in);
	
	System.out.print("메뉴(1:사각형의넓이, 2:사각형의둘레)->");
	int menu= scan.nextInt();
	
	System.out.print("밑변");
	int width = scan.nextInt();
	
	System.out.print("둘레");
	int height = scan.nextInt();
	

	int result = (menu == 1)? width*height:(width*height)*2;

	String msg = (menu == 1)? "넓이" : "둘레";	
	System.out.printf("사각형의 %s는 %d\n",msg,result);
	}
}


/* 두수 입력을 받아 사각의없이 또는 사각형의 둘레를 구하라
	사각형의 넓이 = 밑변(가로) * 높이(세로)
	사각형의 둘레 = (밑변+높이)*2

실행


메뉴{1: 사각형 넓이, 2: 사각형의 둘레 -> 1
밑변
높이
사각형의 넓이는

메뉴{1: 사각형 넓이, 2: 사각형의 둘레 -> 2
밑변
높이
사각형의 넓이는
*/
