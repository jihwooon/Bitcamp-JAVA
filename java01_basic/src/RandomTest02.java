import java.util.Random;


class RandomTest02 
{
	public static void main(String[] args) 
	{
		
		//RandomŬ������ �̿��� ���� �����
		Random ran = new Random();

	for(int i = 1; i<=500; i++) {
		// int �������ǹ������� ������ �� 
		// nextDouble(), nextFloat(),
		// nextBoolan(), 
		// 0~99, 0~49
		//51~100, ū -��+1
		int ranInt = ran.nextInt(50) + 51;//int�������� �����Ͽ��ش�. nextLong()
		//Double ranInt = ran.nextDouble();
		System.out.print(ranInt+"\t");
	}



	}
}
