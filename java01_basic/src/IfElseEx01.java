import java.util.Scanner;

class IfElseEx01 
{
	public static void main(String[] args) 	{
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("메뉴(1:사각형의넓이,2:원의넓이)");
	int menu = scan.nextInt();

	if (menu==1){
		System.out.print("밑변=");
			int width = scan.nextInt();
		System.out.print("높이=");
			int height = scan.nextInt();
			int result = width * height;
		System.out.println("사각형의 넓이는="+result+"입니다.");
	
	}else{
	if(menu==2){
		System.out.print("반지름=");
			int radius = scan.nextInt();
			double result= radius*radius*Math.PI;
		System.out.print("원의 넓이는="+result+"입니다.");
	}else{
		System.out.println("메뉴를 잘못선택하였습니다..");
	}
}
}
}
/*
 메뉴(1:사각형의 넓이, 2:원의 넓이)-> 1
 밑변=
 높이=
 사각형의 넓이는 ___입니다.

 메뉴(1:사각형의 넓이, 2:원의 넓이)-> 2
 반지름
 원의 넓이는 ___입니다.


*/