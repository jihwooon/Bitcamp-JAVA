
public class Test_1exaplem {

	public static void main(String[] args) {
		
		Test_1 myCalc= new Test_1(); // ��ü ���� ; Ŭ���� �̸�  ��ü �̸� = new Ŭ���� �̸�();
		
		myCalc.powerOn(); //��ü �̸�.�޼ҵ� ȣ��();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1:"+ result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2:" + result2);
		myCalc.powerOff();
		
	}
}
