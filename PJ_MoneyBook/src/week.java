import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class week {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					week window = new week();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public week() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel weekPanel = new ImagePanel(new ImageIcon("C:\\Users\\jihwo\\eclipse-workspace\\PJ_MoneyBook\\Image\\backgound.png").getImage());

		frame.setSize(new Dimension());
		frame.setPreferredSize(weekPanel.getDim());
		frame.getContentPane().add(weekPanel, BorderLayout.SOUTH);
		weekPanel.setLayout(null);
		
		JButton leftButton = new JButton("\u25C1");
		leftButton.setBackground(new Color(46, 204, 250));
		leftButton.setForeground(new Color(0, 0, 0));		
		leftButton.setFont(new Font("±¼¸²", Font.PLAIN, 45));
		leftButton.setBounds(36, 54, 125, 67);
		leftButton.setBorder(null);
		weekPanel.add(leftButton);
		
		JButton rightButton = new JButton("\u25B7");
		rightButton.setBackground(new Color(46, 204,250));
		rightButton.setFont(new Font("±¼¸²", Font.PLAIN, 45));
		rightButton.setBounds(1172, 52, 113, 66);
		rightButton.setBorder(null);
		weekPanel.add(rightButton);
		
		
		
		JLabel income = new JLabel("\uC218\uC785");
		income.setFont(new Font("±¼¸²", Font.BOLD, 25));
		income.setBounds(140, 145, 57, 35);
		weekPanel.add(income);
		
		JLabel expense = new JLabel("\uC9C0\uCD9C");
		expense.setFont(new Font("±¼¸²", Font.BOLD, 25));
		expense.setBounds(610, 145, 57, 33);
		weekPanel.add(expense);
		
		JLabel transfer = new JLabel("\uC774\uCCB4");
		transfer.setFont(new Font("±¼¸²", Font.BOLD, 25));
		transfer.setBounds(1155, 145, 57, 34);
		weekPanel.add(transfer);
		
		
		
//	Button ondayBtn
		JButton onedayBtn = new JButton("\uC77C\uC77C");
		onedayBtn.setBackground(new Color(238, 238, 238));
		onedayBtn.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 29));
		onedayBtn.setBounds(0, 623, 267, 90);
		weekPanel.add(onedayBtn);
		
		
//	Button weekBtn
		JButton weekBtn = new JButton("\uC8FC\uBCC4");
		weekBtn.setBackground(new Color(238, 238, 238));
		weekBtn.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 29));
		weekBtn.setBounds(537, 623, 267, 90);
		weekPanel.add(weekBtn);
		
		
//	Button monthBtn
		JButton monthBtn = new JButton("\uC6D4\uBCC4");
		monthBtn.setBackground(new Color(238,238,238));
		monthBtn.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 29));
		monthBtn.setBounds(803, 623, 281, 90);
		weekPanel.add(monthBtn);
		
//	Button inputBtn	
		JButton inputBtn = new JButton("\uC785\uB825");
		inputBtn.setBackground(new Color(238, 238, 238));
		inputBtn.setFont(new Font("±¼¸²", Font.BOLD, 29));
		inputBtn.setBounds(1085, 623, 248, 90);
		weekPanel.add(inputBtn);
		
		frame.pack();
		
	}

}
