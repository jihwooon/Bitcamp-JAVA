
public class UserVO {

	private String userNo;
	private String userId;
	private String password;
	private String name;
	private String phone;

	public UserVO(String userNo, String userId, String password, String name, String phone) {

		this.userNo = userNo;
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.phone = phone;

	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("%s/%s/%s/%s/%s", this.userNo, this.name, this.userId, this.password, this.phone);
	}

}
