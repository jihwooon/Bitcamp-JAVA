package java09_io;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataVO implements Serializable{
	private int num = 1234;
	private String name = "ȫ�浿";
	private CalendarSwing_1 calendarSwing = new CalendarSwing_1();
	private Calendar calendar = Calendar.getInstance();

	public DataVO() {

	}
	///////////////////////////////////////////////////////////////////////////////
	
	public void calendarOutput() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = f.format(date);
		
	}
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	
	}

	public void setName(String name) {
		this.name = name;

	}

	public CalendarSwing_1 getCalendarSwing() {
		return calendarSwing;
	
	}

	public void setCalendarSwing(CalendarSwing_1 calendarSwing) {
		this.calendarSwing = calendarSwing;
	
	}

	public Calendar getCalendar() {
		return calendar;
	
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	
	}
}
