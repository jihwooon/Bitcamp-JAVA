class Varible02 
{
	public static void main(String[] args) 
	{
		//�Ǽ� : float(4byte), double(8byte:�⺻)
		//0.1234567.0
		//0 ~ 127

		float num = (float)10.5;
		double num2 = 25.5;
		

		System.out.println("num="+num);
		System.out.println("num2="+num2);
		//����,���� = ����, ����,�Ǽ� = �Ǽ�

		double result = num2 / 5;
		System.out.println("result ="+result);

		int result2 = 15/4;
		System.out.println("result2 ="+result2);

		double resultInt = 15/(double)4;
		System.out.println("resultInt="+resultInt);

			String userName = "ȫ�浿";
			String addr = "����� ������ �ż���";
			System.out.println(userName);
			System.out.println(addr);

	}
}
