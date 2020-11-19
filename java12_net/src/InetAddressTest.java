

import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
	}

	public void start() {
		
		
		try {
			//ip, domain�� �̿��Ͽ� inetAddress��ü�� �����Ͽ� ����Ѵ�.
			
			//����ǻ���� �������� ������
			
			InetAddress ia1 = InetAddress.getLocalHost();
			String hostName = ia1.getHostName();	//domain, domain�� ������� ��ǻ���̸��� ���Ѵ�.
			String address = ia1.getHostAddress();//ip
			System.out.println(hostName+","+address);
			
			//url�ּҸ� �̿��� InetAddress ��ü���ϱ�
			InetAddress ia2 = InetAddress.getByName("www.naver.com");
			System.out.println("ia2.address="+ia2.getHostAddress()); //ip
			System.out.println("ia2.name="+ia2.getHostName()); //������
			
			//210.89.164.90 ���̹� ip
			//ip�� �̿��� InetAddress ��ü����
			InetAddress ia3 = InetAddress.getByName("210.89.164.90");
			System.out.println("ia3.address="+ia3.getHostAddress());
			System.out.println("ia3.name="+ia3.getHostName());
			
			
			//ip�� �������϶�
			InetAddress ia4[] = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("-------------------------------------");
			for(InetAddress ia : ia4) {
				System.out.println("ia.name="+ia.getHostName());
				System.out.println("ia.address="+ia.getHostAddress());
			}
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		new InetAddressTest().start();

	}
}