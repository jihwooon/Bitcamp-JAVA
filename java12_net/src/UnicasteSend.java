import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UnicasteSend {

	DatagramSocket ds;
	InetAddress ia;
	DatagramPacket dp;
	
	
	public UnicasteSend() {
		
	}

	public void start() {
//		UDP��� -> Unicaste��� 1:1
		
		
		try {
			
			
			ia = InetAddress.getByName("106.240.16.163");
			ds = new DatagramSocket();

			String data = "Spring FrameWork, ������ �����ӿ�ũ";
			System.out.println(data);

//			���������͸� Packet���� �����Ѵ�.
//								���� ������

			dp = new DatagramPacket(data.getBytes(), data.getBytes().length, ia, 12000);
			
			
			
//			������ ������
			ds.send(dp);
			System.out.println("���ۿϷ�.....");
			
		}catch(Exception e) {
			
		}
	}

	
	public static void main(String[] args) {
		new UnicasteSend().start();

	}
}
