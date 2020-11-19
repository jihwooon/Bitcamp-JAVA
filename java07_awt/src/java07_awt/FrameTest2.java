package java07_awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class FrameTest2 {

	Frame frm = new Frame("â����");
	Button btn = new Button("����!");

	public FrameTest2() {
		frm.setTitle("������ â����");

		frm.add(btn);

		// �����̳� ������ ����
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icon = tk.getImage("img/apple.jpg");
		frm.setIconImage(icon);
		
		frm.setSize(500, 500);
		frm.setVisible(true);

	}

	public static void main(String[] args) {
		new FrameTest2();
	}

}
