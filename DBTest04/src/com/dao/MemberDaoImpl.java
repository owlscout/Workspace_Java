package com.dao;

import static com.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.MemberDto;

public class MemberDaoImpl implements MemberDao {

	@Override
	public List<MemberDto> selectList() {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<MemberDto> list = new ArrayList<MemberDto>();
		
		try {
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(SELECT_LIST_SQL);
			while(rs.next()) { // 1 2 3 4 5 6 7 8 로 넣어도 된다.
				MemberDto dto = new MemberDto();
				dto.setM_no(rs.getInt("M_NO"));
				dto.setM_name(rs.getString("M_NAME"));
				dto.setM_age(rs.getInt("M_AGE"));
				dto.setM_gender(rs.getString("M_GENDER"));
				dto.setM_location(rs.getString("M_LOCATION"));
				dto.setM_job(rs.getString("M_LOCATION"));
				dto.setM_tel(rs.getString("M_TEL"));
				dto.setM_email(rs.getString("M_EMAIL"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}
			
		
		return list;
	}

	@Override
	public MemberDto selectone(int m_no) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		PreparedStatement pstm = null;
		MemberDto dto = new MemberDto();
		ResultSet rs = null;
		
		try {
			// 3.
			pstm = con.prepareStatement(SELECT_ONE_SQL);
			pstm.setInt(1, m_no);
			
			// 4.
			rs = pstm.executeQuery();
			while(rs.next()) {// 1 2 3 4 5 6 7 8 로 넣어도 된다.
				dto.setM_no(rs.getInt("M_NO"));
				dto.setM_name(rs.getString("M_NAME"));
				dto.setM_age(rs.getInt("M_AGE"));
				dto.setM_gender(rs.getString("M_GENDER"));
				dto.setM_location(rs.getString("M_LOCATION"));
				dto.setM_job(rs.getString("M_JOB"));
				dto.setM_tel(rs.getString("M_TEL"));
				dto.setM_email(rs.getString("M_EMAIL"));
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

	@Override
	public int insert(MemberDto dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			//3.
			pstm = con.prepareStatement(INSERT_SQL);
			
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());
			
			//4.
			res = pstm.executeUpdate();
			if(res > 0) {
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

	@Override
	public int update(MemberDto dto) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(UPDATE_SQL);
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());
			pstm.setInt(8, dto.getM_no());
			
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

	@Override
	public int delete(int m_no) {
		// TODO Auto-generated method stub
		// 1.
		// 2.
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		try { 
			// 3.
			pstm = con.prepareStatement(DELETE_SQL);
			pstm.setInt(1, m_no);
			
			// 4.
			res = pstm.executeUpdate();
			if(res > 0) {
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
