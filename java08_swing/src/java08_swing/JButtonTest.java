package java08_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class JButtonTest extends JFrame {

	ImageIcon ii1 = new ImageIcon("img1/apple.jpg");
	ImageIcon ii2 = new ImageIcon("img1/doker.jpeg");
	ImageIcon ii3 = new ImageIcon("img1/lion.jpg");
	ImageIcon ii4 = new ImageIcon("img1/kakao.jpg");
	ImageIcon ii5 = new ImageIcon("img1/twitter.jpg");

	public JButtonTest() {
		super("JButton");
		setLayout(new GridLayout(0, 3, 10, 10));
		JButton btn1 = new JButton("ù��°");
		add(btn1);
		btn1.setEnabled(false);// ��ư ��Ȱ��ȭ(true:Ȱ��ȭ, false:��Ȱ��ȭ)

		JButton btn2 = new JButton(ii1);
		add(btn2);

		JButton btn3 = new JButton("����°", ii2);
		add(btn3);

		btn3.setRolloverIcon(ii3); // ���콺 ������ icon����
		btn3.setPressedIcon(ii4); // ��ư�� ���� �����϶� icon����

		// RadioButton
		JPanel pane = new JPanel(new GridLayout(3, 1));
		JRadioButton rb1 = new JRadioButton("ONE");
		JRadioButton rb2 = new JRadioButton("TWO");
		JRadioButton rb3 = new JRadioButton("THREE");

		ButtonGroup bg = new ButtonGroup();// ������ư �����ϱ� ���ؼ��� �׷� �������־�� �Ѵ�.
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		pane.add(rb1);
		pane.add(rb2);
		pane.add(rb3);

		add(pane);

		// ToggleButton
		JToggleButton tBtn = new JToggleButton(ii5);
		add(tBtn);
		tBtn.setSelectedIcon(ii1);

		// JLabel
		JLabel lbl1 = new JLabel("��", JLabel.RIGHT);// LEFT, RIGHT, CENTER
		JLabel lbl2 = new JLabel("��", ii2, JLabel.RIGHT);
		add(lbl1);
		add(lbl2);

		// ����ó����ü
		lbl1.setOpaque(true);// true:������ü, false:����
		pane.setOpaque(true);

		// ����
		lbl1.setBackground(Color.black);
		pane.setBackground(Color.green);
		btn1.setBackground(Color.gray);

		JPanel pane2 = new JPanel();
		add(pane2);
		pane2.setOpaque(true);
		pane2.setBackground(Color.cyan);

		setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		// ���ڻ�
		Color clr = new Color(100, 100, 200);
		lbl1.setForeground(clr);

		// �۲� (����ü, ����, arial....)-> ��������(���ϰ�, ����Ӳ�, ����),����ũ��(����:pixel),
		// Font Ŭ����
		Font fnt = new Font("�ü�ü", Font.BOLD + Font.ITALIC, 40);
		lbl1.setFont(fnt);

		// JComboBox
		Vector<String> vec = new Vector<String>();
		vec.add("JAVA");
		vec.add("��Ʈ��");
		vec.add("HTML");
		vec.add("CSS");

		JComboBox box1 = new JComboBox(vec);
		add(box1);

		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		model.addElement("Red");
		model.addElement("Green");
		model.addElement("Blue");
		model.addElement("Yellow");

		JComboBox box2 = new JComboBox(model);
		add(box2);

		// JList
		DefaultListModel<String> model2 = new DefaultListModel<String>();
		for (int i = 100; i <= 100; i += 100) {
			model2.addElement(String.valueOf(i));
		}
		JList<String> list = new JList<String>(model2);
		JScrollPane sp = new JScrollPane(list);
		add(sp);

		// TestField: 1�� ���ڿ��� �Է�

		JTextField tf = new JTextField();
		add(tf);

		// JTextArea : �������� ���ڿ��Է�
		JTextArea ta = new JTextArea();
		JScrollPane sp2 = new JScrollPane(ta);
		add(sp2);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JButtonTest();

	}
}
