import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread {
//	���ӻ� ����� ������ �÷���
	
	ArrayList<ChatService> connList = new ArrayList<ChatService>();
	ServerSocket ss;

	public ChatServer()  {
		this.start();
		
	}

//	���Ӵ�� ������
	public void run() {
		try {
			ss = new ServerSocket(9999);
			
			while(true) {
				System.out.println("Server Start");
				System.out.println("���Ӵ����....");
				Socket s = ss.accept();
//				���ӻ� ������ �� �ִ� �÷��ǿ� �߰�
				ChatService cs = new ChatService(s);
//				�ߺ� ������ �˻��ϱ�
				setConnection(cs);
				
				connList.add(cs);
				
//				�������ӻ�鿡�� ���� �˸�
				cs.setAllMessage("CONGU*"+ cs.username +"���� �����Ͽ����ϴ�.");//CONGU* -> ������ �˸�
//				�ο���
				cs.setAllMessage("[CC$@&]"+connList.size());
				
//				�ο���
				cs.setAllMessage(getAllusername());
				
//				������ ����
				
			}
			
			
		}catch (Exception e) {}
		
	}
//	��� ������ ��� �˾ƿ���
	public String getAllusername() {
		String usernameList = "[User]";
		for(int i=0; i<connList.size(); i++) {
			ChatService cs = connList.get(i);
			usernameList += cs.username+"/";
			
			
		}
		return usernameList;
		
	}
//	
	
	public void setConnection(ChatService cs) {
		for(int i=0; i<connList.size(); i++) {
			ChatService cs2 = connList.get(i);
			if(cs.username.equals(cs2.username)) {
				connList.remove(i);
				break;
			}
		}
}


//	������ 1�������� ���� Ŭ����
	class ChatService {
		Socket s;
		BufferedReader br;
		PrintWriter pw;	
		String username;
		InetAddress ia;
		
		ChatService() {}
		ChatService(Socket s) {
			this.s = s;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
			ia = s.getInetAddress();
			username = ia.getHostAddress();//����ڸ�				
		}catch(Exception e) {
			}	
		}//chatservice()
		
		public void run() {
			try {
				String clientMsg = br.readLine();
						if(clientMsg != null) {
							setAllMessage("[CMsg]["+username+"��]"+ clientMsg);
					}
			}catch (Exception e) {
				
				
			}
		}
		
		
//		���������� ��� �����ڿ��� ����������
			public void setAllMessage(String msg) {
				System.out.println("����");
				for(int i=0; i<connList.size(); i++) {
					ChatService cs = connList.get(i);
				try {
					cs.pw.println(msg);
					cs.pw.flush();
					
				}catch(Exception e) {
					connList.remove(i);
					i--;
					
				}
			}
		}
	}//chatService
	public static void main(String[] args) {
		new ChatServer();
		}
}
			
