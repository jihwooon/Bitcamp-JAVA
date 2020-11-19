package for_test;
class  ForTest06_3
{
	public static void main(String[] args) 
	{
		
			
	for(int i=1; i<=9; i+=2){//1,3,5,7,9(전체의 별의 갯수)
			
			//공백 1		4,3,2,1,0
		for(int s=1; s<=(9-i)/2; s++){
				System.out.print(" ");
			}
			//별
		for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/*
	*
   ***
 *******
*********

*/

	}
}
