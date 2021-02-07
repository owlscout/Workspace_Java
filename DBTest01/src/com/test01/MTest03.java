package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest03 {

	//DEPTNO를 입력받아서, 해당 부서번호의 모든 정보 출력
	// SELECT DEPTNO, DNAME, LOC
	// FROM DEPT
	// WHERE DEPTNO = ??
	public static void main(String[] args) {
		try {
			selectOne();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void selectOne() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호를 입력하세요 : ");
		int deptno = sc.nextInt();
		// 1. 드라이버 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2.계정연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url, user, password);
		// 3. 쿼리준비
		String sql = " SELECT DEPTNO, DNAME, LOC " // 이걸 밑에 executeQuery(sql)
				+ " FROM DEPT "						// sql대신 에 넣어도 된다
				+ " WHERE DEPTNO = " +deptno;
		Statement stmt = con.createStatement();
		System.out.println("부서번호 \t 부서이름 \t \t 도시");
		// 4. 쿼리 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {						// 한줄만 가져오지만 무조건 써야하는것이다. if로 해도되지만.
		System.out.println(rs.getInt("DEPTNO")+"\t"+ rs.getString("DNAME")+"\t" + rs.getString("LOC"));
		}
		// 5. db종료
		rs.close();
		stmt.close();
		con.close();
	}
}
