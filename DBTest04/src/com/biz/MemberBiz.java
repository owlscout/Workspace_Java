package com.biz;

import java.util.List;

import com.dto.MemberDto;


public interface MemberBiz {

	public List<MemberDto> selectList();
	
	public MemberDto selectOne(int m_no);
	
	public int insert(MemberDto dto);	// dto에 값을 저장하고 인서트한 갯수 결과가 인트할꺼야
	
	public int update(MemberDto dto);
	
	public int delete(int m_no);
	

	
}
