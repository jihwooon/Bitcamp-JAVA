package for_test;

class ForTest1 {
	public static void main(String[] args) {
		// �ݺ���
		// 1~10���� ����ϴ� ���α׷������
		/*
		 * for(int i = 1; i<=10; i++){ System.out.println(i); } for(int j=1;
		 * j<=100;j=j+1){//���ѷ��� System.out.println(j); }
		 */
		// 1~100���� ¦���� ���
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print("¦��=" + i);
			}
			for (int j = 2; j <= 100; j += 2) {// i=i+2
				System.out.print("j=" + j);
			}
			for (int y = 10; y >= 1; y--) {// i--, --i, i=i-1, i-=1
				System.out.println("y=" + y);

			}

		}

	}// pubilc end
}// class end

/*
 * 
 * 
 * for(�ʱⰪ : int i = 1;(���ǽ�)i<=10; ������ : i++) { i++. ++i, i=i+1, i+=1
 * System.out.println(i);
 * 
 * } ////// 1 2 3 4 5 6 7 8 9 10
 */