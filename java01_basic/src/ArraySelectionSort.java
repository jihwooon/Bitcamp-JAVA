class ArraySelectionSort 
{
	public static void main(String[] args) 	
	{
		int [] ran = new int [10];
			System.out.println("-----������-----");
			for(int i = 0; i<ran.length; i++) {
				ran[i] = (int)(Math.random()*100)+1;
				System.out.print(ran[i]+"\t");



		}//for end

			for(int i = 0; i<ran.length-1; i++){
				for(int j =i+1; j<ran.length; j++){
					if(ran[i] < ran[j]) {
						int temp = ran[j];
						ran [i] = ran[j];
						ran [i] = temp;
					}//if end
				}//���� for end
			}//�ٱ�for end
			
			System.out.println("\n-----������-----");
			for(int i=0; i<ran.length; i++) {
				System.out.print(ran[i]+"\t");

				}	
	}//public end
}// class end
