package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ojdbc6.jar(꼭! 추가해야한다!!) -> oracle.jdbc.driver.OracleDriver
		// 1. DRIVER 연결	 		
		Class.forName("oracle.jdbc.driver.OracleDriver"); 	//자바랑 db를 연결할꺼다 ojdbc6 라는 db에서 가지고올꺼다
		
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 어떤 db에 연결할껀지 
		String user = "kh";									// 아이디
		String password = "kh";								// 비밀번호
		
		Connection con = DriverManager.getConnection(url, user, password); 
							// db랑 연결해서 연결 정보 가지는 것
							// 자바랑 db랑 연결했습니다.
		// 3. QUERY 준비
		String sql = " SELECT * FROM EMP "; 				// " " 쿼리쓸때는 무조건 공백 앞뒤로 하나씩 넣어야한다.!!!
		Statement stmt = con.createStatement();				//  실행시켜줄 객체 만든다, 담을 곳을 만든다. 
		
		// 4. QUERY 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);				// 스테이츠먼트를 실행
		while (rs.next()) {									// 뒤에꺼가 있으면 계속 호출(소환)해줌
			System.out.printf("%5d %11s %9s %5d %15s %8.2f %8.2f %2d \n",	//desc emp; 해서보면 나오는거에 맞춰서 타입에 따라 적는다.
					rs.getInt(1), rs.getString(2), rs.getString("JOB"), rs.getInt(4), rs.getDate(5), rs.getDouble("SAL"), rs.getDouble(7), rs.getInt(8));
		}
		
		
		// 5. DB 종료
		rs.close();		// 열은거 마지막부터 닫아준다.
		stmt.close();
		con.close();
		
	}

}
