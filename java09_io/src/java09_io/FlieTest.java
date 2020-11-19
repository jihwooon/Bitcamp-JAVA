package java09_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FlieTest {

	public FlieTest() {

//						  D:\workspacelava\java_basic\src   \n   \t   \"
		File f1 = new File("D:/workspacelava/java_basic/ArraysTest.java"); // 절대주소지정 방식
		File f2 = new File("D:/workspacelava/javaAPI/src/javaAPI/CalendarTest.java");
		File f3 = new File("D:/workspacelava/javaAPI");
		File f4 = new File(f3, "RandomTest.java");

		File f5 = new File("D:/javaFolder/a/b/c");
		// exits() : 폴더 혹은 파일이 존재하는지 확인해주는 메소드(있으면 true, 없으면 false)
		if (!f5.exists()) {
			if (f5.mkdir()) {// 폴더생성
				System.out.println("폴더가 생성되었습니다.");

			} else {
				System.out.println("폴더생성 실패하였습니다..");

			}
		}
		// 파일생성하기

		try {
			File f6 = new File("D:/javaFolder/test.txt");

			if (!f6.exists()) {
				if (f6.createNewFile()) {
					System.out.println("파일이 생성 되었습니다.");
				} else {
					System.out.println("파일생성 실패하였습니다.");
				}
			}

			// 마지막 수정일
			long lastDate = f2.lastModified();
			System.out.println("lastDate" + lastDate);

			Calendar date = Calendar.getInstance();
			System.out.println("오늘 밀리초=" + date.getTimeInMillis());

			date.setTimeInMillis(lastDate);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String dateStr = format.format(date.getTime());
			System.out.println("마지막 수정일=" + dateStr);

			System.out.println("exe=" + f2.canExecute());
			System.out.println("read=" + f2.canRead());
			System.out.println("write=" + f2.canWrite());

			// 특정 폴더내의 모든 파일과 모든 폴더정보를 얻어오기
			File f7 = new File("D://");
			File f8[] = f7.listFiles();
			for (File f : f8) {
//				get Name():파일명, getParent() : 폴더, getPath():폴더+파일명

				if (f.isDirectory()) {
					System.out.println(f.getPath() + "[폴더]");

				} else if (f.isFile()) {
					System.out.println(f.getPath() + "[파일]");

				}
			}

			// length() : 파일의 바이트 크기를 구한다.
			System.out.println("f2.length()=" + f2.length() + "byte");

			// 현재컴퓨터의 드라이브 목록 구하기
			File root[] = File.listRoots();
			for (File f : root) {
				System.out.println("드라이브->" + f.getPath());
			}
			// 파일삭제
			File f9 = new File("D:/asd1");
			if (f9.delete()) {
				System.out.println("파일이 삭제되었습니다.");
			} else {
				System.out.println("파일이 삭제 실패하였습니다.");
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new FlieTest();

	}

}
