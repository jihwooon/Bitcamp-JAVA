// 클래스에서 클래스를 상속바듣 경우 1개의 클래스만 상속가능하다.
public class Car2 extends Object {
	// private멤버변수는 하위클래스에서 사용할수 없다.(=상속되지 않는다.)

	private String color = "while";
	protected int wheel = 4;
	final int SPEED_MAX = 200;
	int speed;

	protected Car2() {
		System.out.println("Car()생성자");
	}

	public void speedUp() {
		speed++;
		if (speed >= SPEED_MAX) {
			speed = SPEED_MAX;

		}
		System.out.println("speed=" + speed);

	}

	public void speedDown() {
		speed--;
		if (speed <= 0) {
			speed = 0;
		}
		System.out.println("speed=" + speed);
	}

	public Car2(String color) {
		this.color = color;
		System.out.println("color=" + color);
	}
	public static Car2 getInstance() {
		return new Car2();
	}
}

