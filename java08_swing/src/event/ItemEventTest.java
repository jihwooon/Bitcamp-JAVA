package event;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class ItemEventTest extends JFrame implements ActionListener, ItemListener{

	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);

	JToolBar tb = new JToolBar();
		JComboBox<String> fontCombo = new JComboBox<String>();
			DefaultComboBoxModel<String> modelFont = new DefaultComboBoxModel();
			
		JComboBox<Integer> fontSize = new JComboBox<Integer>();
			DefaultComboBoxModel<Integer> modelSize = new DefaultComboBoxModel<Integer>();
			
		JToggleButton plainBtn = new JToggleButton("가");	
		JToggleButton boldBtn = new JToggleButton("가");
		JToggleButton italicBtn = new JToggleButton("가");
						
		
	Font fnt = new Font("돋움",Font.PLAIN, 12);	
	String selectFontName = "바탕체";
	Integer selectFontSize = 13;
	int StyleBold= 0; //0:보통, 1:진하게, 2:기울임꼴, 3:진하게+기울임꼴
	int StyleItalic=0; 
	
	public ItemEventTest() {
		add(sp);
		
		//시스템의 글꼴 얻어오기
		String fontList[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
			for(String f : fontList) {
				modelFont.addElement(f);
		}
		fontCombo.setModel(modelFont);
		fontCombo.setSelectedItem("바탕체");
		
		for(int i=7; i<100; i+=3) {
			modelSize.addElement(i);
		}
		fontSize.setModel(modelSize);
		fontSize.setSelectedItem(Integer.valueOf(12));
		
		//글자 유형
		plainBtn.setFont(fnt);
		boldBtn.setFont(new Font("Arial", Font.BOLD,12));
		italicBtn.setFont(new Font("Arial", Font.ITALIC, 12));
		
		tb.add(fontCombo); tb.add(fontSize); tb.add(plainBtn); tb.add(boldBtn); tb.add(italicBtn);
		
		add("North", tb);
		
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//이벤트등록
		plainBtn.addActionListener(this);
		boldBtn.addActionListener(this);
		italicBtn.addActionListener(this);
		
		fontCombo.addItemListener(this);
		fontSize.addItemListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		JToggleButton  event = (JToggleButton)ae.getSource();
		if(event.equals(plainBtn)) {
			if(plainBtn.isSelected()) {
				StyleBold =0;
				StyleItalic=0;
			}
			
			}else if(event.equals(boldBtn)) {
				if(boldBtn.isSelected()) {
					StyleBold = 1;
				}else {
					StyleBold = 0;
				}
			}else if(event.equals(italicBtn)) {
				if(italicBtn.isSelected()) {
					StyleItalic = Font.ITALIC;
				}else {
					StyleItalic = 0;
				}
			}
		fnt = new Font(selectFontName, StyleBold+StyleItalic, selectFontSize);
		ta.setFont(fnt);
		System.out.println(StyleBold+", "+StyleItalic);
	}
	
	
	
	public void itemStateChanged(ItemEvent ie) {
		JComboBox event = (JComboBox)ie.getSource();
		if(event == fontCombo) {
			selectFontName = (String)fontCombo.getSelectedItem();
		}else if(event == fontSize) {
			selectFontSize = (Integer)fontSize.getSelectedItem();
		}
		fnt = new Font(selectFontName, StyleBold + StyleItalic, selectFontSize);
		ta.setFont(fnt);
			
	}
	
	
	public static void main(String[] args) {
		new ItemEventTest();

	}
}
