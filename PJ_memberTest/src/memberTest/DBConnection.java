package memberTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBConnection {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott"; 
	String password = "tiger";
	

//	jdbc드라이브 로딩 로딩 입력
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
		}catch(ClassNotFoundException cnfe){
			System.out.println("JDBC Driver로딩 에러-->" + cnfe.getMessage());
		}
	}
	
	
//DB 불러오기
	
	public void getConn() {
		try {
			conn = DriverManager.getConnection(url, userid, password);
			
		}catch (SQLException se) {
			System.out.println("DB연결에러 발생-->"+se.getMessage());
		}
	}
	

//DB닫기
	public void getClose() {
		try {
			if(rs!=null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null) conn.close();
			
		}catch(SQLException se) {
			System.out.println("DB닫기 에러발생 -->"+ se.getMessage());
		}
	}	
}
	
	


