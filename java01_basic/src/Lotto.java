import java.util.Scanner;
import java.util.Arrays;

class Lotto 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.print("���Ӽ�=");
			int game = scan.nextInt();//���Ӽ�
			//������ ����
			//�ζǹ�ȣ ������ �迭
			
			for(int cnt =1; cnt<=game; cnt++) {//���Ӽ� ��ŭ �ݺ�
				int[] lotto = new int[7];
				for(int i = 0; i<lotto.length; i++){//0
					lotto[i] = (int)(Math.random()*(45-1+1)+1);
					//   12
					
					//�ߺ��˻�
					for(int j=0; j<i; j++){//
						if(lotto[j] == lotto[i]){
							i--;
							break;
						}
					}
				}	
			
			System.out.println();
			/*//���� ��
			for(int row=0; row<lotto.length-2; row++){
				for(int col =0; col<lotto.length-2; col++) {
					if(lotto[col] > lotto[col+1]) {
						int temp = lotto[col];
						lotto[col] = lotto[col+1];
						lotto[col+1] = temp;
					}
				}
			}
			*/
			Arrays.sort(lotto,0,6);
		 //���� ��
		  /*System.out.print(cnt+"����=[");
			for(int k=0; k<lotto.length; k++){//���ʽ� ���� ���
				System.out.print(lotto[k]);
				
				if(k==5){
					System.out.print("], ");
				}else{
					System.out.print(", ");
					}
				}
				*/
					System.out.print(Arrays.toString(Arrays.copyOfRange(lotto,0,6)));
					System.out.println(", bonus="+lotto[6]);
			}

			System.out.print("����Ͻðڽ��ϱ�(1:��, 2:�ƴϿ�)?");
			int qa = scan.nextInt();
			 if(qa!=1){//���α׷� ����=> 1�� �ƴѰ��
				System.out.println("���α׷��� ����Ǿ����ϴ�..");
				break;
			 
			 }
		}while(true); // do end
	}
}
	
