

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	
	

	public URLTest() {
		start();
		
	}

	
	public void start () {
		try {
			
			URL url= new URL("https://www.naver.com");
			System.out.println("protocal="+ url.getProtocol());
			System.out.println("host="+ url.getHost());
			System.out.println("path="+ url.getPath());
			System.out.println("port="+ url.getPort());
			System.out.println("filename"+ url.getFile());
			
//			Page Header ��ü ������
//			URL��ü�� �̿��Ͽ� URLConnection ��ü�� �����Ѵ�.
			URLConnection connection = url.openConnection();
			connection.connect();//���ä��Ȯ��
			
			
			String contentType = connection.getContentType();//�ش����� ������
			System.out.println("-->"+contentType);
				
			
			int idx = contentType.indexOf("charset=");
			String code = contentType.substring(idx+8);
			System.out.println("code="+code);
			
			InputStream is =url.openStream();
			InputStreamReader isr = new InputStreamReader(is,code);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String inData = br.readLine();
				if(inData==null) break;
				System.out.println(inData);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new URLTest();
	
	}
}
