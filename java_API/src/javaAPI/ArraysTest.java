package javaAPI;
import java.util.Arrays;

class ArraysTest
{
	public static void main(String[] args) 
	{
		//Arrays : �迭���� Ŭ���� 
		
		int data[] = {10, 67, 25, 52, 62, 25, 5, 40, 91};

		//Arrays.sort(data); //�迭�� ���� ����
		Arrays.sort(data,0,4);//index�� �������� ���Ĺ����� �����Ѵ�. 
		System.out.println(Arrays.toString(data)); //�迭�� ���� ���ڿ��� ������ش�. 

		//�迭�� ����
		int dataCopy[] = Arrays.copyOfRange(data, 2, 6);
		System.out.println(Arrays.toString(dataCopy));

		String name[] = {"ȫ�浿", "�̼���", "�������", "������", "���"};
		Arrays.sort(name);
		String nameStr = Arrays.toString(name);
		System.out.println(nameStr);

		
		//�迭�� �� 
		int data2[] = {10, 67, 25, 52, 62, 25, 5, 40, 91};
		int data3[] = data;
		boolean boo = Arrays.equals(data,data3); //��ü�� �ּҸ� ���Ͽ� ������ Ȯ�� 
		System.out.println(boo);



	}
}
