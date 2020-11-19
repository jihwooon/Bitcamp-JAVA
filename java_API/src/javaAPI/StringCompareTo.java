package javaAPI;

public class StringCompareTo {

	public StringCompareTo() {
		System.out.println("생성자....");

	}

	public void start() {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		// compareTo() : 문자열의 크기 비교하기
		String str1 = new String("Best Java"); // 74
		String str2 = 			"Best Design"; // 68

		// 음수=오른쪽의변수가 클때 	0=같다, 양수 = 왼쪽에 있는 변수가 클때
		int result1 = str1.compareTo(str2);
		int result2 = str2.compareTo(str1);

		if(result1>0) {
			System.out.println("str1이 str2보다 크다");
		}else if(result1<0){
			System.out.println("str2가 st1보다 크다.");
		}else {
			System.out.println("str1과 str2는 같다");
		}
		
		System.out.println("result1=" + result1);// str1 - str2
		System.out.println("resutl2=" + result2);// str2 - str1

	}

	public static void main(String[] args) {
		new StringCompareTo().start();

	}
}
