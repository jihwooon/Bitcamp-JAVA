import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoCollection {

	Scanner scan = new Scanner(System.in); // �ʵ� ����
	Random ran = new Random();
	int lottoNum[] = new int[7];
	int Gamecount;

	public LottoCollection() { // ������
	}

	public void getGamecount() { // �޼���
		System.out.print("���Ӽ�=");
		Gamecount = scan.nextInt();
	}

	public String getEndQna() {

		System.out.print("����ϰڽ��ϱ�?(y:��, N:�ƴϿ�)=");
		return scan.nextLine();

	}

	public void creatLotto() {
		lottoNum = new int[7];
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = ran.nextInt(45) + 1;
			i = lottoCheck(i);
		}
	}

	public int lottoCheck(int i) {
		for (int j = 0; j < i; j++) {
			if (lottoNum[j] == lottoNum[i]) {
				return --i;
			}
		}
		return i;
	}

	public void lottoPrint(int cnt) {

		Arrays.sort(lottoNum, 0, 6);
		System.out.println(cnt + "����=");

		System.out.println(Arrays.toString(Arrays.copyOfRange(lottoNum, 0, 6)));
		System.out.println(",bonus=" + lottoNum[6]);
	}

	public void lottoCreanteStart() {
		a: do {
			
			getGamecount();
			for (int i = 1; i <= Gamecount; i++) {
				creatLotto();
				lottoPrint(i);
			}
			scan.nextLine();
		 {
			do {
				String qna = getEndQna();
				if (qna.equalsIgnoreCase("Y")) {
					break;

				} else if (qna.equalsIgnoreCase("Y")) {
					break a;
				}
			} while (true);
		}
		} while (true);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
