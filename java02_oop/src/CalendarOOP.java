import java.util.Calendar;
import java.util.Scanner;

public class CalendarOOP {
	Calendar date = Calendar.getInstance();

	public CalendarOOP() {
	}

	// 입력 - 콘솔에서 정수입력
	public int getInt(String msg) {// 지역변수
		Scanner scan = new Scanner(System.in);
		System.out.print(msg + "->");
		return scan.nextInt();

	}

	// 요일 = 입력받은 년, 월,1일이 무슨 요일이지 구한다.
	public int getweek(int year, int month) {
		Calendar date = Calendar.getInstance();// 현재날짜
		date.set(year, month, 1);// 년,월,1
		return date.get(Calendar.DAY_OF_WEEK);

	}

	// 제목
	public void titlePrint(int week, int day) {
		String weekStr[] = { "일", "월", "화", "수", "금", "토" };
		for (String w : weekStr) {
			System.out.print(w + "\t");
		}
		System.out.println();
		spacePrint(week,day);
	}

	// 공백
	public void spacePrint(int week, int day) {
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		dayPrint(day ,week);
		//////
	}

	public void dayPrint(int day, int week) {
		for (int d = 1; d <= day; d++) {
			System.out.print(d + "\t");
			if ((week - 1 + d) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	// 날짜
	public void start() { //출력 정보
		int y = getInt("년도="); //2020년
		int m = getInt("월");	//8월
		int w = getweek(y,m);	
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);//마지막날구하기
		System.out.println("요일="+w);
		System.out.println("마지막날="+lastDay);
//		titlePrint();
//		spacePrint(w);
//		dayPrint(lastDay,w);
		titlePrint(w, lastDay);
	}
}