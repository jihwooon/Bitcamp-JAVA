package java11_jdbc;

public class UpdateTest extends DBConnection {
	SelectTest st = new SelectTest();
	
	
	public UpdateTest() {
		start();	
	}
	public void start() {
		st.start();
		try {
			getConn();
			
			String sql = "update member set tel=?, email=?, addr=? where num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "010-9999-9999");
			pstmt.setString(2, "zzzzzzz@gmail.com");
			pstmt.setString(3, "서울시 강서구");
			pstmt.setInt(4, 1);
			
			//실행
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("수정되었습니다.");
			}else {
				System.out.println("수정실패하였습니다.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			getClose();
		}
		
	}
	public static void main(String args[]) {
		new UpdateTest();
	
	}
}
