import java.util.Scanner;

class DowhileEx

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("�����Է� =");
		int inData = scan.nextInt();

		int sum = 0, oddsum = 0, evensum = 0;
		int i = 0;
		
		while(i<inData) {

		i++;
		sum +=i;
		if(i%2 == 0) {
			evensum +=i;

		}else 
			oddsum +=i;
		}

		System.out.println("1~"+inData+"������ ����"+sum);
		System.out.println("1~"+inData+"������ Ȧ���� ����"+oddsum);
		System.out.println("1~"+inData+"������ ¦���� ����"+evensum);

		
	}
}



/*
==�ݵ�� while �� do~while

����
�����Է�=100
1~100������ ���� 5050 sum 
1~100������ Ȧ���� ���� 2500 
1~100������ ¦���� ���� 2550 

�����Է�= 150
1~150������ ����
1~150������ Ȧ���� ����
1~150������ ¦���� ����

�����Է�=-1
���α׷��� ����Ǿ����ϴ�.



*/