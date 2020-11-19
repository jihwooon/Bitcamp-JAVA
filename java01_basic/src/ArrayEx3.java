class ArrayEx3 {
	
	public static void main(String[] args) {
		
			int [][] num = new int[10][10];

			//입력
					
			for(int i=0; i<num.length; i++){//행 1행 1열 100 1행 10열 100	
				for(int j=0; j<num[i].length; j++) {//열
						if(i == j || i+j == num.length-1) num[i][j]=100;		
					}		
				}

			//출력
				for(int i=0; i<num.length; i++) {
					for(int j=0; j<num[i].length; j++) {
						System.out.printf("%5d",num[i][j]);
			}
					System.out.println();
		}
	}//pubilc end
}//class end
