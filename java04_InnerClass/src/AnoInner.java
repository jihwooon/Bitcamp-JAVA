
public class AnoInner {

	int num = 2222;
	String addr = "서울시 서대문구";

	public AnoInner() {
	}

	public void Start() {
		// 익명의 내부클래스 생성
		new Information() {
			public void print() {
				System.out.println("번호=" + num);
				System.out.println("이름=" + name);
				System.out.println("연락처=" + tel);
			}

			public void output() {
				System.out.println("num=" + num);
				System.out.println("addr=" + addr);
			}
		}.output();
	}

	public static void main(String[] args) {
		AnoInner ai = new AnoInner();
		ai.Start();

	}

}
