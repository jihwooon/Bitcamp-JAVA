class Variable01 {

	public static void main(String[] args) 
	{ //�ּ� : ����
	   /* 

			������ �ּ���
			������ �ּ���

		/*
		//���� ���� = �⺻��������, ���۷�����(��ü��)
		// ���� : byte(1byte), shoart(2byte), int(4byte�⺻Ÿ��), long(8byte)
		// ��� : 100, 50
	}
}
/* 
���� ���� ��Ģ
1. �ҹ��ڷ� �����Ѵ�.
2. ù��° ���ڴ� ����, _, $ �� ����
3. Ư������(_, $����)�� ����� �� �����ϴ�.
4. �ռ����� ��� �ι�° �ܾ��� ù��° ���ڴ� �빮�ڷ� �����Ѵ�.
*/

//��������    ����   ���
	byte kroJumsu = 100;
	int engJumsu = 50;

	int hap = kroJumsu + engJumsu;
	//Ŭ����.����.�޼ҵ�		3���� �޼ҵ� print() : ����� �� �ȹٲ�. println() : ��� �� �ٹٲ�, printf()
	
	System.out.println("����="+kroJumsu); //java api
	System.out.println("����="+engJumsu);
	System.out.println("hap="+hap);
	System.out.println(kroJumsu +" + "+engJumsu+" = "+hap);
	
	//		typecasting(�� ��ȯ)
	byte num = (byte)130; //byte<int (byte : -128 ~ 127), *int ���� ��ȭ �� ����� �Ի� ������� �� Ȯ��

	System.out.println("num="+num);

	int num2 = num; //ū Ÿ���� ���� ��ȯ ��ų �ʿ䰡 ����.
	System.out.println("num2="+num2);

	
	}
}