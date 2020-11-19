import java.util.Stack;

public class StackTest {

	public StackTest() {

	}

	public void start() {
		// Stack : 입렷순서유지, 중복데이터허용, FILD
		Stack<Integer> stack = new Stack<Integer>();

		stack.add(100);
		stack.add(200);
		stack.add(300);
		stack.add(400); //

		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

	public static void main(String[] args) {
		new StackTest().start();
	}

}
