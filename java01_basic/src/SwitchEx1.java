import java.util.Scanner;

class SwitchEx1

{
	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("����");
		System.out.print("�� = ");
					
		int inData = Scan.nextInt();
		if(inData>=1 && inData<=12){
		String mouth;

		switch (inData){

		case 11 : case 12 : case 1 : case 2 :
			mouth ="�ܿ�";
			break;

		case 3 : case 4 : case 5 :
			mouth ="��";
			break;

		case 6 : case 7 : case 8 :
			mouth ="����";
			break;
					
		default : 
			mouth ="����";

		}//switch
		System.out.println(+inData+"���� "+mouth+"�Դϴ�");

	}else{
		System.out.println("���� �߸��Է��Ͽ����ϴ�.");
	
	}
}
}
/*
���� �Է¹޾�
11, 12, 1, 2 �� �ܿ�
3,4,5 ��
6,7,8 ����
9,10, ����

����
�� = 12
12���� �ܿ��Դϴ�.
*/