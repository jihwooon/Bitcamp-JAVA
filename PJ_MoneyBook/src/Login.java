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

	JButton logBtn = new JButton("접속");
	JTextField txtID = new JTextField(10);
	
	
	
//	아이디 & 비밀번호
	private final String ID = "jihwooon";
	private final String PASS = "1234";

	// 입력할 때 암호화s
	JPasswordField txtPass = new JPasswordField(10);
	public JPanel Page_2 = new JPanel();
	private final JPanel panel = new JPanel();
	
	
	//로그인 페이지
	public Login() {

//		패널 백그라운드

		
		LoginPage.setBackground(Color.ORANGE);
		LoginPage.setLayout(null);
		lblFh.setBounds(93, 157, 62, 15);
		lblFh.setFont(new Font("굴림", Font.BOLD, 12));

//		 패널
		LoginPage.add(lblFh);
		txtID.setBounds(82, 171, 444, 31);
		LoginPage.add(txtID);
		label2.setBounds(92, 212, 69, 15);
		label2.setFont(new Font("굴림", Font.BOLD, 12));

		LoginPage.add(label2);
		txtPass.setBounds(82, 233, 443, 31);
		LoginPage.add(txtPass);
		logBtn.setBounds(81, 305, 444, 46);
		logBtn.setBackground(Color.CYAN);
		logBtn.setForeground(Color.WHITE);
		logBtn.setFont(new Font("굴림", Font.BOLD, 15));
		LoginPage.add(logBtn);


//		로그인 버튼 액션
		logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ID.equals(txtID.getText()) && PASS.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "로그인의 성공하셨습니다.");
					LoginPage.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "로그인의 실패하셨습니다.");
					LoginPage.setVisible(true);
				}

			}
		});
		panel.setLayout(null);
		
		getContentPane().add(panel, BorderLayout.NORTH);

		
		
		// 패널 추가
		getContentPane().add(LoginPage);

		JCheckBox chckbxNewCheckBox = new JCheckBox("다시 입력해주세요.");
		chckbxNewCheckBox.setBounds(82, 276, 115, 23);
		chckbxNewCheckBox.setFont(new Font("굴림", Font.BOLD, 12));
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
