class ForTest06_1 
{
	public static void main(String[] args) 
	{
		
	for(int i = 1; i<=5; i++){ //외부 for (i = 줄)ex) i = 1 -> 첫번째 줄
		//공백 
		for(int space=1; space<=5-i; space++){
			System.out.print(" ");
		}
		//별
		for(int j=1; j<=i; j++){
			System.out.print("@");//내부 출력
		}
			System.out.println();//줄바꿈
	 }
	}
}
/*
	*   
   **	
  ***
 ****
*****
*/