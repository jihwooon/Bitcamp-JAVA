import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MuticasteReceive {

	InetAddress ia;
	MulticastSocket ms;
	DatagramPacket dp;

	public MuticasteReceive() {

	}

	public void start() {
		try {
			ia = InetAddress.getByName("230.1.1.9");
			ms = new MulticastSocket(20000);

			ms.joinGroup(ia);// 소켓이 ia를 조인한다.

			// 받기 대기
			byte[] data = new byte[512];
			dp = new DatagramPacket(data, data.length);

			System.out.println("대기중");
			ms.receive(dp);

//			전송받은 경우
			byte rData[] = dp.getData();
			int len = dp.getLength();
			System.out.println("받은 문자=" + new String(rData, 0, len));
			ms.close();

		} catch (Exception e) {	}

	}

	public static void main(String[] args) {
		new MuticasteReceive().start();

	}

}
