package javaAPI;

import java.util.Scanner;

class ScannerTest 
{
	public static void get(String[] args) 
	{
		// Scanner : 콘솔에서 숫자, 문자를 입력 받을 수 있는 클래스인 스캐너를 이용 
		
		/* 클래스를 사용하는 방법 
		   1. 클래스명을 직접적으로 사용(객체를 만들지 않고 사용하는 방법)
		   2. 객체를 생성하여 사용하는 방법 */


		// new : 객체를 생성하는 키워드(예약어)
		Scanner scan = new Scanner(System.in);
		

		System.out.print("정수를 입력하세요 = ");


		// nextInt() --> int, nextDouble() --> doule
		// next() --> 한 단어를 문자로 읽어옴
		// nextLine() --> 한줄을 문자로 읽어옴 
		int data = scan.nextInt(); // 문자로 입력받아 정수로 바꿔주는 메소드 


		// 1,2,3,4,5,6,.......
		//
		//String result = (data%2 == 0)? "짝수":"홀수"; 
		//               9/2 --> 4    9/2.0 --> 4.5
		String result = (data/2 == data/2.0)? "짝수":"홀수"; 

		System.out.println(data+"은(는) "+ result+"입니다");


	}
}
