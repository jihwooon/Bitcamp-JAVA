import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {

	}

	public void start() {

		// HashMap : 동기화하지 않는다. Hashtable : 동기화한다.
		// HashMap<String, MemberVO> map = new HashMap<String, MemberVO>();

		Hashtable<String, MemberVO> map = new Hashtable<String, MemberVO>();

		MemberVO vo = new MemberVO(50, "홍길동", "010-7899-2121", "asdfc@nate.com");
		map.put("홍길동", vo);
		map.put("강감찬", new MemberVO(10, "강감찬", "010-9999-4444", "great@gmail.com"));
		map.put("세종대왕", new MemberVO(30, "세종대왕", "010-1234-5367", "asdasda@hanmail.com"));
		map.put("이순신", new MemberVO(25, "김삿갓", "010-1234-5678", "asdasfg@nate.com"));
		map.put("김태희", new MemberVO(40, "김태희", "010-4567-7788", "kimteahee@naver.com"));

		
		// key를 이용한 정보 얻어오기
		MemberVO vo2 = map.get("세종대왕");
		vo2.print();
		System.out.println("=======================");
		
		
		// key의 목록 구하기
		Set<String> keylist = map.keySet();
		Iterator<String> key = keylist.iterator();

		while (key.hasNext()) {
			MemberVO vo3 = map.get(key.next());
			vo3.print();

		}
		System.out.println("=======================");
	
		
		// value목록 구하기
		Collection<MemberVO> value = map.values();

		Iterator<MemberVO> v = value.iterator();
		while (v.hasNext()) {
			MemberVO vo4 = v.next();
			vo4.print();
		}
	}

	public static void main(String[] args) {
		new HashMapTest().start();

	}
}
