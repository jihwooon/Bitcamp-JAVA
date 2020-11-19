public class Truck extends Car2 {

	public Truck() {//
		System.out.println("Truck()생성자");
		wheel = 10;
		System.out.println("Truck.wheel=" + wheel);
	}

	public static void main(String[] args) {
		new Truck().speedUp();
	
		Car2 car = new Car2();
		Car2 car2 = Car2.getInstance();
		car.wheel = 12;
		
		
		//같은 패키지인 경우 객체를 생성하여 접근가능하다.
		Car car3 = new Car();
		car3.wheel = 15;
	}

}
