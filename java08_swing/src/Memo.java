import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Memo extends JFrame implements ActionListener{

	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	
	//메뉴 생성
	JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
	
		
		
	//메뉴 목록- 전체 틀 구성
		JMenuItem newMenu = new JMenuItem("새문서");
		JMenuItem openMenu = new JMenuItem("열기");//Ctrl+o
			JMenu saveMenu = new JMenu("저장하기");
				JMenuItem save = new JMenuItem("save");
				JMenuItem saveAs = new JMenuItem("save as");
			JMenu endMenu = new JMenu("종료");
		JMenu editMenu = new JMenu("편집");
			JMenuItem copyMenu = new JMenuItem("복사하기");
			JMenuItem cutMenu = new JMenuItem("잘라내기");
			JMenuItem pasteMenu = new JMenuItem("붙여넣기");
		JMenu runMenu = new JMenu("실행");
			JMenuItem memoMenu = new JMenuItem("메모장");
			JMenuItem editplusMenu = new JMenuItem("에디트플러스");
			JMenu browserMenu = new JMenu("웹브라우저");
				JMenuItem chromeMenu = new JMenuItem("크롬");
				JMenuItem expMenu = new JMenuItem("익스플로러");
			JMenuItem compileMenu = new JMenuItem("컴파일");
			JMenuItem javaRunMenu = new JMenuItem("자바실행");
		
			String buffer;	
			
	//내부 구성	
	public Memo() {
		super("메모장");
		add(sp);
		
		//메뉴 구성
		mb.add(fileMenu); mb.add(editMenu); mb.add(runMenu);
		fileMenu.add(newMenu); fileMenu.add(openMenu); fileMenu.add(saveMenu); fileMenu.add(endMenu);
		saveMenu.add(save); saveMenu.add(saveAs);
		
		editMenu.add(copyMenu); editMenu.add(cutMenu); editMenu.add(pasteMenu);
		
		runMenu.add(memoMenu); runMenu.add(editplusMenu); runMenu.add(browserMenu); runMenu.add(compileMenu);
		browserMenu.add(chromeMenu); browserMenu.add(expMenu); runMenu.add(javaRunMenu);
			
		setJMenuBar(mb);

		
		//메모장 틀 구성
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		newMenu.addActionListener(this);
		openMenu.addActionListener(this);
		save.addActionListener(this);
		saveAs.addActionListener(this);
		endMenu.addActionListener(this);
		
		copyMenu.addActionListener(this);
		cutMenu.addActionListener(this);
		pasteMenu.addActionListener(this);
		
		memoMenu.addActionListener(this);
		editplusMenu.addActionListener(this);
		browserMenu.addActionListener(this);
		expMenu.addActionListener(this);
		chromeMenu.addActionListener(this);
		compileMenu.addActionListener(this);
		javaRunMenu.addActionListener(this);
		
		
		setShortCut();//단축키 설정
		
	}
	
	//이벤트 
	public void actionPerformed(ActionEvent ae) {
		Object event = ae.getSource();
		
		if(event == endMenu) {
			dispose();
			System.exit(0);
		}else if(event == newMenu) {
			ta.setText("");
			setTitle("메모장");
		}else if(event == openMenu) {
			openMenu();	
		}else if(event == save) {
			saveMenu();
		}else if(event == copyMenu) {
			copyMenu();
		}else if(event == pasteMenu) {
			pasteMenu();
		}else if(event == cutMenu) {
			cutMenu();
		}else if(event == memoMenu) {
			startProcess("notepad.exe");
		}else if(event == editplusMenu) {
			startProcess("C://Program Files/EditPlus/editplus.exe"); 					
		}else if(event == "expMenu") {
			startProcess("C://Program Files/InternetExplorer/iexplore.exe");	
		}else if(event == "chromeMenu") {
			startProcess("C://Program Files (x86)/Google/Chrome/Application/chrome.exe");			
		}else if(event == compileMenu) {
			startProcess("javac " + getTitle()); //javac d:/Test.java
			System.out.println("컴파일됨..");
		}else if(event == javaRunMenu) {
			javaRunStart();
			
		
	
	
		}
	}

	//자바실행
	public void javaRunStart() {
		String fileName = getTitle();
		if(!fileName.equals("메모장")) {
			try {
				Runtime runtime = Runtime.getRuntime();
				Process process = runtime.exec("java " + fileName);
				InputStreamReader isr = new InputStreamReader(process.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				while(true) {
					String buffer = br.readLine();
					if(buffer==null) break;
					System.out.println(buffer);
				}					
			}catch (Exception e) {
				System.out.println(e.toString());
			}
			System.out.println("실행완료......");
		}
	}

	//메모메뉴
	public void startProcess(String filename) {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec(filename);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//잘라내기
	public void cutMenu() {
		buffer = ta.getSelectedText();
		copyMenu();
		ta.replaceSelection("");
	}

	//붙여넣기
	public void pasteMenu() {
		ta.replaceSelection(buffer);
		
	
	}

	//복사하기
	public void copyMenu() {
		buffer = ta.getSelectedText();
		System.out.println(buffer);
	}

	//저장하기
	public void saveMenu() {
		JFileChooser fc = new JFileChooser();
	int result = fc.showSaveDialog(this);
	if(result == 0) { //0:저장, 1:취소
		
		try {
			File f = fc.getSelectedFile();//선택한 경로와 파일명 얻어오기
			FileWriter fw = new FileWriter(f);
			
			String txt = ta.getText();
			fw.write(txt);
			fw.close();
			setTitle(f.getPath());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	
		}	
	}
	
	//열기
	public void openMenu() {
		File f = new File("D://kavaDev");
		JFileChooser fc=new JFileChooser(f);//파일탐색기
		
		
		//Filter생성
		FileFilter f1 = new FileNameExtensionFilter("자바(.java)", "java", "JAVA", "java");
		fc.addChoosableFileFilter(f1);
		
		FileFilter f2 = new FileNameExtensionFilter("자바(.class)","class");
		fc.addChoosableFileFilter(f2);
		
		FileFilter f3 = new FileNameExtensionFilter("이미지", "jpg", "gif", "png");
		fc.addChoosableFileFilter(f3);
		
		
		int result = fc.showOpenDialog(this);//
		if(result == 0) {//열기버튼을 선택한 경우
			try {
				File selectFile = fc.getSelectedFile();
				FileInputStream fis = new FileInputStream(selectFile);
				byte data[] = new byte[(int)selectFile.length()];
				int cnt = fis.read(data);
				if(cnt>0) {
					ta.setText(new String(data));
					
					
				}
				setTitle(selectFile.getPath());
				
			}catch(FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
		
	//화면 출력
	public void setShortCut() {
		//		 mask   key
		//열기 ---> ctrl+o 단축키 입력
		openMenu.setMnemonic(KeyEvent.VK_O);
		openMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		
		//저장 --> Alt + s 단축키 입력
		save.setMnemonic(KeyEvent.VK_S);
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
	}
	
	public static void main(String[] args) {
		new Memo();
	}
}
