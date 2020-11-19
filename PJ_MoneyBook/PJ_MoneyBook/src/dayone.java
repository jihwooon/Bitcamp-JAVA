import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class dayone {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			
			public void run() {
				try {
					dayone window = new dayone();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public dayone() {
		initialize();
	}


	
	
	private void initialize() {
		frame = new JFrame();

		frame.setBounds(400, 400, 900, 430);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel onedayPanel = new ImagePanel(new ImageIcon("C:\\Users\\jihwo\\eclipse-workspace\\PJ_MoneyBook\\Image\\backgound.png").getImage());
		 
		
		
		
		
		frame.setSize(new Dimension());
		frame.setPreferredSize(onedayPanel.getDim());
		frame.getContentPane().add(onedayPanel, BorderLayout.SOUTH);
		
		
		
//	Button calendarBtn
		JButton calendarBtn = new JButton("´Þ·Â");
		calendarBtn.setForeground(Color.WHITE);
		calendarBtn.setBackground(new Color(11, 83, 148));
		calendarBtn.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 29));
		calendarBtn.setBorder(null);
		
//	Button weekBtn
		JButton weekBtn = new JButton("ÁÖº°");
		weekBtn.setForeground(Color.WHITE);
		weekBtn.setBackground(new Color(11, 83, 148));
		weekBtn.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 29));
		weekBtn.setBorder(null);
		
//	Button monthBtn
		JButton monthBtn = new JButton("¿ùº°");
		monthBtn.setForeground(Color.WHITE);
		monthBtn.setBackground(new Color(11, 83, 148));
		monthBtn.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 29));
		monthBtn.setBorder(null);
		
		
//	Button inputBtn	
		JButton inputBtn = new JButton("ÀÔ·Â");
		inputBtn.setForeground(Color.WHITE);
		inputBtn.setBackground(new Color(11, 83, 148));
		inputBtn.setFont(new Font("±¼¸²", Font.BOLD, 29));
		inputBtn.setBorder(null);
		GroupLayout gl_onedayPanel = new GroupLayout(onedayPanel);
		gl_onedayPanel.setHorizontalGroup(
			gl_onedayPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_onedayPanel.createSequentialGroup()
					.addGap(278)
					.addComponent(calendarBtn, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(weekBtn, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(monthBtn, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(inputBtn, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					.addGap(2))
		);
		gl_onedayPanel.setVerticalGroup(
			gl_onedayPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_onedayPanel.createSequentialGroup()
					.addGroup(gl_onedayPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_onedayPanel.createSequentialGroup()
							.addGap(82)
							.addComponent(calendarBtn))
						.addGroup(gl_onedayPanel.createSequentialGroup()
							.addGap(83)
							.addComponent(monthBtn))
						.addGroup(gl_onedayPanel.createSequentialGroup()
							.addGap(81)
							.addComponent(weekBtn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_onedayPanel.createSequentialGroup()
							.addGap(83)
							.addComponent(inputBtn, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(593, Short.MAX_VALUE))
		);
		onedayPanel.setLayout(gl_onedayPanel);
		
		
		frame.pack();
		
	}
}
