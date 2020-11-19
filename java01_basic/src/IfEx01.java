import java.util.Scanner;
class IfEx01 {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("윤년입력");
	int year = scan.nextInt();
	
	
	//2020년 윤년

	if (year == 2020) {
		System.out.println("윤년입니다."+year);

	
	} 
		
		System.out.println("윤년이아닙니다."+year);


	}
}
/*
콘솔에서 년도를 입력받아 윤년인지 아닌지 구별하여 출력하라.

실행
년도= 2020
2020년은 윤년입니다.


년도=2022
2020년은 윤년이 아닙니다.



*/