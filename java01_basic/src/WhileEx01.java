import java.util.Scanner;
import java.util.Random;

class WhileEx01 
{
	public static void main(String[] args) 
	{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	System.out.println("����");
	while(true) {
	System.out.println("******"+"���� ���߱�"+"******");

	int ranInt = ran.nextInt(100)+1; //0~99 -> +1 1~100
	
	int cnt =0;
		while(true){
			System.out.print("����(1~100) �Է� =");
			int inData = scan.nextInt();
			cnt++;//���Է� Ƚ��
			
			if(ranInt > inData){//������ ū���϶� 
				System.out.println(inData+"���� ū�� �Դϴ�...");
			}
			else if(ranInt < inData) {//�Է¹��� ���� ū ���϶�
				System.out.println(inData+"���� ������ �Դϴ�.");
			}else{//������
				System.out.println(cnt+"��°��"+inData+"�� ���߼̽��ϴ�..");
				break;

				}//if
			}//while
		}//while
	
	}//public end
}//class end

/*

����
*******���� ���߱�*******
����(1~100) �Է� =52
52���� ū�� ���ϴ�.
����(1~100)�Է� = 70
70���� ������ �Դϴ�.
����(1~100)�Է�=65
65���� ������ �Դϴ�.
����(1~100)�Է� =62

4��°���� 62�� ���߼̽��ϴ�.

*/
