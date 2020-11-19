
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalClock2 extends JPanel {

	JLabel lbl = new JLabel("11:50:55");
	Font fnt = new Font("Franklin Gothic", Font.BOLD, 150);

	public DigitalClock2() {
		setLayout(new BorderLayout());
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image icon =kit.getImage("img/clock.png");
		lbl.setHorizontalAlignment(JLabel.CENTER);//JLabel ���ڿ� ��� ����
		lbl.setFont(fnt);
		add(lbl);
		setTime();
	
	}//�ð�����
	public void setTime() {
		do {
			Calendar now = Calendar.getInstance();//����ð�
			//���ڿ� 
			SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
			String nowStr = fmt.format(now.getTime());
			//�󺧿� ����
			lbl.setText(nowStr);
			//�Ͻ�����
		try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}while(true);	
	}
}
