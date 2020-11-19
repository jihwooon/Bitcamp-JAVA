package liberiy_project;

//관리자 접근

public class Utils {
	private static Utils utils = new Utils();
	private final String id = "admin";
	private final String pw = "admin123";

	private LoginMemberVO user;

	private Utils() {

	}

	static Utils getInstance() {

		if (utils == null) {
			utils = new Utils();
		}
		return Utils.utils;
	}

	public String getid() {
		return id;
	}

	public void setCurrenUser(LoginMemberVO user) {
		this.user = user;
	}

	public LoginMemberVO setCurrenUser() {
		return user;

	}

}
