package com.dao;

import static com.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.MYTestDto;

// Data Access Object : DB와 접근하는 객체.
// import static : class.method 하고 호출 할 때, class 생략
public class MYTestDao {

	// 전체 출력 // select 하면 rs값에 나온다.
	public List<MYTestDto> selectList() {
		// 1. 2.
		Connection con = getConnection();
		String sql = " SELECT MNO, MNAME, NICKNAME " + " FROM MYTEST ";
		Statement stmt = null;
		ResultSet rs = null;
		List<MYTestDto> list = new ArrayList<MYTestDto>();
		try {
			// 3.
			stmt = con.createStatement();

			// 4.
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MYTestDto temp = new MYTestDto();
				temp.setMno(rs.getInt("MNO"));
				temp.setMname(rs.getString("MNAME"));
				temp.setNickname(rs.getString("NICKNAME"));
				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}

		return list;
	}

	// 추가
	public int insert(MYTestDto dto) {

		Connection con = getConnection();
		String sql = " INSERT INTO MYTEST "
					+ " VALUES(?, ?, ?) ";
		PreparedStatement pstm = null;
		int res = 0;

		try {// 3.
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, dto.getMno());
			pstm.setString(2, dto.getMname());
			pstm.setString(3, dto.getNickname());

			// 4.
			res = pstm.executeUpdate();
			if (res > 0) {
				commit(con);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 5.
			close(pstm);
			close(con);

		}

		return res;
	}

	// 선택 출력
	public MYTestDto selectOne(int mno) {

		Connection con = getConnection();
		String sql = " SELECT MNO, MNAME, NICKNAME " 
				+ " FROM MYTEST " 
				+ " WHERE MNO = ? ";

		PreparedStatement pstm = null;
		MYTestDto dto = new MYTestDto(); // *** 이걸 적으면 리턴에 dto로 넣어줘야한다!!***
		ResultSet rs = null;

		try {
			// 3.
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);

			// 4.
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto.setMno(rs.getInt("MNO"));
				dto.setMname(rs.getString("MNAME"));
				dto.setNickname(rs.getString("NICKNAME"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}

		return dto;
	}

	public MYTestDto selectOne2(int mno) {
		Connection con = getConnection();
		String sql = " SELECT * " 
				+ " FROM MYTEST " 
				+ " WHERE MNO = " + mno;
		Statement stmt = null;
		ResultSet rs = null;
		MYTestDto dto = null; // 이걸 만들었으니 리턴에 dto넣어야한다.

		try {
			// 3.
			stmt = con.createStatement();

			// 4.
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				dto = new MYTestDto(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}

		return dto;
	}

	// 수정
	public int update(MYTestDto dto) {

		Connection con = getConnection();
		String sql = " UPDATE MYTEST " 
				+ " SET MNAME = ?, NICKNAME = ? " 
				+ " WHERE MNO = ? ";
		PreparedStatement pstm = null;
		int res = 0;	// 이거 적었으니 리턴엔 res로 바꿔야한다.
		
		try {
			// 3.
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getMname());
			pstm.setString(2, dto.getNickname());
			pstm.setInt(3, dto.getMno());

			// 4.
			res = pstm.executeUpdate();
			if (res > 0) {
				commit(con);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}

		return res;
	}

	// 삭제
	public int delete(int mno) {

		Connection con = getConnection();
		String sql = " DELETE FROM MYTEST " 
				+ " WHERE MNO = ? ";
		PreparedStatement pstm = null;
		int res = 0;	// 이거 적으면 무ㅡ조건 리턴에 res로 해야한다.
		try {
			// 3.
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);

			// 4.
			res = pstm.executeUpdate();
			if (res > 0) {
				commit(con);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}

		return res;
	}

}
