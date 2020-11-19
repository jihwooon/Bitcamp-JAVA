class WhileTest2 
{
	public static void main(String[] args) 
	{
		
			int i = 1;		
			
			while(i<=5) {//행
				int j = 1;

			while(j<=5){//열
				System.out.print(j);
				j++;
			}
			
			System.out.println();
			i++;
		}//while end
		
		System.out.println("The End...");
	}
}

/*
While문으로 만들기

12345
12345
12345
12345
12345
*/