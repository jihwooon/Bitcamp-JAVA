package javaAPI;

public class StringTest {
	public StringTest() {
		start();// 생성자 메소드
	}

	public void start() {// 메소드는 무조건 소문자 써야 한다.
		// String는 문자열과 관련된 기능
		String name;
		String name2 = new String();
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");

		if (name3 == name4) {
			System.out.println("name3과 name4는 같다");

		} else {
			System.out.println("name3과 name4는 다르다");
		}
		// 객체가 같은지 확인하기 위해서는 equals()메소드 사용한다.

		if (name3.equals(name4)) { // .equals (==) 같은 의미
			System.out.println("같다....");

		} else {
			System.out.println("다르다....");
		}

		char c[] = { 'J', 'A', 'V', 'A' };
		String cStr = new String(c);
		System.out.println("cStr=" + cStr);

		String valueStr = String.copyValueOf(c);
		System.out.println("valueStr=" + valueStr);

		int num = 1234;
		String numStr = String.valueOf(num);
		// 오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
		System.out.println("numStr=" + numStr);

		String numStr2 = num + "";
		System.out.println("numStr2=" + numStr2);

		// index 01234513515161617
		String data = "Java Programing Test.....";
		char at = data.charAt(5);
		System.out.println("charAt=" + at);

		// 문자열을 바이트 배열로 생성하여 리턴해준다.
		byte dataArr[] = data.getBytes();
		for (int i = 0; i < dataArr.length; i++) {
			System.out.println("dataArr[" + i + "]=" + dataArr[i]);

		} // start() end
			// 특정문자의 index위치를 구한다.
		int idx = data.indexOf("g");
		System.out.println("indexOf=" + idx);

		int idxLast = data.lastIndexOf("g");
		System.out.println("lastIndexOf=" + idxLast);
		
		//글자수
		int size = data.length();
		System.out.println("length="+size);
		
		//글자 대체
		data = data.replaceAll("Java", "자바");
		System.out.println("replaceAll="+data);
		
		//글자 쪼개서 출력
		String tel = "010-1234--5678";
		String telsplit[] = tel.split("-");
		for(int i=0; i<telsplit.length; i++)
			System.out.println("telsplit["+i+"]="+telsplit[i]);
	
//		substring
		String email = "abcdef@nate.com";
		int emailindex =email.indexOf("@");
//										6앞자리까지 문자열을 구한다.
		String id = email.substring(0,emailindex);
		System.out.println("id="+id);
		String domain = email.substring(emailindex+1);
		System.out.println("domain="+domain);
		
		//toLowerCase() : 소문자로 변경
		//toUpperCase() : 대문자로 변경
		
		String lower = data.toLowerCase();
		String upper = data.toLowerCase();
		System.out.println("toLowerCase="+lower);
		System.out.println("toLowerCase="+upper);		

	//equals(): 대소문자 구별하여 같은지 결과 true, false
	//equalsIngnoreCase : 대소문자를 구별하지 않고 같은지 결과 구한다.
	
	String d1 = "Test Program";
	String d2 = "Test Program";
		
	if(d1.equals(d2)) {
		System.out.println("equals()=>d1과 d2는 같은 문자열입니다.");
	}else {
		System.out.println("equals()=>d1과 d2는 다른 문자열입니다.");
	}
	if(d1.equalsIgnoreCase(d2)) {
		System.out.println("equalsIgnoreCase()=>d1과 d2는 같은 문자열입니다.");
	}else {
		System.out.println("equalsIgnoreCse()=>d1과 d2는 다른 문자열입니다.");
	}
}
	public static void main(String[] args) {
		new StringTest();// 메인 메서드
	}
	
}
