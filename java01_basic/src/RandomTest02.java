import java.util.Random;


class RandomTest02 
{
	public static void main(String[] args) 
	{
		
		//Random클래스를 이용한 난수 만들기
		Random ran = new Random();

	for(int i = 1; i<=500; i++) {
		// int 데이터의범위내의 임의의 수 
		// nextDouble(), nextFloat(),
		// nextBoolan(), 
		// 0~99, 0~49
		//51~100, 큰 -작+1
		int ranInt = ran.nextInt(50) + 51;//int형정수를 생성하여준다. nextLong()
		//Double ranInt = ran.nextDouble();
		System.out.print(ranInt+"\t");
	}



	}
}
