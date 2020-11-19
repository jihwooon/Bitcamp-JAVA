import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FlieUnicasteReceive {
	DatagramSocket ds;
	DatagramPacket dp;
	FileOutputStream os;

	public FlieUnicasteReceive() {
	}

	public void start() {

		try {
			DatagramSocket ds = new DatagramSocket(15000);

			byte data[] = new byte[512];
			DatagramPacket dp = new DatagramPacket(data, 0, data.length);
			FileOutputStream os = null;

			while (true) {
				System.out.println("전송받기 대기중....");
				ds.receive(dp);

				byte receiveData[] = dp.getData();
				int length = dp.getLength();

				String dataStr = new String(receiveData, 0, length);
				System.out.println(dataStr);

				if (length > 12) {
//					파일명 [*filename*]aaaa.png
					if (dataStr.substring(0, 12).equals("[*filename*]")) {
//						outstream
						os = new FileOutputStream(new File("D://javaFolder", dataStr.substring(12)));
					} else if (dataStr.substring(0, 12).equals("[*lastdata*]")) {
						os.close();
						System.out.println("파일전송완료...");

					} else {// 파일내용
						fileWrite(receiveData, length);
					}

				} else {
//					파일내용
					fileWrite(receiveData, length);
				}
			}

		} catch (Exception e) {

		}

	}

	public void fileWrite(byte data[], int len) {
		try {
			os.write(data, 0, len);

		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		new FlieUnicasteReceive().start();

	}
}
