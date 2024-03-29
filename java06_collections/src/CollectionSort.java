import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CollectionSort {
	Random ran = new Random();

	public CollectionSort() {

	}

	// List 정렬
	public void listSort() {
		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			lst.add(ran.nextInt(100) + 1);
		}
		System.out.println("정렬전=" + lst.toString());
		Collections.sort(lst); // 정렬 오름차순
		System.out.println("정렬후=" + lst.toString());

		Collections.reverse(lst);// 내림차순
		System.out.println("정렬후=" + lst.toString());
		//////////////////////////
		String names[] = { "세이지", "장미", "코스모스", "튤립", "히야센스", "아카시아", "해바리기", "개나리", "풀잎채" };
		List<String> lst2 = new ArrayList<String>();
		for (String name : names) {
			lst2.add(name);
		}
		System.out.println("정렬전=" + lst2.toString());

		Collections.reverse(lst2);
		System.out.println("정렬후=" + lst2.toString());
	}

	// 컬렉션에 객체의 내용중 일부 데이터로 정렬할 경우
	public void objectSort() {
		List<MemberVO> lst = new ArrayList<MemberVO>();

		lst.add(new MemberVO(50, "홍길동", "010-7789-2111", "adsf@nate,com"));
		lst.add(new MemberVO(10, "강감찬", "010-9999-4444", "great@gmail.com"));
		lst.add(new MemberVO(30, "세종대왕", "010-1234-5367", "asdasda@hanmail.com"));
		lst.add(new MemberVO(25, "김삿갓", "010-1234-5678", "asdasfg@nate.com"));
		lst.add(new MemberVO(40, "김태희", "010-4567-7788", "kimteahee@naver.com"));

		System.out.println("============번호를 오름차순으로 정렬============");
		Collections.sort(lst, new CompareNumAsc());
		output(lst);

		
		System.out.println("============번호를 내림차순으로 정렬============");
		Collections.sort(lst, new CompareNumDesc());
		output(lst);
		
		System.out.println("============이름으로 오름차순으로 정렬============");
		Collections.sort(lst, new CompareNumeAsc());
		output(lst);
	
		System.out.println("============이름으로 내림차순으로 정렬============");
		Collections.sort(lst, new CompareNumeDesc());
		output(lst);
	
	}
	public void output(List<MemberVO> lst) {
		for(MemberVO vo : lst) {
			vo.print();
		}
	}

	// 정렬기준을 Comparator interface를 상속받은 compare() 메소드를 오버라이딩하여 정렬 기준으로 적용한다.
	
	// 이름을 오름차순으로 정렬
	class CompareNumeAsc implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			return v1.getName().compareTo(v2.getName());// 양수, 음수, 0

		}
	}
	
	class CompareNumeDesc implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			return v2.getName().compareTo(v1.getName());
		}
	}

	// 번호를 오름차순으로 정렬
	class CompareNumAsc implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {

			// v1이 작으면 : 1, v2가 작으면 -1, v1,v2가 같으면 : 0
			return (v1.getNum() < v2.getNum()) ? -1 : (v1.getNum() > v2.getNum()) ? 1 : 0;

		}
	}

	class CompareNumDesc implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			return (v1.getNum() < v2.getNum() ? 1 : (v1.getNum() > v2.getNum()) ? -1 : 0);
		}
	}

	public void start() {
		listSort();
		System.out.println("=========================================");
		objectSort();
	}

	public static void main(String[] args) {
		CollectionSort cs = new CollectionSort();
		cs.start();

	}
}
