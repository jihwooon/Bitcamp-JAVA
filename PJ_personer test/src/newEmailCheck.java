import java.util.Scanner;

public class newEmailCheck {

	int email;

	public newEmailCheck() {
	}
	//�̸��� ���
	public int inputemail(String msg) {

		Scanner scan = new Scanner(System.in);
		System.out.print(msg + "=");
		int email = scan.nextInt();
		return email;

	}
	//�̸��� 
	public void emailenter(int email) {
				
	}//�̸��� �Է�
}
