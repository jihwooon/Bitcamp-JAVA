import java.util.Scanner;
class Operator04 
{
	public static void main(String[] args) 
	{
		
		Scanner x = new Scanner(System.in);

		System.out.print("�����Է�");
		int inDate = x.nextInt();
		//and : &&, or : ||, not !
		String result = (inDate>=1 && inDate<=100)? "��" : "����";
		System.out.println(inDate+"�� ���� �������� "+ result);
	}
}


