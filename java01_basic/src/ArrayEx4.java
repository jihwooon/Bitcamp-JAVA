import java.util.Scanner;


public class ArrayEx4
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����");
			
		
		
		System.out.print("�л���=");
			int student = scan.nextInt();	
			
			int [][] matrix = new int[student][7];
			
			for(int i = 0; i<=matrix.length; i++) {
				
				for(int j = 0; j<=matrix[i].length; j++) {
		
				System.out.print("�̸�=");
					matrix [i][j] = scan.nextInt();
				System.out.print("����=");
					matrix [i][j] = scan.nextInt();
				System.out.print("����=");
					matrix [i][j] = scan.nextInt();
				System.out.print("����=");
					matrix [i][j] = scan.nextInt();
					
				}//for ��
		System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���"+"\t"+"����");
						
			
		/*		
		
				
				//�Է�
				for(int r=0; r<= matrix.length; r++){
					System.out.print(r+1+name);
						if() {
						
						}else if()
										
						for(int c=0; c<=matrix[r].length; c++) {
							
							
				
					System.out.print(sum+" ");
						avg = (double)sum / martrix[r].length;
							System.out.pritnf("%2f\n",avg);
			
			
					}//�� �迭 �Է� �Ϸ�
				System.out.println();
			*/
			}					
		}//for end
	}
	//pubilc
//class

/*
�л��� �Է¹ް� 3���������� �Է¹��� �� ���κ� ����, ���, ������ ���ϰ�
�� ���� ������ ����� ���϶�.
��, ���������� ���

����
�л���=3
�̸� = ȫ�浿
����=90 kor
����=80 eng
����=90 mas

�̸�=�ڱ浿
:
:
�̸�		����		����		����		����		���		����
ȫ�浿	90		80		90		260		_		_
�ڱ浿	_		_		_		_		_		_
_		_		_		_		_		_		_


*/