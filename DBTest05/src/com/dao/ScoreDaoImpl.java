package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.common.JDBCTemplate;
import com.dto.ScoreDto;

public class ScoreDaoImpl extends JDBCTemplate implements ScoreDao {

	@Override
	public List<ScoreDto> selectList() {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<ScoreDto> list = new ArrayList<ScoreDto>();
		
		try {
			// 3.
			pstm = con.prepareStatement(SELECT_LIST_SQL);
			
			// 4.
			rs = pstm.executeQuery();
			while (rs.next()) {
				ScoreDto dto = new ScoreDto(rs.getInt(1), 
											rs.getString(2), 
											rs.getInt(3), 
											rs.getInt(4), 
											rs.getInt(5), 
											rs.getInt(6), 
											rs.getDouble(7), 
											rs.getString(8));
				
				list.add(dto);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
		return list;
	}

	@Override
	public ScoreDto selectOne(int s_no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ScoreDto dto = null;
		
		try {
			// 3.
			pstm = con.prepareStatement(SELECT_ONE_SQL);
			pstm.setInt(1, s_no);
			
			// 4.
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto = new ScoreDto();
				dto.setS_no(rs.getInt("S_NO"));
				dto.setS_name(rs.getString("S_NAME"));
				dto.setS_kor(rs.getInt("S_KOR"));
				dto.setS_eng(rs.getInt("S_ENG"));
				dto.setS_math(rs.getInt("S_MATH"));
				dto.setS_sum(rs.getInt("S_SUM"));
				dto.setS_avg(rs.getDouble("S_AVG"));
				dto.setS_grade(rs.getString("S_GRADE"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
		return dto;
	}

	@Override
	public int insert(ScoreDto score) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			// 3.
			pstm = con.prepareStatement(INSERT_SQL);
			pstm.setString(1, score.getS_name());
			pstm.setInt(2, score.getS_kor());
			pstm.setInt(3, score.getS_eng());
			pstm.setInt(4, score.getS_math());
			pstm.setInt(5, score.getS_sum());
			pstm.setDouble(6, score.getS_avg());
			pstm.setString(7, score.getS_grade());
			
			// 4.
			res = pstm.executeUpdate();
			if (res > 0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int update(ScoreDto score) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			// 3.
			pstm = con.prepareStatement(UPDATE_SQL);
			pstm.setString(1, score.getS_name());
			pstm.setInt(2, score.getS_kor());
			pstm.setInt(3, score.getS_eng());
			pstm.setInt(4, score.getS_math());
			pstm.setInt(5, score.getS_sum());
			pstm.setDouble(6, score.getS_avg());
			pstm.setString(7, score.getS_grade());
			pstm.setInt(8, score.getS_no());
			
			// 4.
			res = pstm.executeUpdate();
			if (res > 0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int delete(int s_no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			// 3.
			pstm = con.prepareStatement(DELETE_SQL);
			pstm.setInt(1, s_no);
			
			// 4.
			res = pstm.executeUpdate();
			if (res > 0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
}











