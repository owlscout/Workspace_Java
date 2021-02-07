package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택");
		System.out.println("1:전체선택 2:특정 부서 선택 3: 부서 추가 4: 부서 수정 5: 부서 삭제 6: 종료");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			selectList();
			break;
		case 2:
			selectOne();
			break;
		case 3:
			insert();
			break;
		case 4:
			update();
			break;
		case 5:
			delete();
			break;
		default:
			System.out.println("종료");
		}
	}
		
	
		
	

	
	public static void selectList() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql = " SELECT DEPTNO, DNAME, LOC " + " FROM DEPT ";
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println("DEPTNO \t   DNAME \t   LOC");
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void selectOne() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("부서번호를 입력하세요 : ");
		int deptno = sc.nextInt();
		String sql = " SELECT DEPTNO, DNAME, LOC " + " FROM DEPT " + " WHERE DEPTNO = " + deptno;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt("DEPTNO") + "\t" + rs.getString("DNAME") + "\t" + rs.getString("LOC"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void insert() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("부서번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 입력 : ");
		String dname = sc.next();
		System.out.println("지역 이름 : ");
		String loc = sc.next();
		
		String sql = " INSERT INTO DEPT " + " VALUES (?, ?, ?) ";
		PreparedStatement pstm = null;

		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, deptno);
			pstm.setString(2, dname);
			pstm.setString(3, loc);

			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("입력 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void update() {
		
		
		//1. 드라이버 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("수정할 부서번호 : ");
		int deptno = sc.nextInt();
		System.out.println("수정할 부서 이름 : ");
		String dname = sc.next();
		System.out.println("수정할 부서 지역 : ");
		String loc = sc.next();
		
		String sql = " UPDATE DEPT " 
					+ " SET DNAME = ?, LOC = ? "
					+ " WHERE DEPTNO = ? ";
		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dname);
			pstm.setString(2, loc);
			pstm.setInt(3, deptno);
			
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("수정 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void delete() {
		
		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("지우려는 부서 번호 : ");
		int deptno = sc.nextInt();
		
		String sql = " DELETE FROM DEPT " 
				+ " WHERE DEPTNO = ? ";

		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, deptno);
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("삭제 성공");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
