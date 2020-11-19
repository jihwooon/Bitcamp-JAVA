import javax.swing.JFrame;
import javax.swing.JSplitPane;



public class JSplitPaneTest extends JFrame{
	CalendarSwing_t2 calendar = new CalendarSwing_t2();
	RGB_t2 rgb = new RGB_t2();
	CalculatorSwing2 calculator = new CalculatorSwing2();
	
	public JSplitPaneTest() {
		JSplitPane sp2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, calendar, calculator);
		JSplitPane sp1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, rgb, sp2);
		//��輱�� divider��� �� 
		add(sp1);
		
		
		sp1.setDividerLocation(500);
		sp2.setDividerLocation(600);
		
		sp1.setDividerSize(20); //��輱�� �β�
		sp1.setOneTouchExpandable(true);
		sp2.setOneTouchExpandable(true);
		
		
		setSize(1200, 1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JSplitPaneTest();
	}
}
