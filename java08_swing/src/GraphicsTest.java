import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsTest extends JFrame {

	
	
	
	public GraphicsTest() {
		super("�׸��׸���");
	
		MyCanvas canvas = new MyCanvas();
		add(canvas);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	
	
	
	class MyCanvas extends Canvas{
		public void paint(Graphics g) {
			g.drawString("���ڿ� �׸���", 100, 100);
		
			//���ڿ��׸���					x,	y
			g.drawString("���ڿ� �׸���", 100, 100);
			//�����׸���
			g.drawLine(50, 50, 300, 300);
			//�簢�� �׸��� - ����
			g.drawRect(100, 50, 300,100);
			//�簢�� �׸��� - ä����
			g.setColor(Color.yellow);//�׸����� ����
			g.fillRect(100, 200, 300, 100);
			
			g.setColor(Color.blue);
			//���׸���
			g.drawOval(50, 50, 300, 200);
			g.fillOval(50, 250, 200, 100);
			
			//�ձٻ簢��
			g.setColor(Color.DARK_GRAY);
			g.fillRoundRect(10, 10, 300, 300, 100, 100);
			
			//�ٰ���
			g.setColor(Color.red);
			int x[] = {160, 340, 270, 120, 85};
			int y[] = {55, 150, 300, 277, 155};
			g.drawPolygon(x, y, x.length);
			
			
		}	
	}
	
	

	public static void main(String[] args) {
		new GraphicsTest();	
	}
}
