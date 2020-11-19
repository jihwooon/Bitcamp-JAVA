
public class Test2
{
	public static void main(String[] args) {
	
		int [][]score = new int[5][5];
		
		int cnt = 21;
			for(int i=0; i<score.length; i++) {
				for(int j = 0; j<score.length; j++){
					score[i][j] = cnt;
					cnt = cnt +1;
				}
				cnt = cnt - 10;
			}
			for(int i =0; i<score.length; i++) {		
				for(int j = 0; j<score.length; j++){
					System.out.print(score[i][j] +"\t");
			}
					System.out.println();
		}		
	}
}
