package for_test;
import java.util.Scanner;

class ForEx05 
{
	public static void main(String[] args) 		{
	
		Scanner scan = new Scanner(System.in);

			System.out.println("����");
			
			System.out.print("������ �� =");	
			int score = scan.nextInt();

			int sum = 0;
			for (int i = 1; i<=score; i++ ){
				sum += i;

				if (score <= sum){// if(sum>score);���� �� ��
					System.out.println("1����"+i+"������ ����"+sum+"�̴�");
					break;
				}	

			}

}
}
/*
���Ǽ��� �Է¹޾�
1���� ���� ���ϴ� ���� �Է¹��� ���� ���ʷ� �ʰ��ϴ� ������ ���� ���� ���϶�.

����
������ �� = 12315
1����___������ ���� ____�̴�.

*/