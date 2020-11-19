
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
		lbl.setHorizontalAlignment(JLabel.CENTER);//JLabel 문자열 가운데 정렬
		lbl.setFont(fnt);
		add(lbl);
		setTime();
	
	}//시간설정
	public void setTime() {
		do {
			Calendar now = Calendar.getInstance();//현재시간
			//문자열 
			SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
			String nowStr = fmt.format(now.getTime());
			//라벨에 셋팅
			lbl.setText(nowStr);
			//일시정지
		try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}while(true);	
	}
}
