class SwitchTest
{
	public static void main(String[] args) 
	{
	int data =5;
	//data값이 1:빨강, 2:노랑, 3:파랑, 4:보라, 5,6: 하늘색 나머지:블랙

	String color;//null ""
	switch(data){
		case 1:
			color="빨강";
			break;
		case 2:
			color="노랑";
			break;
		case 3:
			color="파랑";
			break;
		case 4:
			color="보라";
			break;
		
		case 5:
		case 6:
			color="하늘색";
			break;

		default:
			color="블랙";			
		}//switch
	System.out.println(color);
	}
}
/*
범위를 지정하지 않은 조건문


기본데이터타입은 int보다 작은 타입(byte, short, int)
			char, String : 문자열,
a+b a/3 50 'A' "홍길동"
a=2
swich(수식, 상수){
	case 상수 : 실행문;
			   실행문;
			   [break;]
	case 상수 : 실행문;
			   실행문;
			   [break;]
	[default: 실행문;
			  실행문;]			 
}

-> 
*/
