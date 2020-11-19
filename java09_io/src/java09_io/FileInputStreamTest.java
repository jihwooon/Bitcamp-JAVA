package java09_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public FileInputStreamTest() {
	
		try {
			
			File file = new File("D://workspacelava/javaAPI/src/javaAPI/CalendarTest.java");
			
			FileInputStream fis = new FileInputStream(file);
			
			while(true) {
				int inData = fis.read();
				if(inData==-1) {break;} // End of File
				System.out.print((char)inData);
			}
			
		
		}catch(IOException e) {
			e.printStackTrace();
		
		
		}
	}

	public static void main(String[] args) {
		new FileInputStreamTest();
	}

}
