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

public class CalendarSwing_t2 extends JPanel implements ActionListener {
	Font fnt = new Font("굴림", Font.BOLD, 20);
	Calendar date = Calendar.getInstance();
	int year, month;
	String weekStr[] = {"일", "월", "화", "수", "목", "금", "토"};
	
	//Frame -> North
	JPanel northPane = new JPanel();
		JButton preMonth = new JButton("◀");
		JComboBox<Integer> yearCombo = new JComboBox<Integer>();
			DefaultComboBoxModel<Integer> yearModel = new DefaultComboBoxModel<Integer>();
		JLabel yearLbl = new JLabel("년 ");
		JComboBox<Integer> monthCombo = new JComboBox<Integer>();
			DefaultComboBoxModel<Integer> monthModel = new DefaultComboBoxModel<Integer>();
		JLabel monthLbl = new JLabel("월 ");
		JButton nextMonth = new JButton("▶");
		
	//Frame -> Center
	JPanel centerPane = new JPanel(new BorderLayout()); 
		JPanel titlePane = new JPanel(new GridLayout(1,7)); //일, 월, 화, 수, 목, 금, 토
		JPanel dayPane = new JPanel(new GridLayout(0,7)); // 날짜 
		
	public CalendarSwing_t2() {
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, northPane);
			northPane.add(preMonth);
			northPane.add(yearCombo);
			year = date.get(Calendar.YEAR); //현재년도
			for(int y=year-100;y<year+20;y++) {
				yearModel.addElement(y);
			}
			yearCombo.setModel(yearModel);
			yearCombo.setSelectedItem(year);
			northPane.add(yearLbl);
			
			month = date.get(Calendar.MONTH); // 7 (지금 8월이니까)
			for(int m=1; m<=12; m++) {
				monthModel.addElement(m);
			}
			monthCombo.setModel(monthModel);
			monthCombo.setSelectedItem(month+1);
			northPane.add(monthCombo);
			northPane.add(monthLbl);
			northPane.add(nextMonth);
			
			//배경색칠하기
			northPane.setBackground(new Color(150, 200, 200));
			
			//오늘날짜출력
			add(centerPane);
				centerPane.add(BorderLayout.NORTH, titlePane);
				for(int i=0;i<weekStr.length;i++) {
					JLabel lbl = new JLabel(weekStr[i], JLabel.CENTER);
					lbl.setFont(fnt);
					
					if(i==0) {
						lbl.setForeground(Color.RED);
					}else if(i==6){
						lbl.setForeground(Color.BLUE);
					}
					titlePane.add(lbl);
				}
				centerPane.add("Center", dayPane);
				setDay();
		
		//이벤트 등록 
		preMonth.addActionListener(this);
		yearCombo.addActionListener(this);
		monthCombo.addActionListener(this);
		nextMonth.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		year = (int)yearCombo.getSelectedItem();
		month = (int)monthCombo.getSelectedItem() -1;
		if(obj == yearCombo || obj==monthCombo) {
			getNewDate();
		}else if(obj == preMonth) { //이전월
			
			if(month==0) {
				year--;
				month=11;
			}else {
				month--;
			}
			buttonDateSet();
		}else if(obj== nextMonth) {
			clearEvent();
			if(month==11) {
				year++;
				month=0;
			}else {
				month++;
			}
			buttonDateSet();
		}
	}
		
	public void buttonDateSet() {
		clearEvent(); //버튼 이벤트를 위해 콤보박스 이벤트 삭제
		yearCombo.setSelectedItem(year);
		monthCombo.setSelectedItem(month+1);
		getNewDate();
		addEvent(); //콤보박스 이벤트를 다시 추가
	}
	
	public void addEvent(){
		yearCombo.addActionListener(this);
		monthCombo.addActionListener(this);
		}
	
	
	public void clearEvent() {
		//버튼에서 이벤트 발생시 ComboBox의 아이템을 변경하면서 ComboBox의 이벤트가 처리되므로, 이벤트를 해제한다. 
		yearCombo.removeActionListener(this);
		monthCombo.removeActionListener(this);
	}
	
	public void getNewDate() {
		dayPane.setVisible(false);
		dayPane.removeAll();//날짜지우기 
		setDay();
		dayPane.setVisible(true);
	}
	
	public void setDay() {
		//요일 구하기 
		date.set(year, month, 1);
		int week = date.get(Calendar.DAY_OF_WEEK);
		
		//공백처리
		for(int space=1; space <week; space++) {
			JLabel lbl = new JLabel("");
			dayPane.add(lbl);
		} 
		
		//날짜추가
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i =1; i<= lastDay; i++) {
			JLabel lbl = new JLabel(String.valueOf(i), JLabel.CENTER);
			lbl.setFont(fnt);
			date.set(year, month, i);
			int w= date.get(Calendar.DAY_OF_WEEK); //출려하고있는 날짜의 요일
			if(w==1) lbl.setForeground(Color.red);
			if(w==7) lbl.setForeground(Color.BLUE);
			dayPane.add(lbl);
		}
	}	
}
