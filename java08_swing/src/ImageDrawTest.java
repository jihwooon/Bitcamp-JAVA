import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageDrawTest extends JFrame implements ActionListener {

	JPanel pane = new JPanel();
	String[] btnLbl = { "원본그리기", "축소", "확대", "좌우뒤집기", "상하뒤집기", "일부그리기" };
	MyCanvas mc = new MyCanvas();
	Image img;
	String event = "";

	public ImageDrawTest() {
		super("이미지 그리기");
		for (String lbl : btnLbl) {
			JButton btn = new JButton(lbl);
			pane.add(btn);
			btn.addActionListener(this);// 이벤트등록
			// 이벤트등록
		}
		add(BorderLayout.NORTH, pane);
		add(mc);
		setSize(700, 700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent ae) {
		event = ae.getActionCommand();
		mc.repaint();// panint메소드호출 해주는 메소드 // mc.paint()
	}

	class MyCanvas extends Canvas {
		MyCanvas() {
			img = Toolkit.getDefaultToolkit().getImage("img1/apple.jpg");
		}
		
	public void paint(Graphics g) {
			// 이미지의 폭과 높이를 구한다. 반드시 paint()메소드에서 구한다.
			int w = img.getWidth(this);
			int h = img.getWidth(this);
			if (event.equals("원본그리기")) {
				// 이미지 그리기
				g.drawImage(img, 1, 1, this);// 이벤트 등록
				//축소
			} else if (event.equals("축소")) {
				g.drawImage(img, 1, 1, w / 2, h / 2, this);
				// 확대
			} else if (event.equals("확대")) {
				g.drawImage(img, 1, 1, w * 2, h * 2, this);
				// 좌우뒤지깁
			} else if(event.equals("좌우뒤집기")) {
				g.drawImage(img, 1, 1, w, h, w, 0, 0, h, this);
				//상하뒤집기
			} else if(event.equals("상하뒤집기")) {
				g.drawImage(img, 1, 1, w, h, 0, h, w, 0, this);			
			} else if(event.equals("일부그리기")) {
				int imgw = w/3;
				int imgh = h/3;
				g.drawImage(img, 0, 0, w, h, imgw, imgh, imgw*3, imgh*3, this);
			
			}
		}
	}

	public static void main(String[] args) {
		new ImageDrawTest();
	}
}
