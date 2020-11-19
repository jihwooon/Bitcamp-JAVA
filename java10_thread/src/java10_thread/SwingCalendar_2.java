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
		JButton prevBtn = new JButton("��");
		JButton nextBtn = new JButton("��");
		JButton uderBtn = new JButton("��");
		JButton upBtn = new JButton("��");
	
		
		JLabel yearlabel = new JLabel("��");
		JLabel monthlabel = new JLabel("��");

		
		
		//�̺�Ʈ �ڽ�
		JComboBox<Integer> yearCombo = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> yearModel = new DefaultComboBoxModel<Integer>();
		JComboBox<Integer> monthCombo = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> monthModel = new DefaultComboBoxModel<Integer>();

		
	
		
	// center
	JPanel centerPane = new JPanel(new BorderLayout(0,7));
	JPanel titlePane = new JPanel(new GridLayout(1, 7));
		String titlestr[] = { "��", "��", "ȭ", "��", "��", "��", "��"};
	
	JPanel datePane = new JPanel(new GridLayout(0, 7));
	Calendar now;
	int year, month, date;


	
	
	// Ķ���� ������
	public SwingCalendar_2() {
		

			now = Calendar.getInstance();
			year = now.get(Calendar.YEAR);
			month = now.get(Calendar.MONTH) + 1;
			date = now.get(Calendar.DATE);

			
		//topPane �⵵ ���
			topPane.add(prevBtn);

			for (int i = year - 100; i <= year + 50; i++) {
				yearModel.addElement(i);
		}
			yearCombo.setModel(yearModel);
			yearCombo.setSelectedItem(year);
			topPane.add(yearCombo);
			topPane.add(yearlabel);
		
			//topPane �� ���	
			
			for(int i =1; i<=12; i++) {
				monthModel.addElement(i);
				
		}
			monthCombo.setModel(monthModel);
			monthCombo.setSelectedItem(month); 
			topPane.add(monthCombo);
			topPane.add(monthlabel);
			topPane.add(nextBtn);
		
			
			
			
		//Center ���
			//�Ͽ���, ����� �� ����
			
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
			
		//��¥ ���
			
			calendarprint(year, month);
			centerPane.add(datePane,"Center");
			
			add(centerPane,"Center");
			
			
		//topPane �÷� ����	
			topPane.setBackground(new Color(100, 200, 200));
			add(topPane, "North");
			
		prevBtn.addActionListener(this);
		nextBtn.addActionListener(this);
		yearCombo.addActionListener(this);
		monthCombo.addActionListener(this);

	//Center ���
	}
	
	
	
	//��¥ ��ư action

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		if(obj instanceof JButton) {
			JButton eventBtn = (JButton)obj;
			int yy = (Integer)yearCombo.getSelectedItem();
			int mm = (Integer)monthCombo.getSelectedItem();
				if(eventBtn.equals(prevBtn)) {//��
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
	
	
	//��� ǥ��
	public void createDayStart() {
		datePane.setVisible(false); // �г� �����
		datePane.removeAll();
		calendarprint((Integer)yearCombo.getSelectedItem(), (Integer)monthCombo.getSelectedItem());
		datePane.setVisible(true);
		
	}
	
	// �޷� ����
	public void calendarprint(int y, int m) {
		Calendar cal = Calendar.getInstance();
		cal.set(y, m - 1, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);// 1�Ͽ� ���� ���� �Ͽ��� :0
		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �� ���� ������ ��
		for (int i = 1; i < week; i++) { // ��¥ ��� �ϱ��� ����
			datePane.add(new JLabel(" "));
		} // ��
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


