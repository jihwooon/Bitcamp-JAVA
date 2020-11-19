package java10_thread;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalClock3 extends JPanel implements Runnable{

	JLabel lbl = new JLabel("11:50:10");
	Font fnt = new Font("Arial", Font.BOLD, 100);

	public DigitalClock3() {
		// setTitle("Clock");
		
		setLayout(new BorderLayout());
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image icon = kit.getImage("img1/doker.jag");


		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setFont(fnt);
		add(lbl);

	// ������ ���븸ŭ â�� ũ�Ⱑ ������ // setSize(400, 200);// setBounds(x,y,w,h);


	}

@Override
	public void run() {
	do {
		// ����ð�
		Calendar now = Calendar.getInstance();

		// ���ڿ�
		SimpleDateFormat fnt = new SimpleDateFormat("HH:mm:ss");
		String nowStr = fnt.format(now.getTime());

		// �󺧿� ����
		lbl.setText(nowStr);

		// �Ͻ�����
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}

		} while (true);
		
	}
}
