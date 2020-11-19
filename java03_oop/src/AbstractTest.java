
//추상메소드를 1개 이상 포함한 클래스는 추상클래스가 된다.
public abstract class AbstractTest {
	int max =100;
	public AbstractTest() {
		
	}
	public void print() {
		System.out.println("max="+max);
	}
	
	// body 실행부가 없는 메소드를 추상 메소드라 한다.
	//추상메소드 반환형 왼쪽에 abstract표기하여야 한다.
	public abstract void print(int a); //추상 클래스(공통을 묶은 적으로 묶은 특성들)
	public abstract int sum();
	
}
