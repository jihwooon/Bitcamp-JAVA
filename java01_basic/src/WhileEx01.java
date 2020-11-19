import java.util.Scanner;
import java.util.Random;

class WhileEx01 
{
	public static void main(String[] args) 
	{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	System.out.println("실행");
	while(true) {
	System.out.println("******"+"숫자 맞추기"+"******");

	int ranInt = ran.nextInt(100)+1; //0~99 -> +1 1~100
	
	int cnt =0;
		while(true){
			System.out.print("정수(1~100) 입력 =");
			int inData = scan.nextInt();
			cnt++;//값입력 횟수
			
			if(ranInt > inData){//난수가 큰값일때 
				System.out.println(inData+"보다 큰수 입니다...");
			}
			else if(ranInt < inData) {//입력받은 값이 큰 값일때
				System.out.println(inData+"보다 작은수 입니다.");
			}else{//같을때
				System.out.println(cnt+"번째에"+inData+"을 맞추셨습니다..");
				break;

				}//if
			}//while
		}//while
	
	}//public end
}//class end

/*

실행
*******숫자 맞추기*******
정수(1~100) 입력 =52
52보다 큰수 업니다.
정수(1~100)입력 = 70
70보다 작은수 입니다.
정수(1~100)입력=65
65보다 작은수 입니다.
정수(1~100)입력 =62

4번째만에 62를 맞추셨습니다.

*/
