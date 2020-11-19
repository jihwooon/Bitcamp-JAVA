package javaAPI;

import java.util.Random;



class RandomTest2 
{
	public static void main(String[] args) 
	{
		// Random 클래스를 이용한 난수 만들기 
		Random ran = new Random();
		for(int i = 1; i<=500; i++){
		
		// int 데이터 범위내의 임의의 수 
		// nextDouble(). nextFloat()
		// nextBoolean()., 
		// 0~00. 0~49 
		// 51~100사이,             큰수-작은수+1 
		
		int ranInt = ran.nextInt(50) +51; //int형 정수를 생성하여준다. nextLong()
		//boolean ranInt = ran.nextInt(50); 
		System.out.print(ranInt+"\t");
		}
	}
}
