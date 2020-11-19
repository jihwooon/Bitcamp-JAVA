
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {
		// List 인터페이스를 상속받은 컬렉션은 입력순서를 유지하고 index를 가지고 있다.

	}

	public Vector getDate() {
		int num = 500;
		String name = "홍길동";
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

	// 학생정보
	public Vector getMember() {
		Vector v = new Vector();
		MemberVO vo = new MemberVO();
		vo.setNum(100);
		vo.setName("홍길동");
		vo.setTel("010-1234-4567");
		vo.setEmail("aaaaa@nate.com");
		v.add(vo);

		MemberVO vo2 = new MemberVO(200, "이순신", "010-1111-1111", "bbbb@naver.com");
		v.add(vo2);

		v.add(new MemberVO(300, "세종대왕", "010-1234-5678", "cccc@hanmail.net"));
		v.add(new MemberVO(400, "안철수", "010-2354-5789", "anchosu@ahnlap.net"));
		v.add(new MemberVO(500, "나카무라", "010-5555-7897", "nakamura@hiomedeto.net"));

		return v;

	}

}
