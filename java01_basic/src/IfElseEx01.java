import java.util.Scanner;

class IfElseEx01 
{
	public static void main(String[] args) 	{
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("�޴�(1:�簢���ǳ���,2:���ǳ���)");
	int menu = scan.nextInt();

	if (menu==1){
		System.out.print("�غ�=");
			int width = scan.nextInt();
		System.out.print("����=");
			int height = scan.nextInt();
			int result = width * height;
		System.out.println("�簢���� ���̴�="+result+"�Դϴ�.");
	
	}else{
	if(menu==2){
		System.out.print("������=");
			int radius = scan.nextInt();
			double result= radius*radius*Math.PI;
		System.out.print("���� ���̴�="+result+"�Դϴ�.");
	}else{
		System.out.println("�޴��� �߸������Ͽ����ϴ�..");
	}
}
}
}
/*
 �޴�(1:�簢���� ����, 2:���� ����)-> 1
 �غ�=
 ����=
 �簢���� ���̴� ___�Դϴ�.

 �޴�(1:�簢���� ����, 2:���� ����)-> 2
 ������
 ���� ���̴� ___�Դϴ�.


*/