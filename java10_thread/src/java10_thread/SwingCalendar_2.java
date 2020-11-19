package java10_thread;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingCalendar_2 extends JPanel implements ActionListener {

	// Nouth

	JPanel topPane = new JPanel();
		JButton prevBtn = new JButton("◀");
		JButton nextBtn = new JButton("▶");
		JButton uderBtn = new JButton("▼");
		JButton upBtn = new JButton("▲");
	
		
		JLabel yearlabel = new JLabel("년");
		JLabel monthlabel = new JLabel("월");

		
		
		//이벤트 박스
		JComboBox<Integer> yearCombo = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> yearModel = new DefaultComboBoxModel<Integer>();
		JComboBox<Integer> monthCombo = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> monthModel = new DefaultComboBoxModel<Integer>();

		
	
		
	// center
	JPanel centerPane = new JPanel(new BorderLayout(0,7));
	JPanel titlePane = new JPanel(new GridLayout(1, 7));
		String titlestr[] = { "일", "월", "화", "수", "목", "금", "토"};
	
	JPanel datePane = new JPanel(new GridLayout(0, 7));
	Calendar now;
	int year, month, date;


	
	
	// 캘린더 생성자
	public SwingCalendar_2() {
		

			now = Calendar.getInstance();
			year = now.get(Calendar.YEAR);
			month = now.get(Calendar.MONTH) + 1;
			date = now.get(Calendar.DATE);

			
		//topPane 년도 출력
			topPane.add(prevBtn);

			for (int i = year - 100; i <= year + 50; i++) {
				yearModel.addElement(i);
		}
			yearCombo.setModel(yearModel);
			yearCombo.setSelectedItem(year);
			topPane.add(yearCombo);
			topPane.add(yearlabel);
		
			//topPane 월 출력	
			
			for(int i =1; i<=12; i++) {
				monthModel.addElement(i);
				
		}
			monthCombo.setModel(monthModel);
			monthCombo.setSelectedItem(month); 
			topPane.add(monthCombo);
			topPane.add(monthlabel);
			topPane.add(nextBtn);
		
			
			
			
		//Center 출력
			//일요일, 토요일 색 주입
			
			titlePane.setBackground(Color.white);
				for(int i=0; i<titlestr.length; i++) {
					JLabel b = new JLabel(titlestr[i], JLabel.CENTER);
				if(i == 0) {
					b.setForeground(Color.red);
				}else if(i == 6) {
					b.setForeground(Color.blue);
				}
				titlePane.add(b);
			}
			centerPane.add(titlePane, "North");
			
		//날짜 출력
			
			calendarprint(year, month);
			centerPane.add(datePane,"Center");
			
			add(centerPane,"Center");
			
			
		//topPane 컬러 주입	
			topPane.setBackground(new Color(100, 200, 200));
			add(topPane, "North");
			
		prevBtn.addActionListener(this);
		nextBtn.addActionListener(this);
		yearCombo.addActionListener(this);
		monthCombo.addActionListener(this);

	//Center 출력
	}
	
	
	
	//날짜 버튼 action

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		if(obj instanceof JButton) {
			JButton eventBtn = (JButton)obj;
			int yy = (Integer)yearCombo.getSelectedItem();
			int mm = (Integer)monthCombo.getSelectedItem();
				if(eventBtn.equals(prevBtn)) {//앞
					if(mm==1) {
						yy--; mm=12;
					}else {
						mm--;
					}
		}else if(eventBtn.equals(nextBtn)) {
				if(mm==12) {
					yy++; mm=1;
				}else {
					mm++;
				}
			}
				yearCombo.setSelectedItem(yy);
				monthCombo.setSelectedItem(mm);
		}else if(obj instanceof JComboBox) {
			createDayStart();
		}
	}
	
	
	//출력 표시
	public void createDayStart() {
		datePane.setVisible(false); // 패널 숨기기
		datePane.removeAll();
		calendarprint((Integer)yearCombo.getSelectedItem(), (Integer)monthCombo.getSelectedItem());
		datePane.setVisible(true);
		
	}
	
	// 달력 생성
	public void calendarprint(int y, int m) {
		Calendar cal = Calendar.getInstance();
		cal.set(y, m - 1, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);// 1일에 대한 요일 일요일 :0
		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 그 달의 마지막 날
		for (int i = 1; i < week; i++) { // 날짜 출력 하기전 공백
			datePane.add(new JLabel(" "));
		} // 월
		for (int i = 1; i <= lastDate; i++) {
			JLabel b = new JLabel(String.valueOf(i),JLabel.CENTER);
			cal.set(y, m-1,i);
			int outWeek = cal.get(Calendar.DAY_OF_WEEK);
			
		if(outWeek ==1) {
			b.setForeground(Color.red);
		}else if(outWeek==7) {
			b.setForeground(Color.blue);
		}
			datePane.add(b);
			
		}
	}
	
	public static void main(String[] args) {
		new SwingCalendar_2();
	}
	
}


