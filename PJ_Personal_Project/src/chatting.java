import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class chatting extends JFrame implements ActionListener {
	
	JPanel jpl = new JPanel(new BorderLayout());
	JTextField jtx = new JTextField();
	JLabel jlb = new JLabel();
	JButton jbt = new JButton();
	
	
	
	
	public chatting() {
		super("채팅 레이아웃");
		
		//North
		JPanel 
	
		
		
		
		
		
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Chat Clinet");
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		new chatting();
		
		

	}
}
