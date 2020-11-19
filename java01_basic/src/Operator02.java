

//java.lang패키지 내의 클래스 컴파일러가 알아서 추가를 해준다.
import java.lang.String;
import java.lang.System;
class Operator02
  
{
	public static void main(String[] args) 
	{

		int num = 10;
		int data = 5;

		//비교(관계) 연산자 : >, <, >=, <=, ==(같다), !=(같지 않다.)
		boolean boo = 10 > 5;
		System.out.println("boo = "+ boo);
		
		//산술 +,-,*,/,%		컴퓨터는 5+2-3 (왼쪽 순서대로 계산 먼저) (5+2)+2 괄호 안에 먼저 계산
		//증감 연산자 >> 산술 >> 비교 

		boolean boo2 = 20 <= num * 10 / 2 + 15 - --data;
		System.out.println("boo2 = "+ boo2);
		// 100 --> 

		num = -num;
		System.out.println("num = "+ num); //-10
		//삼형 연산자
		// =(조건식)?참일때 : 거짓일때;
		String str =( num > 0  )? "양수":"음수";
		System.out.println("str = "+ str);

 /* 실행
 	정수 = 15
		  20
		  100
	입력한 값은 짝수 입니다. 홀수 입니다.
	*/
	
	
	String str1 = ( num > 0) ? "짝수" : "홀수";
	System.out.println("str1 = "+ str1);

	}
}
