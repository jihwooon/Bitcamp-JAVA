package javaAPI;

import java.util.Random;



class RandomTest2 
{
	public static void main(String[] args) 
	{
		// Random Ŭ������ �̿��� ���� ����� 
		Random ran = new Random();
		for(int i = 1; i<=500; i++){
		
		// int ������ �������� ������ �� 
		// nextDouble(). nextFloat()
		// nextBoolean()., 
		// 0~00. 0~49 
		// 51~100����,             ū��-������+1 
		
		int ranInt = ran.nextInt(50) +51; //int�� ������ �����Ͽ��ش�. nextLong()
		//boolean ranInt = ran.nextInt(50); 
		System.out.print(ranInt+"\t");
		}
	}
}
