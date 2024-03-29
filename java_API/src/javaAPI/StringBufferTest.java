package javaAPI;

public class StringBufferTest {
	public StringBufferTest() {

		// 문자열을 처리, 데이터가 수정되어도 주소를 옮기지 않는다.
		// StringBuffer클래스
		// StringBuilder클래스

		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(50);
		StringBuffer sb3 = new StringBuffer("자바");

		sb.append("StringBuffer");// 문자열 추가
		sb.append("객체 테스트 중입니다.");

		// 문자열 길이구하기
		System.out.println("length=" + sb.length());

		// 문자열 삽입 중간에 밀어버리고 문자 삽입 index위치에 문자열 삽입
		sb.insert(8, "인터페이스");

		// sb=StringBu인터페이스ffer객체 테스트 중입니다.

		sb.delete(3, 7);
		System.out.println("sb=" + sb);

		sb.reverse();// 문자열 앞뒤바꾸기
		System.out.println("sb.reverse()->" + sb);

		// 메모리크기
		System.out.println("capacity=" + sb.capacity() + "," + sb2.capacity() + "," + sb3.capacity());

		String str = "test replace";
		StringBuffer str4 = new StringBuffer("test replace");

		// String는 데이터가 변경되면 다시 대입해주어야 한다.
		str.replace("test", "테스트");
		str4.replace(0, 4, "테스트");

		System.out.println("str=" + str);
		System.out.println("str4=" + str4);
		
		

	}

	public static void main(String[] args) {
		new StringBufferTest();

	}
}
