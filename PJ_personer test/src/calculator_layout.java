import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator_layout  extends JFrame  {

	JPanel p = new JPanel();
	public calculator_layout() {
		
		p.setLayout(new BorderLayout());
		this.setTitle("layout test");
		this.setSize(500, 698);
		flowTest();
		merge();
		gridTest();
			
	}
	
	
	

	void flowTest() {
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		JPanel gridt = new JPanel();
		JTextField t1 = new JTextField("0");
		t1.setText("0");
		t1.setHorizontalAlignment(JTextField.RIGHT);
		gridt.setLayout(new GridLayout(1,0));
		gridt.add(t1);
		t1.setPreferredSize(new Dimension(312,50));
		p.add(gridt);
		
		
		this.add(p);
		
	}
	

	void merge() {
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		JPanel box1 = new JPanel();
		
		
		
		
	}
	
	
	
	
	void bordrTest() {
		
		
		
	}
	
	
	
	
	void gridTest() {
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {		
		
	
	

	}
}
