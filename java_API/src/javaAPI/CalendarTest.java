
package javaAPI;

import java.util.Calendar;

class CalendarTest {
	public static void main(String[] args) {
		// Calendar class 는 현재 시스템 날짜, 시간에 관련된 모든 정보를 처리할 수 있다.
		// 객체 (new)

		// 오늘은 2020-07-16 (목) 03:48 PM
		Calendar now = Calendar.getInstance();

		// 날짜변경 : 년월일을 한번에 변경하기
		now.set(2022, 7, 16);

		// 원하는 년도, 월, 일, 시,분, 초를 변경하기
		now.set(Calendar.YEAR, 2019);

		int year = now.get(Calendar.YEAR); // 년도
		int month = now.get(Calendar.MONTH) + 1; // 월, 0->1월
		int day = now.get(Calendar.DAY_OF_MONTH); // 일
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일 1 > 일
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int amPm = now.get(Calendar.AM);

		String monthStr = "";
		if (month < 10) {
			monthStr = "0" + month;
		} else {
			monthStr = month + "";
		}

		String weekStr = "";
		switch (week) {
		case 1:
			weekStr = "일요일";
			break;
		case 2:
			weekStr = "월요일";
			break;
		case 3:
			weekStr = "화요일";
			break;
		case 4:
			weekStr = "수요일";
			break;
		case 5:
			weekStr = "목요일";
			break;
		case 6:
			weekStr = "금요일";
			break;
		case 7:
			weekStr = "토요일";
			break;
		}
		String amStr = "";
		if (amPm == 0) {
			amStr = "오전";
		} else {
			amStr = "오후";
		}

		System.out.printf("오늘은 %d-%s-%d(%s) %d:%d %s\n", year, monthStr, day, weekStr, hour, minute, amStr);
		// System.out.println(now);
	}

}
