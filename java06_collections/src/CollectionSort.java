import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CollectionSort {
	Random ran = new Random();

	public CollectionSort() {

	}

	// List ����
	public void listSort() {
		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			lst.add(ran.nextInt(100) + 1);
		}
		System.out.println("������=" + lst.toString());
		Collections.sort(lst); // ���� ��������
		System.out.println("������=" + lst.toString());

		Collections.reverse(lst);// ��������
		System.out.println("������=" + lst.toString());
		//////////////////////////
		String names[] = { "������", "���", "�ڽ���", "ƫ��", "���߼���", "��ī�þ�", "�عٸ���", "������", "Ǯ��ä" };
		List<String> lst2 = new ArrayList<String>();
		for (String name : names) {
			lst2.add(name);
		}
		System.out.println("������=" + lst2.toString());

		Collections.reverse(lst2);
		System.out.println("������=" + lst2.toString());
	}

	// �÷��ǿ� ��ü�� ������ �Ϻ� �����ͷ� ������ ���
	public void objectSort() {
		List<MemberVO> lst = new ArrayList<MemberVO>();

		lst.add(new MemberVO(50, "ȫ�浿", "010-7789-2111", "adsf@nate,com"));
		lst.add(new MemberVO(10, "������", "010-9999-4444", "great@gmail.com"));
		lst.add(new MemberVO(30, "�������", "010-1234-5367", "asdasda@hanmail.com"));
		lst.add(new MemberVO(25, "���", "010-1234-5678", "asdasfg@nate.com"));
		lst.add(new MemberVO(40, "������", "010-4567-7788", "kimteahee@naver.com"));

		System.out.println("============��ȣ�� ������������ ����============");
		Collections.sort(lst, new CompareNumAsc());
		output(lst);

		
		System.out.println("============��ȣ�� ������������ ����============");
		Collections.sort(lst, new CompareNumDesc());
		output(lst);
		
		System.out.println("============�̸����� ������������ ����============");
		Collections.sort(lst, new CompareNumeAsc());
		output(lst);
	
		System.out.println("============�̸����� ������������ ����============");
		Collections.sort(lst, new CompareNumeDesc());
		output(lst);
	
	}
	public void output(List<MemberVO> lst) {
		for(MemberVO vo : lst) {
			vo.print();
		}
	}

	// ���ı����� Comparator interface�� ��ӹ��� compare() �޼ҵ带 �������̵��Ͽ� ���� �������� �����Ѵ�.
	
	// �̸��� ������������ ����
	class CompareNumeAsc implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			return v1.getName().compareTo(v2.getName());// ���, ����, 0

		}
	}
	
	class CompareNumeDesc implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			return v2.getName().compareTo(v1.getName());
		}
	}

	// ��ȣ�� ������������ ����
	class CompareNumAsc implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {

			// v1�� ������ : 1, v2�� ������ -1, v1,v2�� ������ : 0
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
