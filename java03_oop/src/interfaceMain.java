import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class에서 interface는 implements로 다중상속이 가능하다.

public class interfaceMain implements interfaceTest, ActionListener {

	public interfaceMain() {

	}
	// interface의 추상메소드 모두 오버라이딩 하여야 한다.

	public int plus(int a, int b) {
		return a + b;
	}

	public String getUsername() {
		return USER_NAME;

	}

	public int minus(int a, int b) {
		int result = 0;
		if (a > b) {
			result = a - b;
		} else {
			result = b - a;
		}
		return result;
	}

	public int multiple(int a, int b) {
		return a * b;
	}

	public int devide(int a, int b) {
		return a / b;
	}

	public void actionPerformed(ActionEvent e) {

	}
	
	public static void main(String[] args) {
		interfaceMain im = new interfaceMain();
		System.out.println("10,5=" + im.minus(10, 5));
		System.out.println("5,10=" + im.minus(5, 10));

	}
}
