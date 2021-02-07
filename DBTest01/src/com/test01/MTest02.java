package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest02 {

	public static void main(String[] args) {
		
		//DEPT 테이블에 있는 모든 값을 출력해보자.
		try {
			selectList();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void selectList() throws ClassNotFoundException, SQLException {
		
		//1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url, user, password);
		//3. 쿼리준비
		String sql = " SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT ";
		Statement stmt = con.createStatement();
		System.out.println("DEPTNO \t   DNAME \t   LOC");
		//4. 쿼리 실행 및 리컨
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getInt("DEPTNO") + "\t" + rs.getString(2) + "\t" + rs.getString(3));
		}
		
		//5. db 종료
		rs.close();
		stmt.close();
		con.close();
		
	}
	
}
