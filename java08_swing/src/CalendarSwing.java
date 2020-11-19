import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalendarSwing extends JFrame implements ActionListener {

	Font fnt = new Font("Arial", Font.PLAIN, 30);
	JTextField tf = new JTextField("");

	String btnLbl[] = { "BlackSpace", "Clear", "End", "7", "8", "9", "+", "4", "5", "6", "-", "0", ".", "=", "/" };

	JPanel frmCenter = new JPanel(new BorderLayout());
	JPanel centerNorth = new JPanel(new GridLayout(1, 3));
	JPanel centerBtn = new JPanel(new GridLayout(4, 4, 5, 5));
	CalculatorEvent event = new CalculatorEvent(tf);

	public CalendarSwing() {
		super("����");
		add("North", tf);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		add("North", tf);

		// ��ư��
		add("Center", frmCenter);
		frmCenter.add("North", centerNorth);
		frmCenter.add("Center", centerBtn);

		for (int i = 0; i < btnLbl.length; i++) {// 0,1,2,3,..........10
			JButton btn = new JButton(btnLbl[i]);// ��ư ����
			btn.setFont(fnt);// ����ũ�� ����
			btn.setBackground(Color.LIGHT_GRAY);
			btn.addActionListener(new CalculatorEvent(tf));// �̺�Ʈ���
			// ��ư�� JPanel�߰�

			if (i <= 2) {
				centerNorth.add(btn);

			} else {
				centerBtn.add(btn);

			}
		}

		setSize(500, 350);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new CalendarSwing();

	}

}
