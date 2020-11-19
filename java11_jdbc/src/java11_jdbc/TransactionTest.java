package java11_jdbc;

import java.sql.SQLException;

public class TransactionTest extends DBConnection{
	
	public TransactionTest() {
		
	}

//	자바에서 데이터베이스 레코드 추가, 수정, 삭제는 자동 Commit이 실행된다.
//	자동 Commit을 해체하고 작업이 완료되면 Commit을 실행하고
//	에러발생시 rollback실행

	public void start() {
		try {
			getConn();
			conn.setAutoCommit(false);//자동커밋해체
//			1.
			String sql = "insert into member(num, username, tel, email, addr) "
					+ "values(7,'xxxx', '010-1111-1111','abcd@nate.com','서울시 송파구')";
			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("첫번째 레코드 추가 성공");
			}else {
				System.out.println("첫번째 레코드 추가 실패");			
			}
			//2.
			sql = "insert into member(num, username, tel, email, addr) "
					+ "values(16,'YYYY', '010-2222-2222','yyyyyyy@nate.com','서울시 성동구')";
			pstmt = conn.prepareStatement(sql);
			cnt = pstmt.executeUpdate();
			
			if(cnt>0) {
				System.out.println("두번째레코드 추가 성공");
				
			}else {
				System.out.println("두번째레코드 추가 실패");
			}
			
			conn.commit();//커밋설정
			
		}catch(Exception e) {
			try {
				conn.rollback();
			}catch(SQLException se) {}
				e.printStackTrace();
		}finally {
			getClose();
		}	
	}

	public static void main(String[] args) {
		new TransactionTest().start();
				
	}
}
