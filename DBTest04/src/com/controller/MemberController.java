package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MemberBiz;
import com.biz.MemberBizImpl;
import com.dto.MemberDto;

public class MemberController {

	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		int select = 0;
		
		StringBuffer sb = new StringBuffer();
		sb.append("*********\n")
			.append("*1.전체출력*\n")
			.append("*2.선택출력*\n")
			.append("*3.추  가*\n")
			.append("*4.수  정*\n")
			.append("*5.삭  제*\n")
			.append("*6.종  료*\n")
			.append("input select : ");
		System.out.println(sb);
		select = sc.nextInt();
		
		return select;
	}
	
	public static void main(String[] args) {
		
		int select = 0;
		MemberBiz biz = new MemberBizImpl();
		
		while(select !=6) {
			select = getMenu();
			
			switch (select) {
			case 1:
				// 전체 출력
				List<MemberDto> selectList = biz.selectList();
					for (MemberDto dto : selectList) {
						//System.out.printf("%3d %10s %3d %10s %20s %20s %20s %30s",dto.getM_no(), dto.getM_name(), dto.getM_age(), dto.getM_gender(), dto.getM_location(), dto.getM_job(), dto.getM_tel(), dto.getM_email());
						System.out.println(dto);
					}
				break;
			case 2: // m_no -> Controller -> Biz -> Dao -> db
				System.out.println("출력할 번호 : ");
				int selectOneNO = sc.nextInt();
				MemberDto selectOneDto = biz.selectOne(selectOneNO);
				//System.out.printf("%3d %10s %3d %10s %20s %20s %20s %30s", selectOneDto.getM_no(), selectOneDto.getM_name(), selectOneDto.getM_age(), selectOneDto.getM_gender(), selectOneDto.getM_location(), selectOneDto.getM_job(), selectOneDto.getM_tel(), selectOneDto.getM_email());
				// dto 했기에 이렇게 안하고 System.out.println(selectOneDto) 하는게 낫다.
				System.out.println(selectOneDto);
				break;
			case 3: // member.sql에서 M_NO 는 자동으로 들어가게끔 적어놨기에 안적어도 된다.
				
				System.out.println("추가할 이름 : ");
				String insertM_NAME = sc.next();
				System.out.println("추가할 나이 : ");
				int insertM_AGE = sc.nextInt();
				System.out.println("추가할 성별 (M or F) : ");
				String insertM_GENDER = sc.next();
				System.out.println("추가할 지역 : ");
				String insertM_LOCATION = sc.next();
				System.out.println("추가할 직업 : ");
				String insertM_JOB = sc.next();
				System.out.println("추가할 전화번호 : ");
				String insertM_TEL = sc.next();
				System.out.println("추가할 이메일 : ");
				String insertM_EMAIL = sc.next();
				
				MemberDto insertDto = new MemberDto(0, insertM_NAME, insertM_AGE, insertM_GENDER, insertM_LOCATION, insertM_JOB, insertM_TEL, insertM_EMAIL);// 괄호안에해도된다. M_NO는 안썼으니 0으로 넣는다.
				//new MemberDto(0, insertM_NAME, insertM_AGE, insertM_GENDER, insertM_LOCATION, insertM_JOB, insertM_TEL, insertM_EMAIL);
				/*
				insertDto.setM_name(insertM_NAME);
				insertDto.setM_age(insertM_AGE);
				insertDto.setM_gender(insertM_GENDER);
				insertDto.setM_location(insertM_LOCATION);
				insertDto.setM_job(insertM_JOB);
				insertDto.setM_tel(insertM_TEL);
				insertDto.setM_email(insertM_EMAIL);
				*/
				int insertRes = biz.insert(insertDto);
				if (insertRes > 0 ) {
					System.out.println("추가 성공");
				} else {
					System.out.println("추가 실패");
				}
				
				break;
			case 4:
				System.out.println("수정할 번호 : ");
				int updateM_NO = sc.nextInt();
				System.out.println("수정할 이름 : ");
				String updateM_NAME = sc.next();
				System.out.println("수정할 나이 : ");
				int updateM_AGE = sc.nextInt();
				System.out.println("수정할 성별 (M or F) : ");
				String updateM_GENDER = sc.next();
				System.out.println("수정할 지역 : ");
				String updateM_LOCATION = sc.next();
				System.out.println("수정할 직업 : ");
				String updateM_JOB = sc.next();
				System.out.println("수정할 전화번호 : ");
				String updateM_TEL = sc.next();
				System.out.println("수정할 이메일 : ");
				String updateM_EMAIL = sc.next();
				
				MemberDto updateDto = new MemberDto(updateM_NO, updateM_NAME, updateM_AGE, updateM_GENDER, updateM_LOCATION, updateM_JOB, updateM_TEL, updateM_EMAIL);
				int updateRes = biz.update(updateDto);
				if(updateRes > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				
				break;
			case 5:
				System.out.println("삭제할 번호 : ");
				int deleteNO = sc.nextInt();
				
				int deleteRes = biz.delete(deleteNO);
				if(deleteRes > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				
				break;
			case 6:
				System.out.println("프로그램이 종료되었습니다...");
				break;
			
			}
		}
		System.out.println("프로그램이 종료되었습니다...");
	}
}
