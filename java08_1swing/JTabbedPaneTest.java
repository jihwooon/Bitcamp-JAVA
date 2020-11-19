import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {

	JTabbedPane pane = new JTabbedPane();
	JButton btn = new JButton("����� �׽�Ʈ��");
	ImageIcon ii = new ImageIcon("img/3.png");
	ImageIcon ii2 = new ImageIcon("img/6.png");
	ImageIcon ii3 = new ImageIcon("img/2.png");
	JLabel lbl = new JLabel(ii);
	RGB_t2 rgb = new RGB_t2();
	CalculatorSwing2 cal = new CalculatorSwing2();
	CalendarSwing_t2 cs2 = new CalendarSwing_t2();
	
	
	public JTabbedPaneTest() {
		super("�Ǹ޴�");
		//add�� ������� �� �տ��� �ڷ�
		pane.add("��ư", btn);
		pane.add("�̹���",lbl);
		pane.add("����ǥ", rgb);
		
		
		pane.insertTab("",ii2, cal, "����", 1);//�Ǹ޴� ���� 
		pane.insertTab("�޷�",null, cs2, "�޷º���", 3);
		
		
		add(pane);
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		//�Ǹ޴��� Ȱ��ȭ(true), ��Ȱ��ȭ(false) 
		//setEnabled() : ù��° �Ǹ� Ȱ��ȭ�ϰ� ������ ���� ��Ȱ��ȭ �����ִ� ����� ������ �ִ�. 
		//pane.setEnabled(false);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		//���ϴ� �Ǹ� Ȱ��ȭ, ��Ȱ��ȭ 
		pane.setEnabledAt(3, false);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		//���ϴ� �Ǹ� Ȱ��ȭ, ��Ȱ��ȭ 
		pane.setEnabledAt(3, true);
		
		//�Ǹ޴� ��ġ �̵� (top, left, right, bottom)
		pane.setTabPlacement(JTabbedPane.LEFT);
		

	}

	public static void main(String[] args) {
		new JTabbedPaneTest();
	}
}
