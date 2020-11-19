package java11_jdbc;

import java.sql.SQLException;

public class TransactionTest extends DBConnection{
	
	public TransactionTest() {
		
	}

//	�ڹٿ��� �����ͺ��̽� ���ڵ� �߰�, ����, ������ �ڵ� Commit�� ����ȴ�.
//	�ڵ� Commit�� ��ü�ϰ� �۾��� �Ϸ�Ǹ� Commit�� �����ϰ�
//	�����߻��� rollback����

	public void start() {
		try {
			getConn();
			conn.setAutoCommit(false);//�ڵ�Ŀ����ü
//			1.
			String sql = "insert into member(num, username, tel, email, addr) "
					+ "values(7,'xxxx', '010-1111-1111','abcd@nate.com','����� ���ı�')";
			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("ù��° ���ڵ� �߰� ����");
			}else {
				System.out.println("ù��° ���ڵ� �߰� ����");			
			}
			//2.
			sql = "insert into member(num, username, tel, email, addr) "
					+ "values(16,'YYYY', '010-2222-2222','yyyyyyy@nate.com','����� ������')";
			pstmt = conn.prepareStatement(sql);
			cnt = pstmt.executeUpdate();
			
			if(cnt>0) {
				System.out.println("�ι�°���ڵ� �߰� ����");
				
			}else {
				System.out.println("�ι�°���ڵ� �߰� ����");
			}
			
			conn.commit();//Ŀ�Լ���
			
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
