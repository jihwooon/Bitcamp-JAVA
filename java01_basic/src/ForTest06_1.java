class ForTest06_1 
{
	public static void main(String[] args) 
	{
		
	for(int i = 1; i<=5; i++){ //�ܺ� for (i = ��)ex) i = 1 -> ù��° ��
		//���� 
		for(int space=1; space<=5-i; space++){
			System.out.print(" ");
		}
		//��
		for(int j=1; j<=i; j++){
			System.out.print("@");//���� ���
		}
			System.out.println();//�ٹٲ�
	 }
	}
}
/*
	*   
   **	
  ***
 ****
*****
*/