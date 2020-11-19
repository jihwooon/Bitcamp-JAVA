
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
		// ������ ����� �� �����ϸ� Socket ��ü�� ���� �� �ִ�.

		try {
			ServerSocket ss = new ServerSocket(20000);

			// ���Ӵ�� : �������� ip
			System.out.println("Server Start.....");
			
			while(true) {
			
			System.out.println("���Ӵ����.....");
			Socket socket = ss.accept(); //

			// �������� InetAddress��ü
			InetAddress ia = socket.getInetAddress();
			System.out.println(ia.getHostAddress() + "���� �����Ͽ����ϴ�..");

			
			//�����ڿ��� ���� ������
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			pw.println("������ ���ӵǾ����ϴ�... ȯ���մϴ�...");// ���� ������
			pw.flush();

			
			// Ŭ���̾�Ʈ�� ���� ���� �ޱ�
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String msg = br.readLine();
			System.out.println("Ŭ���̾�Ʈ���� ���� ����");

			System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ServerSocketTest();

	}

}
