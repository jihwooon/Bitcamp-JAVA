
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {
		// List �������̽��� ��ӹ��� �÷����� �Է¼����� �����ϰ� index�� ������ �ִ�.

	}

	public Vector getDate() {
		int num = 500;
		String name = "ȫ�浿";
		Calendar now = Calendar.getInstance();
		now.set(2020, 10, 10);
		Random ran = new Random();
		double ave = 80.5;

		Vector vector = new Vector();
		vector.add(num); // Integer 0
		vector.addElement(name);// 1
		vector.add(now);// 2
		vector.add(ran);// 4
		vector.add(1, ave);// 1

		return vector;

	}

	// �л�����
	public Vector getMember() {
		Vector v = new Vector();
		MemberVO vo = new MemberVO();
		vo.setNum(100);
		vo.setName("ȫ�浿");
		vo.setTel("010-1234-4567");
		vo.setEmail("aaaaa@nate.com");
		v.add(vo);

		MemberVO vo2 = new MemberVO(200, "�̼���", "010-1111-1111", "bbbb@naver.com");
		v.add(vo2);

		v.add(new MemberVO(300, "�������", "010-1234-5678", "cccc@hanmail.net"));
		v.add(new MemberVO(400, "��ö��", "010-2354-5789", "anchosu@ahnlap.net"));
		v.add(new MemberVO(500, "��ī����", "010-5555-7897", "nakamura@hiomedeto.net"));

		return v;

	}

}
