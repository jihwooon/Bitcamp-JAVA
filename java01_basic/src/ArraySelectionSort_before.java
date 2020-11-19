public class ArraySelectionSort_before
{
	public static void main(String[] args) 
	{
		int min;
		int temp;
		
		int data[] = new int[10];

			for(int i=0; i<data.length; i++) {
				data[i] = (int)(Math.random()*100)+1; 
			}//

			
			for (int i = 0;i<data.length-1;i++) {

				for(int j =i+1;j<data.length-1-i;j++){
				

						if(data[i] > data[i+1]){
							int temp1 = data[i];
							data[i] = data[i+1];
							temp1 = data[i+1];

					}//if ¹®
				}	
			}//for ¹®
			for(int t : data){
				System.out.println(t+"\t");
		
		}//for ¹®
	}//public
}//class
