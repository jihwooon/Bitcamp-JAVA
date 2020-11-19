import java.util.Scanner;

class SwitchEx1

{
	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("실행");
		System.out.print("월 = ");
					
		int inData = Scan.nextInt();
		if(inData>=1 && inData<=12){
		String mouth;

		switch (inData){

		case 11 : case 12 : case 1 : case 2 :
			mouth ="겨울";
			break;

		case 3 : case 4 : case 5 :
			mouth ="봄";
			break;

		case 6 : case 7 : case 8 :
			mouth ="여름";
			break;
					
		default : 
			mouth ="가을";

		}//switch
		System.out.println(+inData+"월은 "+mouth+"입니다");

	}else{
		System.out.println("월을 잘못입력하였습니다.");
	
	}
}
}
/*
월을 입력받아
11, 12, 1, 2 은 겨울
3,4,5 봄
6,7,8 여름
9,10, 가을

실행
월 = 12
12월은 겨울입니다.
*/