class  WhileEx3
{
	public static void main(String[] args) {
		
		
	int i = 0;
	int j = 1;
	int sum = 0;

		
		while (true){
			i++;
			if(i<9) 
			break;
			
			while(true){
				sum = i*j;
				System.out.print(sum+"\t");
					j++;
				if(j<9) {
					System.out.println();
					j =1;
					break;
				}//if end
				
			
			}//while 2 end
		
		
		}//while 1 end
		
	}//public
}//classs
