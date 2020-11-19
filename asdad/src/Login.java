import java.util.HashMap;

public class Login {

	private String userid = "admin";
	private String userpwd = "1234";

	public Login() {

	}

	public boolean empCheck(String userid, String userpwd) {

		if (this.userid.equals(userid) && this.userpwd.equals(userpwd)) {
			return true;// 로그인 성공

		} else {
			return false;
		}
	}

	public static HashMap<String, EmployeeVO> SetEmp() {
		HashMap<String, EmployeeVO> hm = new HashMap<String, EmployeeVO>();
		hm.put("홍길동", new EmployeeVO(200, "홍길동", "010-7777-8888", "기획부", "과장"));
		hm.put("이순신", new EmployeeVO(100, "이순신", "010-6677-1234", "인사부", "차장"));
		hm.put("광계통", new EmployeeVO(300, "광계통", "010-9977-5678", "총무부", "대리"));
		hm.put("장영실", new EmployeeVO(400, "장영실", "010-2277-9101", "영업부", "사원"));
		hm.put("감강찬", new EmployeeVO(500, "감강찬", "010-3377-7812", "기획부", "알바"));
		return hm;
	}
}
