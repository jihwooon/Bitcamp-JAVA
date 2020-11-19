package java11_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectTest {

	
	//
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (Exception e) {
			System.out.println("����̺�ε�");
		}
	}
	
	
	// �����ͺ��̽� �ҷ����� �Է�
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String password = "tiger";

	
	

	
	
	public SelectTest() {}
	public void start() {
		try {

			// 2.
			con = DriverManager.getConnection(url, userid, password);

			// 3.
			String sql = "select num, username, tel, email, addr,"
					+ " to_char(writedate, 'MM-DD') writedate from member order by num";
			pstmt = con.prepareStatement(sql);

			// 4.����
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int num = rs.getInt(1);// rs.getInt("num")
				String username = rs.getString(2);
				String tel = rs.getString(3);
				String email = rs.getString(4);
				String addr = rs.getString(5);
				String writedate = rs.getString(6);

				System.out.printf("%4d %8s %16s %20s %20s %20s\n", num, username, tel, email, addr, writedate);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();

				} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		SelectTest st = new SelectTest();
		st.start();

	}
}
