import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {

	JTabbedPane pane = new JTabbedPane();
	JButton btn = new JButton("탭페널 테스트중");
	ImageIcon ii = new ImageIcon("img/3.png");
	ImageIcon ii2 = new ImageIcon("img/6.png");
	ImageIcon ii3 = new ImageIcon("img/2.png");
	JLabel lbl = new JLabel(ii);
	RGB_t2 rgb = new RGB_t2();
	CalculatorSwing2 cal = new CalculatorSwing2();
	CalendarSwing_t2 cs2 = new CalendarSwing_t2();
	
	
	public JTabbedPaneTest() {
		super("탭메뉴");
		//add는 순서대로 들어감 앞에서 뒤로
		pane.add("버튼", btn);
		pane.add("이미지",lbl);
		pane.add("색상표", rgb);
		
		
		pane.insertTab("",ii2, cal, "계산기", 1);//탭메뉴 삽입 
		pane.insertTab("달력",null, cs2, "달력보기", 3);
		
		
		add(pane);
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		//탭메뉴의 활성화(true), 비활성화(false) 
		//setEnabled() : 첫번째 탭만 활성화하고 나머지 탭은 비활성화 시켜주는 기능을 가지고 있다. 
		//pane.setEnabled(false);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		//원하는 탭만 활성화, 비활성화 
		pane.setEnabledAt(3, false);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		//원하는 탭만 활성화, 비활성화 
		pane.setEnabledAt(3, true);
		
		//탭메뉴 위치 이동 (top, left, right, bottom)
		pane.setTabPlacement(JTabbedPane.LEFT);
		

	}

	public static void main(String[] args) {
		new JTabbedPaneTest();
	}
}
