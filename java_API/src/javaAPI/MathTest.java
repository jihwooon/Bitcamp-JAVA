package javaAPI;

public class MathTest {

	public MathTest() {

	}

	public static void main(String[] args) {
		System.out.println("abs=" + Math.abs(-9));// ����ġ

		// ceil() : �︲
		// floor() : ����
		// round() : �ݿø�

		System.out.println("ceil=" + Math.ceil(-10.1));
		System.out.println("floor=" + Math.floor(9.9));
		System.out.println("round=" + Math.round(10.5));

		int a = 90;
		int b = 20;
		System.out.println("max=" + Math.max(a, b));
		System.out.println("min=" + Math.min(a, b));
		int powInt = (int) Math.pow(7, 9);
		System.out.println("pow=" + Math.pow(7, 9) + "---->" + powInt);

		System.out.println("sqrt=" + Math.sqrt(10));
	}
}
