package for_test;

class ForTest1 {
	public static void main(String[] args) {
		// 반복문
		// 1~10까지 출력하는 프로그램만들기
		/*
		 * for(int i = 1; i<=10; i++){ System.out.println(i); } for(int j=1;
		 * j<=100;j=j+1){//무한루프 System.out.println(j); }
		 */
		// 1~100까지 짝수만 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print("짝수=" + i);
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
 * for(초기값 : int i = 1;(조건식)i<=10; 증가값 : i++) { i++. ++i, i=i+1, i+=1
 * System.out.println(i);
 * 
 * } ////// 1 2 3 4 5 6 7 8 9 10
 */