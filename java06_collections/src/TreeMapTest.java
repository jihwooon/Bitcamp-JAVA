import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {

	}

	public void start() {
		// TreeMap : key, value¸¦ °¡Áø´Ù.
		// key¸¦ ±âÁØÀ¸·Î Á¤·ÄµÇ¾î ÀÖ´Ù.

		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();

		MemberVO vo = new MemberVO(50, "È«±æµ¿", "010-7899-2121", "asdfc@nate.com");
		tm.put("È«±æµ¿", vo);
		tm.put("°­°¨Âù", new MemberVO(10, "°­°¨Âù", "010-9999-4444", "great@gmail.com"));
		tm.put("¼¼Á¾´ë¿Õ", new MemberVO(30, "¼¼Á¾´ë¿Õ", "010-1234-5367", "asdasda@hanmail.com"));
		tm.put("ÀÌ¼ø½Å", new MemberVO(25, "±è»ñ°«", "010-1234-5678", "asdasfg@nate.com"));
		tm.put("±èÅÂÈñ", new MemberVO(40, "±èÅÂÈñ", "010-4567-7788", "kimteahee@naver.com"));

		MemberVO vo2 = tm.get("ÀÌ¼ø½Å");
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
