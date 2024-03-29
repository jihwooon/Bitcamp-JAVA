package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ActionEventTest extends JFrame implements ActionListener {

	JPanel pane = new JPanel();
	JTextField tf = new JTextField(10);
	JButton btn1 = new JButton("구구단");
	JButton btn2 = new JButton("구구단(전체)");

	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);

	public ActionEventTest() {

		pane.add(tf);
		pane.add(btn1);
		pane.add(btn2);

		// "North"
		add(BorderLayout.NORTH, pane);
		add(BorderLayout.CENTER, sp);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		tf.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {//JButton, JTextField
		//이벤트가 발생한 컨퍼넌트 알아내기
		Object obj = ae.getSource();//이벤트가 발생한 객체를 얻어온다.
		//어떤 클래스로 생성된 객체인지 확인 한다.
		if(obj instanceof JButton) { //JButton
			JButton btn = (JButton)obj;
			if(btn.getText().equals("구구단")) {
				allDan();//구구단
				oneDan();
			}else if(btn.getText().equals("구구단(전체)")) {
				//구구단 전체
			}
		}else if(obj instanceof JTextField) {//JTextField
			oneDan();//구구단(1단)
		}
	}
	public void oneDan() {
		ta.setText("");
		int dan = Integer.parseInt(tf.getText());
		for(int i=2; i<=9; i++) {
			ta.append(dan + "*" + i + "=" + dan*i+"\n");
		}
	}
	public void allDan() {
		ta.setText("");
		for(int dan = 2; dan <=9; dan++) {
			for(int i =2; i<=9; i++) {
				ta.append(dan + "+" + i+"="+dan*i+"\n");
					
			}
		}
 	}
	
	
	public static void main(String[] args) {
		new ActionEventTest();

	}// 메인 메소드 end
}// class end
