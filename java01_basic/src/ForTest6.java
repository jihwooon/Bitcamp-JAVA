class  ForTest6
{
	public static void main(String[] args) 
	{
		
		for(int i=1; i<=5; i++){//1 -> 5바퀴				
			for(int j=1; i<=j; j++){//1,2,3,4,5 -> 자리 출력
				System.out.print("*");//25
			}
			System.out.println();//줄변경
		}
		
/*
*       1-1
**      1-2
***     1-3
****	1-4
*****   1-5
*/
	
		
		for(int d=5; 5>=d; d--){//5,4,3,2,1
			for(int k=1; k<=d; k++){//1
				System.out.print("B");
		}
			System.out.println();//줄변경
	}
/*

***** 5-5
****  5-4
***   5-3
**    5-2
*     5-1

*/

/*
		for(int i=1; i<=5; i++){
			for(int j=5; int j) {
			
			}
		}
*/


/*
    * 1-1
   ** 1-2
  *** 1-3
 **** 1-4
***** 1-5
*/
	
	

	}
}
/*
중첩반복문 : 반복문내의 반복문

실행

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

*/