package com.biz;

import java.util.List;

import com.dao.MemberDao;
import com.dao.MemberDaoImpl;
import com.dto.MemberDto;

public class MemberBizImpl implements MemberBiz {

	private MemberDao dao = new MemberDaoImpl();

	@Override
	public List<MemberDto> selectList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	@Override
	public MemberDto selectOne(int m_no) {
		// TODO Auto-generated method stub
		return dao.selectone(m_no);
	}

	@Override
	public int insert(MemberDto dto) { //V <-> C <-> B <-> D <-> db
		// M_GENDER에 들어있는 값을 대문자로 바꾸자. 이걸 service(서비스)라고 쓴다 
		//dto.setM_gender(dto.getM_gender().toUpperCase()); // 이 한줄이 밑에 두줄과 같은것다
		String upperGender = dto.getM_gender().toUpperCase();
		dto.setM_gender(upperGender);
		
		return dao.insert(dto);
	}

	@Override
	public int update(MemberDto dto) {
		// TODO Auto-generated method stub
		dto.setM_gender(dto.getM_gender().toUpperCase());
		return dao.update(dto);
	}

	@Override
	public int delete(int m_no) {
		// TODO Auto-generated method stub
		return dao.delete(m_no);
	}

}
