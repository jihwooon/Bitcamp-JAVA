package liberiy_project;

public class LoginMemberVO {

	private String ID;
	private int PW;
	private String name;
	private String phoneNum;

	public LoginMemberVO(String ID, int PW, String name, String phoneNum) {
		this.ID = ID;
		this.PW = PW;
		this.name = name;
		this.phoneNum = phoneNum;

	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getPW() {
		return PW;
	}

	public void setPW(int pW) {
		PW = pW;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s", this.ID, this.PW, this.name, this.phoneNum);

	}

}
