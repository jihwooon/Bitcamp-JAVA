
public class Sedan extends Car2 {
	int speed = 150;

	public Sedan() {
		// ���� Ŭ������ �Ű������� �ִ� ������ ȣ��
		// �ݵ�� ù�࿡�� ȣ���Ͽ��� �Ѵ�.
		super("red");
		System.out.println("Sedan()������");

	}

	// �������̵� overriding : ����Ŭ������ �޼ҵ带 ����Ŭ�������� ������
	public void speedUp() {
		super.speed += 10;
		if (super.speed <= SPEED_MAX) {
			super.speed = SPEED_MAX;
		}
		System.out.println("speed=" + super.speed);

		super.speedUp();
		//System.out.println("Car.color=" + color);
	}

	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.speedUp();
	}
}
