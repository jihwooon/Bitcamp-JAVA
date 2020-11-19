package javaAPI;

class RandomTest{
	

	
	public static void main(String[] args) 
	{
		//난수 생성
		// 0.0 ~ 1.0사이의 값을 생성해준다. 
		
		//System.out.println(ran);
		// Scanner. <-불가

		for(int i=0; i<=1000; i++){
			double ran = Math.random();
			// 1~100사이 (정수화)(난수 *(큰수-작은수+1)) + 작은수 
			int ranInt = (int)(ran*50)+51; // 100 -> 0~99, 50 --> 0~49
			System.out.print(ranInt+"\t");
		}

	}
}
