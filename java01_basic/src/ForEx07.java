import java.util.Scanner;

class ForEx07_1
{
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);

			System.out.print("È¦¼ö ÀÔ·Â =");
			int max = scan.nextInt();
 
				if(max%2 ==0){
					max++;
				}
			char txt = 'A';
			
			int step=2;
			for(int i=0; i<max; i +=step) {
							
				for(int s= 0; s<=(max-i)/2; s++){//
						System.out.print(" ");
					
				}	for(int j = 0; j<=i; j++) {//*
					
					System.out.print(txt++);
					if(txt>'Z')
						txt='A';
					}			
					
					System.out.println();
					if(max<=i) step=-2;
				}
				
								
					
		
	}
}

/*
½ÇÇà
È¦¼öÀÔ·Â = 11 if(%3==0)

		A				(1*1)
	   BCD				1*3
	  EFGHI				1*
	 

*/