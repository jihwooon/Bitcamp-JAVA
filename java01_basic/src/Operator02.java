

//java.lang��Ű�� ���� Ŭ���� �����Ϸ��� �˾Ƽ� �߰��� ���ش�.
import java.lang.String;
import java.lang.System;
class Operator02
  
{
	public static void main(String[] args) 
	{

		int num = 10;
		int data = 5;

		//��(����) ������ : >, <, >=, <=, ==(����), !=(���� �ʴ�.)
		boolean boo = 10 > 5;
		System.out.println("boo = "+ boo);
		
		//��� +,-,*,/,%		��ǻ�ʹ� 5+2-3 (���� ������� ��� ����) (5+2)+2 ��ȣ �ȿ� ���� ���
		//���� ������ >> ��� >> �� 

		boolean boo2 = 20 <= num * 10 / 2 + 15 - --data;
		System.out.println("boo2 = "+ boo2);
		// 100 --> 

		num = -num;
		System.out.println("num = "+ num); //-10
		//���� ������
		// =(���ǽ�)?���϶� : �����϶�;
		String str =( num > 0  )? "���":"����";
		System.out.println("str = "+ str);

 /* ����
 	���� = 15
		  20
		  100
	�Է��� ���� ¦�� �Դϴ�. Ȧ�� �Դϴ�.
	*/
	
	
	String str1 = ( num > 0) ? "¦��" : "Ȧ��";
	System.out.println("str1 = "+ str1);

	}
}
