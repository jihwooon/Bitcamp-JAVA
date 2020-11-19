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
		mb.put("장영실", new LoginMemberVO("seoul", 1234, "장영실", "010-1234-7894"));
		mb.put("이순신", new LoginMemberVO("tokyo", 3333, "이순신", "010-4564-7894"));
		mb.put("안중근", new LoginMemberVO("hanoi", 4444, "안중근", "010-7777-7894"));
		mb.put("최영철", new LoginMemberVO("english", 5555, "최영철", "010-8888-7894"));
		mb.put("박광현", new LoginMemberVO("qwert", 6666, "박광현", "010-9999-7894"));
		return mb;

	}
}