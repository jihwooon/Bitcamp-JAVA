package java12_net;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//레코드 수를 받는다.

public class InsertTest {
	Scanner scan = new Scanner(System.in);
	static {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException c) {
			System.out.println("드라이브 에러발생...."+c.getMessage());
		}	
	}
	Connection conn;
	PreparedStatement pstmt;
	public InsertTest() {
//		jdbc 드라이브 등록
//		try {
//		Class.forName("oracal.jdbc.driver.OracleDriver");
//		}catch(ClassNotFoundException c) {
//			System.out.println("드라이브 에러발생...."+c.getMessage());
//		}	
//		int a = b + c;
}

	/*
	 *  java에서 database 사용하기
	 *  1. 자바가상머신에 jdbc 드라이브 등록
	 *  2. 데이터베이스 연결
	 *  3. 쿼리문을 작성하여 PreparedStatement객체 생성  
	*/
	
	public void start() {
		
		while(true) {	
			try {
				//입력
				System.out.print("번호=");
				int num = Integer.parseInt(scan.nextLine());			
				System.out.print("이름=");
				String username = scan.nextLine();
				System.out.print("연락처=");
				String tel = scan.nextLine();
				System.out.print("이메일=");
				String email = scan.nextLine();
				System.out.print("주소=");
				String addr = scan.nextLine();
				
				
//				데이터베이스 연결					서버:port:
				String url = "jdbc:oracle:thin:@192.168.0.235:1521:xe";
				conn = DriverManager.getConnection(url, "scott", "tiger");
				
//				쿼리문 작성
				 String sql = "insert into member(num, username, tel, email, addr, writedate)"
						 + "values(?,?,?,?,?,sysdate)";
				 
				pstmt = conn.prepareStatement(sql);
				//?에 대입될 데이터를 셋팅한다.
				pstmt.setInt(1, num);
				pstmt.setString(2, username);
				pstmt.setString(3, tel);
				pstmt.setString(4, email);
				pstmt.setString(5, addr);

// 				실행
				int cnt = pstmt.executeUpdate();
				if(cnt>0) {
					System.out.println("레코드가 추가되었습니다.");
				}else {
					System.out.println("레코드가 추가실패하였습니다.");
				}								
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				
				
//			DB닫기
		
				if(pstmt!=null) {
					try {pstmt.close();}catch(SQLException s) {}
		
			}
				if(conn!=null) {
					try {conn.close();}catch(SQLException e) {}
			}
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
				
			}catch(SQLException s) {
				System.out.println("DB닫기 에러발생..");
				}	
			}
		}
	}

	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.start();
	}
}
