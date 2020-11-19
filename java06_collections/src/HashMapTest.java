import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {

	}

	public void start() {

		// HashMap : ����ȭ���� �ʴ´�. Hashtable : ����ȭ�Ѵ�.
		// HashMap<String, MemberVO> map = new HashMap<String, MemberVO>();

		Hashtable<String, MemberVO> map = new Hashtable<String, MemberVO>();

		MemberVO vo = new MemberVO(50, "ȫ�浿", "010-7899-2121", "asdfc@nate.com");
		map.put("ȫ�浿", vo);
		map.put("������", new MemberVO(10, "������", "010-9999-4444", "great@gmail.com"));
		map.put("�������", new MemberVO(30, "�������", "010-1234-5367", "asdasda@hanmail.com"));
		map.put("�̼���", new MemberVO(25, "���", "010-1234-5678", "asdasfg@nate.com"));
		map.put("������", new MemberVO(40, "������", "010-4567-7788", "kimteahee@naver.com"));

		
		// key�� �̿��� ���� ������
		MemberVO vo2 = map.get("�������");
		vo2.print();
		System.out.println("=======================");
		
		
		// key�� ��� ���ϱ�
		Set<String> keylist = map.keySet();
		Iterator<String> key = keylist.iterator();

		while (key.hasNext()) {
			MemberVO vo3 = map.get(key.next());
			vo3.print();

		}
		System.out.println("=======================");
	
		
		// value��� ���ϱ�
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
