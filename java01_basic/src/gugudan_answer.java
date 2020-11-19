class gugudan_answer
{
	public static void main(String[] args) 
	{
	
	
		System.out.println("\t=구구단=");

		for(int dan=1; dan<=9; dan +=3) {

			for(int i = dan; i<dan+3; i++){

				System.out.print("="+i+"단=\t");
			}
		System.out.println();

	}
	for(int i = 1; i<9; i++) {
		for(int j =2; j<=9; j++) {
			int result = i*j;
			System.out.print(i+"*"+j+"="+result+"\t");

			}
			System.out.println();
		}
	}
}
