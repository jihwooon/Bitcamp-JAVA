

class RandomTest
{
	public static void main(String[] args) 
	{
	
		//난수 생성
		// 0.0~1.0사이의 값을 생성해준다.

	for(int i=1; i<=1000; i++){

		double ran = Math.random();
		
		//1~100 		(정수)(난수*(큰수-작은수+1)) + 작은수
		//51~100		100-50+1
		
		int result =(int)(ran*44)+1;// 100--> 0~99, 50--> 0~49
		System.out.print(result+"\t");
		


		}
	}
}
