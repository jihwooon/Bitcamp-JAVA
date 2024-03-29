package java09_io;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarSwing_1 extends JFrame implements ActionListener  {
	//폰트 설정
	Font fnt = new Font("돋움체", Font.BOLD, 20);
	Calendar date = Calendar.getInstance();
	int year, month;
	String weekStr[] = {"일","월","화","수","목","금","토"};
	
	//패널 설정 -> 위쪽
	JPanel northPane = new JPanel();
		JButton prevMonth = new JButton("◀");
		JComboBox<Integer> yearCombo = new JComboBox<Integer>();
			DefaultComboBoxModel<Integer> yearModel = new DefaultComboBoxModel<Integer>();
		JLabel yearLb1 = new JLabel("년");
		JComboBox<Integer> monthCombo = new JComboBox<Integer>();
			DefaultComboBoxModel<Integer> monthModel = new DefaultComboBoxModel<Integer>();
		JLabel monthLb1 = new JLabel("월");
		JButton nextMonth = new JButton("▶");
	
		
		

	//Frame -> Center
	JPanel centerPane = new JPanel(new BorderLayout());
		JPanel titlePane = new JPanel(new GridLayout(1,7)); //일월화.....
		JPanel dayPane = new JPanel(new GridLayout(0,7));//1,2,3,4,5,..
		
		
		
	public CalendarSwing_1() {
		super("달력");
		//Frame -> North
		add(BorderLayout.NORTH, northPane);
			northPane.add(prevMonth);
			northPane.add(yearCombo);
			year = date.get(Calendar.YEAR);
				for(int y = year-50; y<year+100; y++) {
					yearModel.addElement(y);
						
			}
			yearCombo.setModel(yearModel);
			yearCombo.setSelectedItem(year);
			northPane.add(yearLb1);
				
				
			month = date.get(Calendar.MONTH);
			for(int d=1; d<=12; d++) {
				monthModel.addElement(d);
				
			}
			monthCombo.setModel(monthModel);
			monthCombo.setSelectedItem(month+1);
			northPane.add(monthCombo);
			
			northPane.add(monthLb1);
			northPane.add(nextMonth);
			
			
			northPane.setBackground(new Color(150,200,200));
			
			
			//오늘 날짜 출력
			add(centerPane);
				centerPane.add(BorderLayout.NORTH, titlePane);
				for(int i =0; i<weekStr.length; i++) {
					JLabel lbl = new JLabel(weekStr[i]);
					lbl.setFont(fnt);
					if(i==0) {
						lbl.setForeground(Color.red);
						
					}else if(i == 6) {
						lbl.setForeground(Color.blue);
						
					}
					titlePane.add(lbl);
				}
								
				centerPane.add("Center",dayPane);
				setDay();
								
		//창 만들기	
		
		
		//이벤트 등록
		prevMonth.addActionListener(this);
		yearCombo.addActionListener(this);
		monthCombo.addActionListener(this);
		nextMonth.addActionListener(this);
					
	}

	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		year = (int)yearCombo.getSelectedItem();
		month = (int)monthCombo.getSelectedItem();
		if(obj == yearCombo || obj==monthCombo) {
			getNewDate();
		
		}else if (obj == prevMonth) {//이전월
			clearEvent();
			if(month==0) {
				year--;
				month=11;
			}else {
				month--;
			}
			ButtDateSet();
			
		}else if(obj == nextMonth) {
			
			if(month==11) {
				year++; month=0;
			}else {
				month++;
			}
			ButtDateSet();
		}
	}

	public void ButtDateSet() {
		clearEvent();
		yearCombo.setSelectedItem(year);
		yearCombo.setSelectedItem(month+1);
		getNewDate();
		addEvent();
		
	}
	
	public void addEvent() {
		yearCombo.removeActionListener(this);
		monthCombo.removeActionListener(this);		
	}

	public void clearEvent() {
		//버튼에서 이벤트 발새시 Combox의 item 변경하면서 Combobox의 이벤트가 처리되므로 이벤트를 해체한다.
			yearCombo.removeActionListener(this);
			monthCombo.removeActionListener(this);		
	}
	
	public void getNewDate() {
		dayPane.setVisible(false);
		dayPane.removeAll();//날짜 지우기
		setDay();
		dayPane.setVisible(true);
	}
	
	public void setDay() {			
		//요일
		date.set(year,month, 1);
		int week = date.get(Calendar.DAY_OF_WEEK);
		
		//공백처리
		for(int space=1; space<week; space++) {
			JLabel lbl = new JLabel(" ");
			dayPane.add(lbl);
			
		}
	
		
		//날짜 추가
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1; i<=lastDay; i++) {
			JLabel lbl = new JLabel(String.valueOf(i), JLabel.CENTER);
			lbl.setFont(fnt);
			date.set(year, month, i);
			int w = date.get(Calendar.DAY_OF_WEEK);//출력하고 있는 날짜의 요일
				if(w == 1) lbl.setForeground(Color.red); 
				if(w == 7) lbl.setForeground(Color.blue);
				dayPane.add(lbl);
				
		}	
	}
	
	public static void main(String[] args) {
		new CalendarSwing_1();
		
	}

	
	public void start() {
		setSize(400,350);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
}
