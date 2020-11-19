import java.util.Scanner;

public class newEmailCheck {

	int email;

	public newEmailCheck() {
	}
	//이메일 출력
	public int inputemail(String msg) {

		Scanner scan = new Scanner(System.in);
		System.out.print(msg + "=");
		int email = scan.nextInt();
		return email;

	}
	//이메일 
	public void emailenter(int email) {
				
	}//이메일 입력
}
