package javaAPI;

class RandomTest{
	

	
	public static void main(String[] args) 
	{
		//���� ����
		// 0.0 ~ 1.0������ ���� �������ش�. 
		
		//System.out.println(ran);
		// Scanner. <-�Ұ�

		for(int i=0; i<=1000; i++){
			double ran = Math.random();
			// 1~100���� (����ȭ)(���� *(ū��-������+1)) + ������ 
			int ranInt = (int)(ran*50)+51; // 100 -> 0~99, 50 --> 0~49
			System.out.print(ranInt+"\t");
		}

	}
}
