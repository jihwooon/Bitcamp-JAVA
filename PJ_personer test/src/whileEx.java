
public class whileEx {

	public static void main(String[] args) {

		// ¹è¿­;
	
		int[][] num = new int[9][9];

		for (int i = 1; i <= num.length; i++) {
			
			for (int j = 1; j <= num.length; j++) {
				
				int sum = i*j;
				System.out.print(num[sum]);
				j++;
			}
			i++;
			System.out.println();
		}

	}// public end
}// class end
