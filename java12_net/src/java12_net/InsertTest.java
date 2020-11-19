package java12_net;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//���ڵ� ���� �޴´�.

public class InsertTest {
	Scanner scan = new Scanner(System.in);
	static {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException c) {
			System.out.println("����̺� �����߻�...."+c.getMessage());
		}	
	}
	Connection conn;
	PreparedStatement pstmt;
	public InsertTest() {
//		jdbc ����̺� ���
//		try {
//		Class.forName("oracal.jdbc.driver.OracleDriver");
//		}catch(ClassNotFoundException c) {
//			System.out.println("����̺� �����߻�...."+c.getMessage());
//		}	
//		int a = b + c;
}

	/*
	 *  java���� database ����ϱ�
	 *  1. �ڹٰ���ӽſ� jdbc ����̺� ���
	 *  2. �����ͺ��̽� ����
	 *  3. �������� �ۼ��Ͽ� PreparedStatement��ü ����  
	*/
	
	public void start() {
		
		while(true) {	
			try {
				//�Է�
				System.out.print("��ȣ=");
				int num = Integer.parseInt(scan.nextLine());			
				System.out.print("�̸�=");
				String username = scan.nextLine();
				System.out.print("����ó=");
				String tel = scan.nextLine();
				System.out.print("�̸���=");
				String email = scan.nextLine();
				System.out.print("�ּ�=");
				String addr = scan.nextLine();
				
				
//				�����ͺ��̽� ����					����:port:
				String url = "jdbc:oracle:thin:@192.168.0.235:1521:xe";
				conn = DriverManager.getConnection(url, "scott", "tiger");
				
//				������ �ۼ�
				 String sql = "insert into member(num, username, tel, email, addr, writedate)"
						 + "values(?,?,?,?,?,sysdate)";
				 
				pstmt = conn.prepareStatement(sql);
				//?�� ���Ե� �����͸� �����Ѵ�.
				pstmt.setInt(1, num);
				pstmt.setString(2, username);
				pstmt.setString(3, tel);
				pstmt.setString(4, email);
				pstmt.setString(5, addr);

// 				����
				int cnt = pstmt.executeUpdate();
				if(cnt>0) {
					System.out.println("���ڵ尡 �߰��Ǿ����ϴ�.");
				}else {
					System.out.println("���ڵ尡 �߰������Ͽ����ϴ�.");
				}								
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				
				
//			DB�ݱ�
		
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
				System.out.println("DB�ݱ� �����߻�..");
				}	
			}
		}
	}

	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.start();
	}
}
