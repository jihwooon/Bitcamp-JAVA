import java.util.Calendar;

public class StaticTest {

	public static void main(String[] args) {
		BBB b =new BBB();
		System.out.println("b.num"+b.num);
		//static Ű���尡 ������� ǥ��ɰ�� ��ü�� �������� �ʰ� �����Ҽ� �ִ�.
		//static ���� ��������ν�, �̸� �޸𸮿� �ö� �����Ƿ�, �ν��Ͻ� ���� ���� �ٷ� ��밡���ϴ�.
		
		System.out.println("AAA.num="+ AAA.num);
			
		CCC c1 = new CCC();
		CCC c2 = new CCC();
		CCC c3 = new CCC();
		
		//static ������ ��ü�� ������ �� ��ü�� ���뺯���� ����Ѵ�.
		c1.name = "�������";
		c3.print();
		
		//static �޼ҵ� ǥ���ϴ� ��� ��ü�������� �ʰ� �޼ҵ带 ȣ���Ҽ� �ִ�.
		CCC.print();
		
		Math.random();
		Calendar.getInstance();
		
		BBB b2 = BBB.getInstance();
		System.out.println("b2.num="+b2.num);
		
		
	}
}
