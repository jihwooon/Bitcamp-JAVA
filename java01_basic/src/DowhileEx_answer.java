import java.util.Scanner;

class DowhileEx_answer

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

	do{
		System.out.print("�����Է�=");
		int inData = scan.nextInt();
		if(inData<0){
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			break;
		}	//0���� ũ�ų� ������ 
			//1,2,3,4,5....

	int i=0;
	int sum=0, oddsum=0, evensum=0;
	
	while(i<inData){
		i++;
		sum +=i;
		if(i%2 == 0) {
			evensum +=i;
			} else {
			oddsum +=i;
			}
		
	}//do 
		System.out.println("1~"+inData+"������ ����"+sum);
		System.out.println("1~"+inData+"������ Ȧ���� ����"+oddsum);
		System.out.println("1~"+inData+"������ ¦���� ����"+evensum);
		
		}while (true);

	}//public end
}//class end
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
