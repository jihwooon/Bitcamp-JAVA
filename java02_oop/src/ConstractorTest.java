
public class ConstractorTest {// 생성자 메소드

	int num = 10;
	String name;
	String tel = "010-1111-2222";

	public ConstractorTest() {// 컴파일러가 public ConstractorTest() 생성해준다.매개변수가 있을때만

	}

	public ConstractorTest(int num) {
		System.out.println("ConstractorTest(int num) 생성자");
		this.num = num; // this 실행되는 클래스에 변수를 지정
	}

	public ConstractorTest(String name) {//

	}

	public ConstractorTest(int num, String name, String tel) {// ct3 실행
		// 생성자에서 다른 생성자를 호출하기 위해서는 반드시 첫번째 실행문으로 처리 해야한다.
		//
		this(num);
		System.out.println("ConstractorTest(int num, String name, String tel)생성자");
		// this.num = num;
		this.name = name;// this는 현재 클래스는 멤버 지정
		this.tel = tel;

	}

	public ConstractorTest(String name, String tel, int num) { // ()순서가 다르면 사용할 수 있다.
		this(num,name,tel);
		
		
	}

	public void prn() {
		System.out.println("번호=" + num);
		System.out.println("이름=" + name);
		System.out.println("연락처=" + tel);
	}
}
