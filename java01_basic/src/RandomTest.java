

class RandomTest
{
	public static void main(String[] args) 
	{
	
		//���� ����
		// 0.0~1.0������ ���� �������ش�.

	for(int i=1; i<=1000; i++){

		double ran = Math.random();
		
		//1~100 		(����)(����*(ū��-������+1)) + ������
		//51~100		100-50+1
		
		int result =(int)(ran*44)+1;// 100--> 0~99, 50--> 0~49
		System.out.print(result+"\t");
		


		}
	}
}
