package java09_io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputOutputStream {

	public DataInputOutputStream() {
		//기본 데이터 타입으로 공간을 확보해 파일로 데이터 저장하기 
		int dataInt = 12345;
		double dataDouble = 5678.2345;
		boolean dataBoolean = true;
		char dataChar = '한';
		
		try {
			File f = new File("D://javaFolder/dataOutput.txt");
//			FileOutputStream fos = new FileOutputStream(f);//파일쓰기
//			DataOutputStream dos = new DataOutputStream(fos); //데이터의 크기만큼 공간 확보후 쓰기 
//			dos.writeInt(dataInt);
//			dos.writeDouble(dataDouble);
//			dos.writeBoolean(dataBoolean);
//			dos.writeChar(dataChar);
//			dos.close();
			
			//DataInputStream: 데이터형으로 저장된 내용 읽어오기 
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			
			int readInt = dis.readInt();
			double readDouble = dis.readDouble();
			boolean readBoolean = dis.readBoolean();
			char readChar = dis.readChar();
			
			System.out.println("int="+ readInt);
			System.out.println("double="+ readDouble);
			System.out.println("bolean=" + readBoolean);
			System.out.println("char=" + readChar);
			
			
		}catch(Exception e) {
		
		}
	}

	public static void main(String[] args) {
		new DataInputOutputStream();
	}

}
