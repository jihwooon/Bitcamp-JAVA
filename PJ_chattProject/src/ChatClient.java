

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable{
	
	
//	Center
	JPanel centerPane = new JPanel(new BorderLayout());	
		JPanel northPane = new JPanel(new BorderLayout());
			JTextField connTf = new JTextField("192.168.0.235");
			JButton connBtn = new JButton("Connection");
		JTextArea msgView = new JTextArea();
		JScrollPane sp = new JScrollPane(msgView);		
		JPanel southPane = new JPanel(new BorderLayout());
			JTextField msgTf= new JTextField();
			JButton sendBtn = new JButton("Send");
			
//		Frame->East
		JPanel eastPanel = new JPanel(new BorderLayout());
			JLabel connListLbl = new JLabel("접속자 리스트");
			DefaultListModel<String> model = new DefaultListModel<String>();
			JList<String> connList = new JList();
			JScrollPane sp2 = new JScrollPane(connList);
			JLabel connCount = new JLabel("현재 접속자  : 0명");
			
			Socket s;
			PrintWriter pw;
			BufferedReader br;
			
			
			
			
		
	public ChatClient() {
		super("채팅프로그램");
		
		connTf.setBackground(new Color(200,200,230));
		msgTf.setBackground(new Color(200,200,230));
		msgView.setBackground(Color.blue);
		msgView.setForeground(Color.white);
		
		
		northPane.add(connTf);
		northPane.add(connBtn, BorderLayout.EAST);
		
		southPane.add(northPane, BorderLayout.NORTH);
		southPane.add(msgTf);
		southPane.add(sendBtn, BorderLayout.EAST);

		
		centerPane.add(northPane, BorderLayout.NORTH);
			centerPane.add(southPane, BorderLayout.SOUTH);
			centerPane.add(sp);
//		패널 중앙에 배치		
		add(centerPane);
	

		eastPanel.add(connListLbl,BorderLayout.NORTH);
		eastPanel.add(sp2);
		eastPanel.add(connCount, BorderLayout.SOUTH);	
		model.addElement("       ");
		
		
//		패널 동쪽에 배치
		add(eastPanel, BorderLayout.EAST);
		
		
		
		setTitle("Chat Client");
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	
		
		
//		자신을 받는거
		
		connTf.addActionListener(this);
		connBtn.addActionListener(this);
		msgTf.addActionListener(this);
		sendBtn.addActionListener(this);
		
	}


//	행동하기 위한 api
	public void actionPerformed(ActionEvent ae) {
		Object event = ae.getSource();
		if(event == connTf || event == connBtn ) {//서버 연결
			setSeverConnection();
			
		}else if(event == msgTf || event==sendBtn) {//서버로부터 문자 보내기
			msgSend();
		
		}
	}
	
// 서버로 문자 보내기
	public void msgSend() {
		pw.println(msgTf.getText());
		pw.flush();
		msgTf.setText("");
		
	}

	
	public void setSeverConnection() {
		try {
			if(!connTf.getText().equals("")) {
//			서버에 접속
			InetAddress ia = InetAddress.getByName(connTf.getText());
			s = new Socket(ia,9999);
//			inputStream
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
//			outputString
			
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
//			연결버튼 비활성화
			connTf.setEditable(false);
			connBtn.setEnabled(false);

//			받는 스레드 구현
			Thread t = new Thread(this);
			t.start();	
			}
						
		}catch (Exception e){}

	}
	
	
	
	
	
	@Override
	public void run() {
		System.out.println("아 로딩 개느리네");
		while(true) {
			try {
			String receiveMsg = br.readLine();
				if(receiveMsg !=null) {
					if(receiveMsg.substring(0,6).equals("CONGU*")) {
						msgView.append(receiveMsg.substring(6)+"\n");	
					}else if(receiveMsg.substring(0,6).equals("[CC$@&]")) {
						connCount.setText("현재접속자:"+ receiveMsg.substring(6)+"명");
					}else if(receiveMsg.substring(0,6).equals("[User]")) {
						String username = receiveMsg.substring(6);
						StringTokenizer token = new StringTokenizer(username);
						model.removeAllElements();//이전리스트 제거
						
						while(token.hasMoreElements()) {
							model.addElement(token.nextToken());
							
							
						}
						
					}else if(receiveMsg.substring(0,6).equals("[CMsg]")) {
						msgView.append(receiveMsg.substring(6)+"\n");
					}
				}		
			}catch(Exception e) {
		
			}
		}
	}

	
	
	public static void main(String[] args) {
		new ChatClient();	
	}
}
