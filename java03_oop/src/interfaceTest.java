//interface가 interface를 상속을 받을 경우 extends키워드 1개만 상속받을 수 있다.


public interface interfaceTest extends Calulator{
	
	//static final 변수
	public static final int MAX_NUM = 100;
	public static final String USER_NAME = "hong";
	
	//추상메소드 : 반환형, 메소드명, 매개변수(아큐먼트)만 정의된 메소드
	//			실행부가 없다.
	public int plus(int a, int b);
	public String getUsername();
	public int minus(int a, int b);
	
}

	

