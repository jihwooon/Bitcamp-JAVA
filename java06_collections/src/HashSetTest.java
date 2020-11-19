import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		// Set interface : �Է¼����� �������� �ʴ´�.
		// : �ߺ���ü�� ������� �ʴ´�. �ζ��ߺ�
	}

	public void start() {
		Double[] data = { 23.6, 52.8, 85.6, 84.7, 12.8, 52.8, 85.6, 56.5 };

		HashSet<Double> hs = new HashSet<Double>();
		for (Double d : data) {
			hs.add(d);
		}
		System.out.println("size=" + hs.size());

		// hashSet�� get()�޼ҵ尡 ����.
		// Iterator�������̽��� �̿��Ͽ� �����͸� ��� �Ҽ� �ִ�.

		Iterator<Double> iter = hs.iterator();
		while (iter.hasNext()) {// ��ü�� �ִ��� Ȯ��
			double d = iter.next();
			System.out.println(d);

		}
	}

	public static void main(String[] args) {
		new HashSetTest().start();

	}

}
