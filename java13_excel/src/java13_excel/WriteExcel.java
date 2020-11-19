package java13_excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*
 * POI�ٿ�ε�
 * jakarta.apache.org���� poi-4.1.2-20200217.zip �ٿ�ε�
 * 
 * poi-4.1.2.jar, commons-math3-3.6.1.jar BuildPath �����Ѵ�.
 */

public class WriteExcel {

	public WriteExcel() {}

	public void start() {
		// ������ ����
		// 1. workbook��ü ����

		HSSFWorkbook workbook = new HSSFWorkbook();
		// 2. sheet��ü ����
		HSSFSheet sheet1 = workbook.createSheet("ȸ�����");
		HSSFSheet sheet2 = workbook.createSheet();

		// 3. row��ü
		HSSFRow row1 = sheet1.createRow(0);
		HSSFCell cell = row1.createCell(0);

		cell.setCellValue("��ȣ");

		row1.createCell(1).setCellValue("�̸�");
		row1.createCell(2).setCellValue("����ó");

		String data[][] = {{ "1", "ȫ�浿", "010-1234-5678" }, { "2", "�̼���", "010-9153-4565" },
				{ "3", "������", "010-4567-4335" }};

//							 3
		for (int i = 1; i <= data.length; i++) {
			HSSFRow row = sheet1.createRow(i);
//				0~2
			for (int j = 0; j < data[i-1].length; j++) {
				HSSFCell cell2 = row.createCell(j);
				if (j == 0) {
					cell2.setCellValue(Integer.parseInt(data[i - 1][j]));
				} else {
					cell2.setCellValue(data[i - 1][j]);
				}
			}
		}

///////////////////////////////////////////////////////////////////////

//	5.���Ϸ� ����
		try {
			File f = new File("D://javaFolder/member.xls");
			FileOutputStream fos = new FileOutputStream(f);

			workbook.write(fos);
			workbook.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			System.out.println("������ ���Ⱑ �Ϸ�Ǿ����ϴ�.");
	}

	
	public static void main(String[] args) {
		new WriteExcel().start();
	}
}
