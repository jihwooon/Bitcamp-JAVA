import java.util.HashMap;

public class Login {

	private String userid = "admin";
	private String userpwd = "1234";

	public Login() {

	}

	public boolean empCheck(String userid, String userpwd) {

		if (this.userid.equals(userid) && this.userpwd.equals(userpwd)) {
			return true;// �α��� ����

		} else {
			return false;
		}
	}

	public static HashMap<String, EmployeeVO> SetEmp() {
		HashMap<String, EmployeeVO> hm = new HashMap<String, EmployeeVO>();
		hm.put("ȫ�浿", new EmployeeVO(200, "ȫ�浿", "010-7777-8888", "��ȹ��", "����"));
		hm.put("�̼���", new EmployeeVO(100, "�̼���", "010-6677-1234", "�λ��", "����"));
		hm.put("������", new EmployeeVO(300, "������", "010-9977-5678", "�ѹ���", "�븮"));
		hm.put("�念��", new EmployeeVO(400, "�念��", "010-2277-9101", "������", "���"));
		hm.put("������", new EmployeeVO(500, "������", "010-3377-7812", "��ȹ��", "�˹�"));
		return hm;
	}
}
