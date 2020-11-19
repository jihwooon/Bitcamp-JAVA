import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {

	}

	public void start() {
		// LinkedList : 입력 순서유지, queue(먼저입력된 객체 먼저 출력:FILO), deque 처리를 할수 있다.
		// 객체를 output 하면 컬렉션에서 객체가 제거 된다.

		LinkedList<String> ll = new LinkedList<String>();

		// 객체추가
		ll.offer("홍길동");
		ll.offer("이순신");
		ll.offer("세종대왕");

		// 객체수 하기
		System.out.println("객체수=" + ll.size());
		String str = ll.poll();
		System.out.println("str=" + str);
		System.out.println("객체수=" + ll.size());

		ll.offerFirst("지코");
		System.out.println("객체수=" + ll.size());

		String str2 = ll.pollLast();
		System.out.println("str2=" + str2);
		System.out.println("객체수=" + ll.size());

		// 컬렉션의 모든 객체를 순서대로 출력하라.

		while (ll.isEmpty()) { // 객체가 있을때 false, 없을때 true
			// 출력
			System.out.println("-->" + ll.poll());
		}
	}

	public static void main(String[] args) {
		new LinkedListTest().start();
	}

}
