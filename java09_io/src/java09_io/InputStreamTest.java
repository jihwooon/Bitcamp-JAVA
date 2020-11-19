package java09_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		try {
		//input, output : byte
		//reader, writer : char
		
		//byte������ �ֿܼ��������� �Է� �޴� Ŭ����
		InputStream in = System.in;
		
		System.out.print("�Է�");
		while(true) {
			int data = in.read();
			if(data == 13)break;
			System.out.println(data+(char)data);
		}

//		byte data[] = new byte[10];
//		int cnt = in.read(data);
//		System.out.println(cnt+"-->"+ new String(data,0,5,cnt-2)+"===");
		
		
//		byte data[] = new byte[10];
//		int cnt = in.read(data, 3, 5);
//		System.out.println(cnt+"-->"+ new String(data)+"---");
		
		
		System.out.println("end...");		
	}catch(IOException io) {
			io.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		new InputStreamTest();
	}

}
