public class PrintfTest
{

	//final ��� : �빮�ڷ� ����
	//static public void main(String[] args)
	//public static void main(Strint[] args)
	//public static void main(Strint data[])
	public static void main(String[] args)
		
	{
	
	String msg = "�ι�° �ڹٰ�����...";
	System.out.println(msg);
	
	//Printf() : ��� ������ �������� �����Ѵ�.
	double result = 10 / (double)3;
	System.out.println("result : "+ result);
	
	int numInt = 1234;
	String username = "ȫ�浿";
	//���� format : %10d �ڸ���
	System.out.printf("numInt(����)=%10d",numInt);
	//�Ǽ�  format : %10.2f - > ��ü 10�ڸ� �� �Ҽ� ���� 2�ڸ�
	System.out.printf("resutl=%10.2f",result);
	//���� format : %10s
	System.out.printf("�̸�=%10s",username);

	System.out.println();
	//�ѹ��� ���������� ���
	System.out.printf("%6.1f,%7d, %5s", result, numInt, username);

	//�����
	//�̸� ��� : ���̸��� "ȫ�浿"�Դϴ�.
	//����� : \",  \', \n,(newline),   \t(tap)
	System.out.printf("���̸��� \"%s\"�Դϴ�.\n",username );
	
	//�̸� ��� : ���̸��� \ȫ�浿\�Դϴ�.
	System.out.printf("\t���̸��� \\%s\\�Դϴ�.\n" ,username );
	
		
	}

}