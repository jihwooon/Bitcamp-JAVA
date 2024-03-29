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
		//엑셀에서 데이터 읽어오기
//		1.excel파일을 FileInputStream을 생성한다.
	try {
		
		File f = new File("D://javaFolder/member.xls");
		FileInputStream fis = new FileInputStream(f);
	
//		2.
		POIFSFileSystem system = new POIFSFileSystem(fis);
		
		
//		3.workbook객체 얻어오기
		HSSFWorkbook workbook = new HSSFWorkbook(system);		
		
//		4.sheet 객체얻어오기
		HSSFSheet sheet = workbook.getSheet("회원목록"); //workbook.getSheetat(0);
		
//		제목출력
		System.out.println("번호\t 이름\t 연락처");
		
//		시트의 레코드수 구하기
		int rowCount = sheet.getPhysicalNumberOfRows();
//		System.out.println("행의 수="+rowCount);
		
//		행의 수 만큼 반복
		for(int r=1; r<rowCount; r++) {
//			행구하기
			HSSFRow row = sheet.getRow(r);
			int cellCount = row.getPhysicalNumberOfCells();//셀의 수 구하기
			for(int c=0; c<cellCount; c++) { //0,1,2,3
				if(c==0) { // 숫자데이터 읽어오기
					double num = row.getCell(c).getNumericCellValue();
					System.out.print(num+"\t");
				}else { //문자데이터 읽어오기
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
