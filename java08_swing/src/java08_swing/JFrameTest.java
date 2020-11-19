package java08_swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest extends JFrame {

	JButton btn1 = new JButton("1111");
	JButton btn2 = new JButton("2222");
	JButton btn3 = new JButton("3333");
	JButton btn4 = new JButton("4444");
	JButton btn5 = new JButton("5555");

	JPanel pane = new JPanel();
	JButton btn6 = new JButton("6666");
	JButton btn7 = new JButton("7777");
	JButton btn8 = new JButton("8888");

	public JFrameTest() {
		// 각 컨테이너 마다 기본 레이아웃이 있다.
		// JFrame, JDailog : BorderLayout
		// JPanel : FlowLayout
		// GridLayout, CardLayout, GridbagLayout
		// BorderLayout : 동,서,남,북, 가운데 5구역으로 나눠짐.
		// FlowLayout : 추가하는 컴퍼넌트 순서대로 배치
		// GridLayout : 바둑판식으로 가로세로 행열크기가 같다.

		add(btn1);
		add(BorderLayout.NORTH, btn2); // add("North",btn2);
		add("West", btn3);

		// Flowlayout을GridLayout을 변경하기
		pane.setLayout(new GridLayout(2, 0, 10, 5));
		pane.add(btn6);
		pane.add(btn7);
		pane.add(btn8);
		pane.add(new JButton("AAAA"));
		pane.add(new JButton("BBBB"));

		add(BorderLayout.EAST, pane);

		add("South", btn5);

		setSize(500, 500);
		setVisible(true);

		
		// 컨테이너가 종료되면 자원해체한다.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JFrameTest();
	}
}
