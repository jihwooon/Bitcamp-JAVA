import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class join {

	private JFrame frame;
	private JPanel page4;
	private JPanel page5;
	private JPanel endPage;
	private JPanel page3;
	private JPanel page2;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JPanel startPage;
	private JTextField textField;
	private JLabel label;
	private JLabel label_1;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton button_5;

	public join() {
		initialize();
	}

	private void initialize() {

	
		
		
//		프레임
		frame = new JFrame();
		frame.setTitle("가계부");
		frame.setBounds(100, 100, 965, 543);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		
		
		
		
//		첫번째 페이지
		startPage = new JPanel();
		startPage.setBounds(0, 0, 1, 1);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		
		
		
		

//	 	텍스트 필드	
		textField = new JTextField();
		textField.setBounds(279, 297, 387, 32);
		textField.setColumns(10);
		startPage.add(textField);

		
//		라벨
		label = new JLabel("\uB85C\uADF8\uC778");
		label.setBounds(279, 272, 57, 15);
		startPage.add(label);

		label_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		label_1.setBounds(279, 339, 57, 15);
		startPage.add(label_1);

		
//		패스워드 필드
		passwordField = new JPasswordField();
		passwordField.setBounds(279, 364, 387, 43);
		startPage.add(passwordField);
		
		button_5 = new JButton("\uC811\uC18D");
		button_5.setBounds(241, 386, 456, 67);
		startPage.add(button_5);
		
		button_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				page2.setVisible(true);
				startPage.setVisible(false);
				
			}
			
			
		});
		
		
		
		

//  	2번째 페이지
		page2 = new JPanel();
		page2.setBounds(0, 0, 949, 504);
		frame.getContentPane().add(page2);
		page2.setLayout(null);

		button = new JButton("\uB2EC\uB825");
		button.setFont(new Font("굴림", Font.BOLD, 18));
		button.setBounds(560, 428, 194, 76);
		page2.add(button);

		button_1 = new JButton("\uC6D4\uBCC4");
		button_1.setFont(new Font("굴림", Font.BOLD, 18));
		button_1.setBounds(381, 428, 180, 76);
		page2.add(button_1);

		button_2 = new JButton("\uC8FC\uBCC4");
		button_2.setFont(new Font("굴림", Font.BOLD, 18));
		button_2.setBounds(195, 428, 187, 76);
		page2.add(button_2);

		button_3 = new JButton("\uC77C\uC77C");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		button_3.setFont(new Font("굴림", Font.BOLD, 18));
		button_3.setBounds(0, 428, 194, 76);
		page2.add(button_3);

		
		
		button_4 = new JButton("\uC785\uB825");
		button_4.setFont(new Font("굴림", Font.BOLD, 18));
		button_4.setBounds(755, 428, 194, 76);
		page2.add(button_4);
		
		
		
		btnNewButton = new JButton("\u25B7");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton.setBounds(791, 33, 97, 40);
		page2.add(btnNewButton);
		
		
		
		
		btnNewButton_1 = new JButton("\u25C1");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton_1.setBounds(50, 33, 97, 40);
		page2.add(btnNewButton_1);
		


		
//		3번째 페이지
		page3 = new JPanel();
		page3.setBounds(0, 0, 949, 504);
		frame.getContentPane().add(page3);
		page3.setLayout(null);
		
//		3번째 페이지 버튼
		button_1 = new JButton("\uC6D4\uBCC4");
		button_1.setBounds(381, 428, 180, 76);
		page3.add(button_1);

		button_2 = new JButton("\uC8FC\uBCC4");
		button_2.setBounds(195, 428, 187, 76);
		page3.add(button_2);

		button_3 = new JButton("\uC77C\uC77C");
		button_3.setBounds(0, 428, 194, 76);
		page3.add(button_3);

		button_4 = new JButton("\uC785\uB825");
		button_4.setBounds(755, 428, 194, 76);
		page3.add(button_4);
		
		
		
//		4번째 페이지
		page4 = new JPanel();
		page4.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(page4);

		
//		4번째 페이지 버튼
		
		button_1 = new JButton("\uC6D4\uBCC4");
		button_1.setBounds(381, 428, 180, 76);
		page4.add(button_1);

		button_2 = new JButton("\uC8FC\uBCC4");
		button_2.setBounds(195, 428, 187, 76);
		page4.add(button_2);

		button_3 = new JButton("\uC77C\uC77C");
		button_3.setBounds(0, 428, 194, 76);
		page4.add(button_3);

		button_4 = new JButton("\uC785\uB825");
		button_4.setBounds(755, 428, 194, 76);
		page4.add(button_4);
		
		
//		5번째 페이지
		
		page5 = new JPanel();
		page5.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(page5);

		
		
		
//		5번째 페이지 버튼
		button_1 = new JButton("\uC6D4\uBCC4");
		button_1.setBounds(381, 428, 180, 76);
		page5.add(button_1);

		button_2 = new JButton("\uC8FC\uBCC4");
		button_2.setBounds(195, 428, 187, 76);
		page5.add(button_2);

		button_3 = new JButton("\uC77C\uC77C");
		button_3.setBounds(0, 428, 194, 76);
		page5.add(button_3);

		button_4 = new JButton("\uC785\uB825");
		button_4.setBounds(755, 428, 194, 76);
		page5.add(button_4);
		
		
		
//		마지막 페이지
		endPage = new JPanel();
		endPage.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(endPage);
		
		
		
//		마지막 페이지 버튼
		button_1 = new JButton("\uC6D4\uBCC4");
		button_1.setBounds(381, 428, 180, 76);
		endPage.add(button_1);

		button_2 = new JButton("\uC8FC\uBCC4");
		button_2.setBounds(195, 428, 187, 76);
		endPage.add(button_2);

		button_3 = new JButton("\uC77C\uC77C");
		button_3.setBounds(0, 428, 194, 76);
		endPage.add(button_3);

		button_4 = new JButton("\uC785\uB825");
		button_4.setBounds(755, 428, 194, 76);
		endPage.add(button_4);
		
	}

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					join window = new join();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
