import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {

	}

	public void start() {
		// TreeMap : key, value�� ������.
		// key�� �������� ���ĵǾ� �ִ�.

		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();

		MemberVO vo = new MemberVO(50, "ȫ�浿", "010-7899-2121", "asdfc@nate.com");
		tm.put("ȫ�浿", vo);
		tm.put("������", new MemberVO(10, "������", "010-9999-4444", "great@gmail.com"));
		tm.put("�������", new MemberVO(30, "�������", "010-1234-5367", "asdasda@hanmail.com"));
		tm.put("�̼���", new MemberVO(25, "���", "010-1234-5678", "asdasfg@nate.com"));
		tm.put("������", new MemberVO(40, "������", "010-4567-7788", "kimteahee@naver.com"));

		MemberVO vo2 = tm.get("�̼���");
		vo2.print();
		System.out.println("*******************key*******************");
		Set<String> keyList = tm.keySet();
		Iterator<String> i = keyList.iterator();
			while (i.hasNext()) {
				MemberVO vo3 = tm.get(i.next());
				vo3.print();
		}
		System.out.println("*******************value*******************");
			
		Collection<MemberVO> value = tm.values();

		Iterator<MemberVO> v = value.iterator();
			while (v.hasNext()) {
				MemberVO vo4 = v.next();
				vo4.print();
		
		}
	}

	public static void main(String[] args) {
		TreeMapTest tmt = new TreeMapTest();
		tmt.start();

	}

}
