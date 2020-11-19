import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	int lottoNum[] = new int[7];
	int Gamecount;

	public Lotto() {
	} // 생성자

	// 게임수
	public void getGamecount() {
		System.out.print("게임수=");
		Gamecount = scan.nextInt();
	}

	// 종료여부확인

	public String getEndQna() {

		System.out.print("계속하겠습니까?(y:예, N:아니오)=");
		return scan.nextLine();

	}

	// 번호 + 보너스번호를 생성하여 배열에 추가
	public void createLotto() {
		lottoNum = new int[7];// 새로운 로또번호 생선전 이전번호를 지운다.
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = ran.nextInt(45) + 1;
			i = lottoCheck(i);// 중복검사
			// 중복검사

		}
	}

	// 증복검사
	public int lottoCheck(int i) {
		for (int j = 0; j < i; j++) {
			if (lottoNum[j] == lottoNum[i]) {
				return --i;
			}
		}
		// 출력
		return i;
	}

	public void lottoPrint(int cnt) {
		// 정렬하기 - 보너스를 제외한 정렬

		Arrays.sort(lottoNum, 0, 6);
		System.out.println(cnt + "게임=");

		System.out.print(Arrays.toString(Arrays.copyOfRange(lottoNum, 0, 6)));
		System.out.print(",bonus=" + lottoNum[6]);
	}

	public void lottoCreanteStart() {// 라벨
		a: do {
			getGamecount();
			for (int i = 1; i <= Gamecount; i++) {
				createLotto();
				lottoPrint(i);// 출력

			}
			// 계속여부 확인 "Y", "N", 그외 다시질문...
			scan.nextLine();
			do {
				String qna = getEndQna();
				if (qna.equalsIgnoreCase("Y")) {
					break;
				} else if (qna.equalsIgnoreCase("Y")) {
					break a;
				}

			} while (true);
		} while (true);
		System.out.println("프로그램이 종료되었습니다.");

	}
}
