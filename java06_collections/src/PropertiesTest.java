import java.util.Enumeration;
import java.util.Properties;


public class PropertiesTest {

	public PropertiesTest() {
		//properties Ŭ���� ���ڿ��� �� key, value�� ����ϴ� �÷����̴�.
		//url �ּ� ����
		
		Properties prop = new Properties();
		prop.setProperty("����Ʈ","nate.com");
		prop.setProperty("����", "daum.net");
		prop.setProperty("���̹�", "naver.com");
		prop.setProperty("�����û", "seoul.go.kr");
		
		String domain = prop.getProperty("���̹�");
		System.out.println("���̹�="+domain);
	
		
		Enumeration keyList = prop.propertyNames();
		while(keyList.hasMoreElements()) {
			String str = (String)keyList.nextElement();
			System.out.println(str+"----->"+ prop.getProperty(str));
		}
	}

	
	public static void main(String[] args) {
		new PropertiesTest();
	
	
	}

}
