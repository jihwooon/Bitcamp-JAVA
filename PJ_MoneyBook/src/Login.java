import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	
	
	JPanel LoginPage = new JPanel();
	JLabel lblFh = new JLabel("\uB85C\uADF8\uC778");
	JLabel label2 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");

	JButton logBtn = new JButton("����");
	JTextField txtID = new JTextField(10);
	
	
	
//	���̵� & ��й�ȣ
	private final String ID = "jihwooon";
	private final String PASS = "1234";

	// �Է��� �� ��ȣȭs
	JPasswordField txtPass = new JPasswordField(10);
	public JPanel Page_2 = new JPanel();
	private final JPanel panel = new JPanel();
	
	
	//�α��� ������
	public Login() {

//		�г� ��׶���

		
		LoginPage.setBackground(Color.ORANGE);
		LoginPage.setLayout(null);
		lblFh.setBounds(93, 157, 62, 15);
		lblFh.setFont(new Font("����", Font.BOLD, 12));

//		 �г�
		LoginPage.add(lblFh);
		txtID.setBounds(82, 171, 444, 31);
		LoginPage.add(txtID);
		label2.setBounds(92, 212, 69, 15);
		label2.setFont(new Font("����", Font.BOLD, 12));

		LoginPage.add(label2);
		txtPass.setBounds(82, 233, 443, 31);
		LoginPage.add(txtPass);
		logBtn.setBounds(81, 305, 444, 46);
		logBtn.setBackground(Color.CYAN);
		logBtn.setForeground(Color.WHITE);
		logBtn.setFont(new Font("����", Font.BOLD, 15));
		LoginPage.add(logBtn);


//		�α��� ��ư �׼�
		logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ID.equals(txtID.getText()) && PASS.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "�α����� �����ϼ̽��ϴ�.");
					LoginPage.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "�α����� �����ϼ̽��ϴ�.");
					LoginPage.setVisible(true);
				}

			}
		});
		panel.setLayout(null);
		
		getContentPane().add(panel, BorderLayout.NORTH);

		
		
		// �г� �߰�
		getContentPane().add(LoginPage);

		JCheckBox chckbxNewCheckBox = new JCheckBox("�ٽ� �Է����ּ���.");
		chckbxNewCheckBox.setBounds(82, 276, 115, 23);
		chckbxNewCheckBox.setFont(new Font("����", Font.BOLD, 12));
		chckbxNewCheckBox.setBackground(Color.ORANGE);
		LoginPage.add(chckbxNewCheckBox);
		setLocationRelativeTo(null);
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	public static void main(String[] args) {
		new Login();

	}
}
