package javaAPI;

public class StringTest {
	public StringTest() {
		start();// ������ �޼ҵ�
	}

	public void start() {// �޼ҵ�� ������ �ҹ��� ��� �Ѵ�.
		// String�� ���ڿ��� ���õ� ���
		String name;
		String name2 = new String();
		String name3 = new String("ȫ�浿");
		String name4 = new String("ȫ�浿");

		if (name3 == name4) {
			System.out.println("name3�� name4�� ����");

		} else {
			System.out.println("name3�� name4�� �ٸ���");
		}
		// ��ü�� ������ Ȯ���ϱ� ���ؼ��� equals()�޼ҵ� ����Ѵ�.

		if (name3.equals(name4)) { // .equals (==) ���� �ǹ�
			System.out.println("����....");

		} else {
			System.out.println("�ٸ���....");
		}

		char c[] = { 'J', 'A', 'V', 'A' };
		String cStr = new String(c);
		System.out.println("cStr=" + cStr);

		String valueStr = String.copyValueOf(c);
		System.out.println("valueStr=" + valueStr);

		int num = 1234;
		String numStr = String.valueOf(num);
		// �����ε�(Overloading) : ���� �̸��� �޼ҵ带 ���� �� �����鼭 �Ű������� ������ ������ �ٸ����� �ϴ� ���
		System.out.println("numStr=" + numStr);

		String numStr2 = num + "";
		System.out.println("numStr2=" + numStr2);

		// index 01234513515161617
		String data = "Java Programing Test.....";
		char at = data.charAt(5);
		System.out.println("charAt=" + at);

		// ���ڿ��� ����Ʈ �迭�� �����Ͽ� �������ش�.
		byte dataArr[] = data.getBytes();
		for (int i = 0; i < dataArr.length; i++) {
			System.out.println("dataArr[" + i + "]=" + dataArr[i]);

		} // start() end
			// Ư�������� index��ġ�� ���Ѵ�.
		int idx = data.indexOf("g");
		System.out.println("indexOf=" + idx);

		int idxLast = data.lastIndexOf("g");
		System.out.println("lastIndexOf=" + idxLast);
		
		//���ڼ�
		int size = data.length();
		System.out.println("length="+size);
		
		//���� ��ü
		data = data.replaceAll("Java", "�ڹ�");
		System.out.println("replaceAll="+data);
		
		//���� �ɰ��� ���
		String tel = "010-1234--5678";
		String telsplit[] = tel.split("-");
		for(int i=0; i<telsplit.length; i++)
			System.out.println("telsplit["+i+"]="+telsplit[i]);
	
//		substring
		String email = "abcdef@nate.com";
		int emailindex =email.indexOf("@");
//										6���ڸ����� ���ڿ��� ���Ѵ�.
		String id = email.substring(0,emailindex);
		System.out.println("id="+id);
		String domain = email.substring(emailindex+1);
		System.out.println("domain="+domain);
		
		//toLowerCase() : �ҹ��ڷ� ����
		//toUpperCase() : �빮�ڷ� ����
		
		String lower = data.toLowerCase();
		String upper = data.toLowerCase();
		System.out.println("toLowerCase="+lower);
		System.out.println("toLowerCase="+upper);		

	//equals(): ��ҹ��� �����Ͽ� ������ ��� true, false
	//equalsIngnoreCase : ��ҹ��ڸ� �������� �ʰ� ������ ��� ���Ѵ�.
	
	String d1 = "Test Program";
	String d2 = "Test Program";
		
	if(d1.equals(d2)) {
		System.out.println("equals()=>d1�� d2�� ���� ���ڿ��Դϴ�.");
	}else {
		System.out.println("equals()=>d1�� d2�� �ٸ� ���ڿ��Դϴ�.");
	}
	if(d1.equalsIgnoreCase(d2)) {
		System.out.println("equalsIgnoreCase()=>d1�� d2�� ���� ���ڿ��Դϴ�.");
	}else {
		System.out.println("equalsIgnoreCse()=>d1�� d2�� �ٸ� ���ڿ��Դϴ�.");
	}
}
	public static void main(String[] args) {
		new StringTest();// ���� �޼���
	}
	
}
