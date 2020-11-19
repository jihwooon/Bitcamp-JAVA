import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {
		// TresSet : �ߺ�������� �ʴ´�.
		// �Է¼����������� �ʴ´�.
		// ũ�������� ���ĵȴ�.

	}

	public void start() {
		TreeSet<String> ts = new TreeSet<String>();

		String txt[] = { "Java", "�ڹ�", "������", "Spring", "JAVA", "�ڹٽ�ũ��Ʈ", "HTML", "css", "jquery", "���ĸ�", "�ڹٽ�ũ��Ʈ",
				"HTML" };

		for (String t : txt) {
			ts.add(t);

		}
		// ������������ ���ĵ� �����͸� ���Ѵ�.
		Iterator<String> result = ts.iterator();
		while (result.hasNext()) {
			System.out.println(result.next());
		}
		System.out.println("--------------");

		// ������������ ����
		Iterator<String> descSort = ts.descendingIterator();

		while (descSort.hasNext()) {
			System.out.println(descSort.next());

		}
	}

	public static void main(String[] args) {
		new TreeSetTest().start();
	}

}
