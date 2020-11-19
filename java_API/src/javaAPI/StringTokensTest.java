package javaAPI;

import java.util.StringTokenizer;

public class StringTokensTest {

	public StringTokensTest() {
		start();

	}

	public void start() {
		String msg = "서울시,,,,마포구,,,,백범로,,,거구빌딩,,,,3층";
		StringTokenizer st = new StringTokenizer(msg, ":,:");

		int cnt = st.countTokens();
		System.out.println("cnt=" + cnt);
		while (st.hasMoreTokens()) {// 남은 토큰이 있는지 확인
			String token = st.nextToken();
			System.out.println("token=" + token);

		}
	}

	public static void main(String args[]) {
		new StringTokensTest();

	}
}
