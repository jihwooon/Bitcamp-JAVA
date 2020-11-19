package java09_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferdReaderFileTest {

	public BufferdReaderFileTest() {
		
		
		
		try {
			File f = new File("d://javaDev/javaApi","CalendarTest.java");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String txt = br.readLine();
				if(txt==null) break;
				System.out.println(txt);
			}			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("The End....");
	}

	
	public static void main(String[] args) {
		new BufferdReaderFileTest();
	}

}
