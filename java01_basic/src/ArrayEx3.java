class ArrayEx3 {
	
	public static void main(String[] args) {
		
			int [][] num = new int[10][10];

			//�Է�
					
			for(int i=0; i<num.length; i++){//�� 1�� 1�� 100 1�� 10�� 100	
				for(int j=0; j<num[i].length; j++) {//��
						if(i == j || i+j == num.length-1) num[i][j]=100;		
					}		
				}

			//���
				for(int i=0; i<num.length; i++) {
					for(int j=0; j<num[i].length; j++) {
						System.out.printf("%5d",num[i][j]);
			}
					System.out.println();
		}
	}//pubilc end
}//class end
