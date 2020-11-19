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
//	접속사 목록을 보관할 컬렉션
	
	ArrayList<ChatService> connList = new ArrayList<ChatService>();
	ServerSocket ss;

	public ChatServer()  {
		this.start();
		
	}

//	접속대기 쓰레드
	public void run() {
		try {
			ss = new ServerSocket(9999);
			
			while(true) {
				System.out.println("Server Start");
				System.out.println("접속대기중....");
				Socket s = ss.accept();
//				접속사 관리할 수 있는 컬렉션에 추가
				ChatService cs = new ChatService(s);
//				중복 아이피 검사하기
				setConnection(cs);
				
				connList.add(cs);
				
//				현재접속사들에게 접속 알림
				cs.setAllMessage("CONGU*"+ cs.username +"님이 접속하였습니다.");//CONGU* -> 접속자 알림
//				인원수
				cs.setAllMessage("[CC$@&]"+connList.size());
				
//				인원수
				cs.setAllMessage(getAllusername());
				
//				스레드 구현
				
			}
			
			
		}catch (Exception e) {}
		
	}
//	모든 접속자 목록 알아오기
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


//	접속자 1명정보를 가진 클래스
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
			username = ia.getHostAddress();//사용자명				
		}catch(Exception e) {
			}	
		}//chatservice()
		
		public void run() {
			try {
				String clientMsg = br.readLine();
						if(clientMsg != null) {
							setAllMessage("[CMsg]["+username+"님]"+ clientMsg);
					}
			}catch (Exception e) {
				
				
			}
		}
		
		
//		현재접속한 모든 접속자에게 정보보내기
			public void setAllMessage(String msg) {
				System.out.println("ㅈㄹ");
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
			
