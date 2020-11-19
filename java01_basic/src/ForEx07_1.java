import java.util.Scanner;

class ForEx07_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("È¦¼ö ÀÔ·Â =");
		int max = scan.nextInt();

		if (max % 2 == 0) {
			max++;
		}
		char txt = 'A';

		int step = 2;
		for (int i = 0; i < max; i += step) {

			for (int s = 0; s <= (max - i) / 2; s++) {//
				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {// *

				System.out.print(txt++);
				if (txt > 'Z')
					txt = 'A';
			}
			if (max <= i) {
				step = -2;
			}
			System.out.println();

		}
	}
}
/*
 * ½ÇÇà È¦¼öÀÔ·Â = 11 if(%3==0)
 * 
 * A BCD EFGHI
 * 
 * 
 */