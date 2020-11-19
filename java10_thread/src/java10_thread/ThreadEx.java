package java10_thread;

import javax.swing.JFrame;
import javax.swing.JSplitPane;


//여러 프로그램을 동시에 구현 할 때 쓰는 API


public class ThreadEx extends JFrame{
	DigitalClock3 dc = new DigitalClock3();
	SwingCalendar_2 cal = new SwingCalendar_2();
	Pacman_2 pm = new Pacman_2();
	
	
	public ThreadEx() {
		JSplitPane sp1 = new JSplitPane();
		sp1.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		sp1.add(pm, JSplitPane.RIGHT);
		
		
		JSplitPane sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, dc, cal);
		sp1.add(sp2,JSplitPane.LEFT);
		
		
		Thread dcThread = new Thread(dc);
		Thread pmThread = new Thread(pm);
		dcThread.start();
		pmThread.start();
		
		add(sp1);
		pm.y = pm.getHeight()/2+25;
		System.out.println(pm.x+","+pm.y);
		
		
		setSize(1200,800);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	
	public static void main(String[] args) {
		new ThreadEx();
	}
}
