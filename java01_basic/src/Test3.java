
import java.util.Scanner;

public class Test3
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String title[] = {"�̸�","����","����","����","����","���","����"};
		
		System.out.print("�л���=");
		int cnt = scan.nextInt();

		String names[] = new String[cnt];//�̸������� �迭
		double jumsu[][] = new double[cnt+2][6];//������ ������ �迭
		
		//�������Է�
			for(int i=0; i<cnt; i++) {// i=0,1,2,3,4 -> �л�����ŭ ȸ��
				System.out.print(title[0]+"=");//�̸�
				scan.nextLine();
				names[i] = scan.nextLine();

				//�������� ����
				for(int j=1; j<=3; j++) {// j=1,2,3	0,1,2
					System.out.print(title[j]+"=");
					jumsu[i][j-1] = scan.nextInt();
					
			}
			System.out.println();
		}
	//���κ� ����, ���, ���� ����
		for(int r=0; r<cnt; r++){// 1,2,3,4,5....
			for(int c=0; c<3; c++){// 0,1,2
				jumsu[r][3]=jumsu[r][3] + jumsu[r][c]; //��������
				jumsu[cnt][c] = jumsu[cnt][c] + jumsu[r][c];//���� ����

			}
			jumsu[r][4] = jumsu[r][3] / 3; //���κ� ���
		}

		for(int c=0; c<=2; c++) {
			jumsu[cnt+1][c] = jumsu[cnt][c] / cnt;
			
		}
	//���� ���ϱ� : �ڽ��� �������� ���� ������ ���� ���Ѵ�.
		for(int r=0; r<cnt; r++){//0,1,2,3,4
			
			for(int r2=0; r2<cnt; r2++) {//0,1,2,3,4
				// ������				��������
				if(jumsu[r][3] < jumsu[r2][3]){
					jumsu[r][5]++;
				
				}
			}
			jumsu[r][5]++;
		}

	//���----------------------------
	for(String t : title){//�������
		System.out.print(t+"\t");
	}
		System.out.println();
		//�̸��� ���� ���
			for(int i=0; i<jumsu.length; i++){//0,1,2,3,4,5,6
				if(i==cnt){
					System.out.print("����\t");
				
				}else if(i == cnt+1) {
					System.out.print("���\t");
				
				}else{
					System.out.print(names[i]+"\t"); //�̸�
				}
				for(int j=0; j<jumsu[i].length; j++){
						System.out.printf("%.1f\t",jumsu[i][j]);//�Ҽ��� ������ ���� ���� �� �� �� �ִ�.
				
				}
				System.out.println();
		}
	}
}
/*

*/