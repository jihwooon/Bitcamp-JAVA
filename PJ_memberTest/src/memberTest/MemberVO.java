package memberTest;

public class MemberVO {

	private int num; // 번호
	private String username;// 이름
	private String tel;// 전화번호
	private String email;// 이메일
	private String addr;// 주소
	private String writedate;// 등록일

	public MemberVO () {}
	
	
	public MemberVO(int num, String username, String tel, String email, String addr) {
		this.num = num;
		this.username = username;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
	}
		
	public MemberVO(int num, String username, String tel, String email, String addr,String writedate) {
		this(num, username, tel, email, addr);
		this.writedate = writedate;		
	}
	
	
	public void print() {
		System.out.printf("%d, %s, %s, %s, %s\n", num, username, tel, email, addr, writedate);
		
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getWritedate() {
		return writedate;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}

}
