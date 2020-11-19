
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

	public ServerSocketTest() {
		// 접속을 대기한 후 접속하면 Socket 객체를 얻을 수 있다.

		try {
			ServerSocket ss = new ServerSocket(20000);

			// 접속대기 : 접속자의 ip
			System.out.println("Server Start.....");
			
			while(true) {
			
			System.out.println("접속대기중.....");
			Socket socket = ss.accept(); //

			// 접속자으 InetAddress객체
			InetAddress ia = socket.getInetAddress();
			System.out.println(ia.getHostAddress() + "님이 접속하였습니다..");

			
			//접속자에게 문자 보내기
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			pw.println("서버에 접속되었습니다... 환영합니다...");// 문자 보내기
			pw.flush();

			
			// 클라이언트가 보낸 문자 받기
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String msg = br.readLine();
			System.out.println("클라이언트에게 받은 문자");

			System.out.println("프로그램이 종료 되었습니다.");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ServerSocketTest();

	}

}
