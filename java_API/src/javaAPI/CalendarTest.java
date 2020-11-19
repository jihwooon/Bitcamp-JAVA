
package javaAPI;

import java.util.Calendar;

class CalendarTest {
	public static void main(String[] args) {
		// Calendar class �� ���� �ý��� ��¥, �ð��� ���õ� ��� ������ ó���� �� �ִ�.
		// ��ü (new)

		// ������ 2020-07-16 (��) 03:48 PM
		Calendar now = Calendar.getInstance();

		// ��¥���� : ������� �ѹ��� �����ϱ�
		now.set(2022, 7, 16);

		// ���ϴ� �⵵, ��, ��, ��,��, �ʸ� �����ϱ�
		now.set(Calendar.YEAR, 2019);

		int year = now.get(Calendar.YEAR); // �⵵
		int month = now.get(Calendar.MONTH) + 1; // ��, 0->1��
		int day = now.get(Calendar.DAY_OF_MONTH); // ��
		int week = now.get(Calendar.DAY_OF_WEEK); // ���� 1 > ��
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
			weekStr = "�Ͽ���";
			break;
		case 2:
			weekStr = "������";
			break;
		case 3:
			weekStr = "ȭ����";
			break;
		case 4:
			weekStr = "������";
			break;
		case 5:
			weekStr = "�����";
			break;
		case 6:
			weekStr = "�ݿ���";
			break;
		case 7:
			weekStr = "�����";
			break;
		}
		String amStr = "";
		if (amPm == 0) {
			amStr = "����";
		} else {
			amStr = "����";
		}

		System.out.printf("������ %d-%s-%d(%s) %d:%d %s\n", year, monthStr, day, weekStr, hour, minute, amStr);
		// System.out.println(now);
	}

}
