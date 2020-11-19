package java08_swing;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseEventTest extends JFrame {

	MyCanvas mc = new MyCanvas();
	MyAdapter ma = new MyAdapter();
	int startX, startY;
	int lastX, lastY;
	int btn = 0;

	public MouseEventTest() {
		add(mc);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		mc.addMouseListener(ma);
		mc.addMouseMotionListener(ma);
	}

	class MyAdapter extends MouseAdapter {
		// ���콺�� ���� ���� �϶�
		public void mousePressed(MouseEvent me) {
			// me�� �� x,y��ǥ, ���콺��ư ����
			btn = me.getButton();// ����:1, ��� :2, ������:3
			if (btn == MouseEvent.BUTTON1) {
				startX = me.getX();// ���콺�� Ŭ���Ȱ��� X ��ǥ
				startY = me.getY();// ���콺�� Ŭ���Ȱ��� Y ��ǥ
			}
		}

		// ���콺�������� ��������
		public void mouseReleased(MouseEvent me) {
			// if(me.getButton() == MouseEvent.BUTTON1) {
			// lastX = me.getX();
			// lastY = me.getX();
			// mc.repaint();//�׸��� �׷����� �Ѵ�.
			// }
			btn = 0;
		}

		public void mouseDragged(MouseEvent me) {
			lastX = me.getX();
			lastY = me.getY();

			if (btn == MouseEvent.BUTTON1) {
				mc.repaint();

			}
			startX = lastX;
			startY = lastY;

		}
	}

	class MyCanvas extends Canvas {
		public void paint(Graphics g) {
			System.out.println(startX + "," + startY + "," + lastX + "," + lastY);
			g.drawLine(startX, startY, lastX, lastY);
		}

		public void update(Graphics g) {
			paint(g);

		}
	}

	public static void main(String[] args) {
		new MouseEventTest();

	}
}
