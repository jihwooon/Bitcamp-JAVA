package java13_excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ReadExcel {

	public ReadExcel() {}

	
	public void start() {
		//�������� ������ �о����
//		1.excel������ FileInputStream�� �����Ѵ�.
	try {
		
		File f = new File("D://javaFolder/member.xls");
		FileInputStream fis = new FileInputStream(f);
	
//		2.
		POIFSFileSystem system = new POIFSFileSystem(fis);
		
		
//		3.workbook��ü ������
		HSSFWorkbook workbook = new HSSFWorkbook(system);		
		
//		4.sheet ��ü������
		HSSFSheet sheet = workbook.getSheet("ȸ�����"); //workbook.getSheetat(0);
		
//		�������
		System.out.println("��ȣ\t �̸�\t ����ó");
		
//		��Ʈ�� ���ڵ�� ���ϱ�
		int rowCount = sheet.getPhysicalNumberOfRows();
//		System.out.println("���� ��="+rowCount);
		
//		���� �� ��ŭ �ݺ�
		for(int r=1; r<rowCount; r++) {
//			�౸�ϱ�
			HSSFRow row = sheet.getRow(r);
			int cellCount = row.getPhysicalNumberOfCells();//���� �� ���ϱ�
			for(int c=0; c<cellCount; c++) { //0,1,2,3
				if(c==0) { // ���ڵ����� �о����
					double num = row.getCell(c).getNumericCellValue();
					System.out.print(num+"\t");
				}else { //���ڵ����� �о����
					String data = row.getCell(c).getStringCellValue();
					System.out.print(data+"\t");
				}		
			}
			System.out.println();
		}
		
			system.close();
			fis.close();
		}catch (Exception e) {
			e.printStackTrace();	
		
		}	
	}

	
	
	
	public static void main(String[] args) {
		new ReadExcel().start();		
	}
}