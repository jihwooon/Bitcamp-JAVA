package liberiy_project;

import java.util.HashMap;
import java.util.Map;

public class LoginMemberHashMap {

	private String userid = "wlghks";
	private String userpw = "1234";

	public LoginMemberHashMap() {
	}

	public boolean logincheck(String userid, String userpw) {

		if (this.userid.equals(userid) && this.userpw.equals(userpw)) {
			return true;
		} else {
			return false;
		}

	}

	public static HashMap<String, LoginMemberVO> LoginEmp() {
		HashMap<String, LoginMemberVO> mb = new HashMap<String, LoginMemberVO>();
		mb.put("�念��", new LoginMemberVO("seoul", 1234, "�念��", "010-1234-7894"));
		mb.put("�̼���", new LoginMemberVO("tokyo", 3333, "�̼���", "010-4564-7894"));
		mb.put("���߱�", new LoginMemberVO("hanoi", 4444, "���߱�", "010-7777-7894"));
		mb.put("�ֿ�ö", new LoginMemberVO("english", 5555, "�ֿ�ö", "010-8888-7894"));
		mb.put("�ڱ���", new LoginMemberVO("qwert", 6666, "�ڱ���", "010-9999-7894"));
		return mb;

	}
}