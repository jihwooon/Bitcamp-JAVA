package for_test;
import java.util.Scanner;

class ForEx04 
{
	public static void main(String[] args) 
	{
		
	Scanner scan = new Scanner(System.in);
	System.out.println("실행");

	System.out.print("수입력=");
	int inData = scan.nextInt();
	
	int sum = 0, oddsum=0, evensum=0;
	for(int i= 1; i<=inData; i++){
		sum +=i;// 전체합
		if(i%2==0){//짝수
			evensum +=i;
	
		} else {//홀수
			oddsum +=i;
			}
	}
		System.out.println("1~"+inData+"까지의 합"+sum);
		System.out.println("1~"+inData+"까지의 홀수의 합은"+oddsum);
		System.out.println("1~"+inData+"까지의 합은"+evensum);
	
		}
	}
















/*
어떤수(정수)를 입력받아
입력받은 수까지 짝수의 합, 홀수의 합, 전제합을 구하여라.

실행
수입력=100
1~100까지의 합 5050
1~100까지 홀수의 합은 2500
1~100까지 짝수의 합은 2550
*/