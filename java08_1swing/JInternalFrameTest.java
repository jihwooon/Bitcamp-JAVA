import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JInternalFrameTest extends JFrame implements ActionListener {
	JDesktopPane dp = new JDesktopPane();
	JPanel butPane = new JPanel();
	JButton saveBtn = new JButton("저장하기");
	JButton openBtn = new JButton("불러오기");

	public JInternalFrameTest() {
		super("JInternalFrame");
		butPane.add(openBtn);
		butPane.add(saveBtn);
		add("North", butPane);
		saveBtn.addActionListener(this);
		openBtn.addActionListener(this);

		add(dp);

		// InternalFrame
		JInternalFrame if1 = new JInternalFrame("달력");
		CalendarSwing_t2 cal = new CalendarSwing_t2();
		if1.add(cal);
		if1.setSize(300, 300);
		if1.setVisible(true);
		dp.add(if1);
		// 제목, resize, closing, maximum, icon
		JInternalFrame if2 = new JInternalFrame("메모장", true, true, true, true);
		JTextArea ta = new JTextArea();
		if2.add(ta);
		if2.setBounds(100, 100, 400, 300);
		if2.setVisible(true);
		dp.add(if2);
		if2.toFront();

		JInternalFrame if3 = new JInternalFrame("메모장2", true, true, true, true);
		JTextArea ta2 = new JTextArea();
		if3.add(ta2);
		if3.setBounds(200, 200, 400, 300);
		if3.setVisible(true);
		dp.add(if3);
		if3.toFront();

		setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		System.out.println(btn);
		if (btn.equals("불러오기")) {
			openFile();
		}
	}

	public void saveFile() {
		// DesktopPane에서 활성화된 JInternalFrame객체 얻어오기
		JInternalFrame frm = dp.getSelectedFrame();
		frm.getFocusOwner();
		// 글이 입력된 객체 얻어오기
		JTextArea ta = (JTextArea) frm.getFocusOwner();
		String title = frm.getTitle();
		File f;
		if (title.equals("메모장")) {// 처음으로 저장할 때
			JFileChooser fc = new JFileChooser();
			int state = fc.showSaveDialog(this);
			if (state == 0)
				try {
					f = fc.getSelectedFile();
					FileWriter fw = new FileWriter(f);
					fw.write(ta.getText(), 0, ta.getText().length());

				} catch (Exception e) {
				}

		} else {// 처음저장이 아닌때
			try {
				f = new File(title);
				FileWriter fw = new FileWriter(f);
				fw.write(ta.getSelectedText(), 0, ta.getText().length());
				fw.close();
			} catch (Exception e) {
			}
		}
	}

	public void openFile() {
		JFileChooser fc = new JFileChooser();
		int state = fc.showOpenDialog(this);
		if (state == 0) {
			try {
				File f = fc.getSelectedFile();
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				char readData[] = new char[(int) f.length()];
				int cnt = br.read(readData, 0, (int) f.length());
				if (cnt > 0) {
					JInternalFrame f4 = new JInternalFrame("f.getPath()", true, true, true, true);
					JTextArea ta = new JTextArea(new String(readData));
					f4.add(ta);
					f4.setBounds(200, 200, 700, 700);
					f4.setVisible(true);
					dp.add(f4);
					f4.toFront();
				}
			} catch (FileNotFoundException fnfe) {
				System.out.println("파일이없을때");
			} catch (IOException io) {
				System.out.println("파일 읽기 에러....");
			}
		}
	}

	
	public static void main(String[] args) {
		new JInternalFrameTest();
	}
}
