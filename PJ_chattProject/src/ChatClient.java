

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
			JLabel connListLbl = new JLabel("������ ����Ʈ");
			DefaultListModel<String> model = new DefaultListModel<String>();
			JList<String> connList = new JList();
			JScrollPane sp2 = new JScrollPane(connList);
			JLabel connCount = new JLabel("���� ������  : 0��");
			
			Socket s;
			PrintWriter pw;
			BufferedReader br;
			
			
			
			
		
	public ChatClient() {
		super("ä�����α׷�");
		
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
//		�г� �߾ӿ� ��ġ		
		add(centerPane);
	

		eastPanel.add(connListLbl,BorderLayout.NORTH);
		eastPanel.add(sp2);
		eastPanel.add(connCount, BorderLayout.SOUTH);	
		model.addElement("       ");
		
		
//		�г� ���ʿ� ��ġ
		add(eastPanel, BorderLayout.EAST);
		
		
		
		setTitle("Chat Client");
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	
		
		
//		�ڽ��� �޴°�
		
		connTf.addActionListener(this);
		connBtn.addActionListener(this);
		msgTf.addActionListener(this);
		sendBtn.addActionListener(this);
		
	}


//	�ൿ�ϱ� ���� api
	public void actionPerformed(ActionEvent ae) {
		Object event = ae.getSource();
		if(event == connTf || event == connBtn ) {//���� ����
			setSeverConnection();
			
		}else if(event == msgTf || event==sendBtn) {//�����κ��� ���� ������
			msgSend();
		
		}
	}
	
// ������ ���� ������
	public void msgSend() {
		pw.println(msgTf.getText());
		pw.flush();
		msgTf.setText("");
		
	}

	
	public void setSeverConnection() {
		try {
			if(!connTf.getText().equals("")) {
//			������ ����
			InetAddress ia = InetAddress.getByName(connTf.getText());
			s = new Socket(ia,9999);
//			inputStream
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
//			outputString
			
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
//			�����ư ��Ȱ��ȭ
			connTf.setEditable(false);
			connBtn.setEnabled(false);

//			�޴� ������ ����
			Thread t = new Thread(this);
			t.start();	
			}
						
		}catch (Exception e){}

	}
	
	
	
	
	
	@Override
	public void run() {
		System.out.println("�� �ε� ��������");
		while(true) {
			try {
			String receiveMsg = br.readLine();
				if(receiveMsg !=null) {
					if(receiveMsg.substring(0,6).equals("CONGU*")) {
						msgView.append(receiveMsg.substring(6)+"\n");	
					}else if(receiveMsg.substring(0,6).equals("[CC$@&]")) {
						connCount.setText("����������:"+ receiveMsg.substring(6)+"��");
					}else if(receiveMsg.substring(0,6).equals("[User]")) {
						String username = receiveMsg.substring(6);
						StringTokenizer token = new StringTokenizer(username);
						model.removeAllElements();//��������Ʈ ����
						
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
