package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MYTestBiz;
import com.dto.MYTestDto;

public class MYController {

	private static Scanner sc = new Scanner(System.in);
	
	// view  , syso 인애들도 다 view이다.
	public static int getMenu() {
		StringBuffer sb = new StringBuffer();
		sb.append("1. 전체출력\n")
		  .append("2. 선택출력\n")
		  .append("3. 추   가\n")
		  .append("4. 수   정\n")
		  .append("5. 삭   제\n")
		  .append("6. 종   료\n")
		  .append("input select : ");
		System.out.println(sb);
		int select = sc.nextInt();
		  	
		return select;
	}
	public static void main(String[] args) {
		
		int select = 0;
		MYTestBiz biz = new MYTestBiz();
		
		do {
			select = getMenu();
			
			switch(select) {
			case 1:
				// 전체출력
				List<MYTestDto> list = biz.selecList();
				
				for (MYTestDto dto : list){
					System.out.printf("%3d %10s %10s\n", dto.getMno(), dto.getMname(), dto.getNickname());
				}
				break;
			case 2:
				// 선택출력
				System.out.println("출력할 번호 : ");
				int selectOneNo = sc.nextInt();
				MYTestDto selectOneDto = biz.selectOne(selectOneNo);
				
				System.out.printf("%3d %10s %10s\n", selectOneDto.getMno(), selectOneDto.getMname(), selectOneDto.getNickname());
				
				break;
			case 3:
				// 추가
				System.out.println("추가할 번호 : ");
				int insertNo = sc.nextInt();
				System.out.println("추가할 이름 : ");
				String insertName = sc.next();
				System.out.println("추가할 별명 : ");
				String insertNickname = sc.next();
				
				MYTestDto insertDto = new MYTestDto();
				insertDto.setMno(insertNo);
				insertDto.setMname(insertName);
				insertDto.setNickname(insertNickname);
				
				int insertRes = biz.insert(insertDto);
				if (insertRes > 0) {
					System.out.println("추가 성공");
				} else {
					System.out.println("추가 실패");
				}
				
				break;
			case 4:
				// 수정
				System.out.println("수정할 번호 : ");
				int updateNo = sc.nextInt();
				System.out.println("수정할 이름 : ");
				String updateName = sc.next();
				System.out.println("수정할 별명 : ");
				String updateNickname = sc.next();
				
				MYTestDto updateDto = new MYTestDto(updateNo, updateName, updateNickname);
				/*updateDto.setMno(updateNo);		위에 괄호에 넣는거나 그걸 지우고 이렇게 넣는거나
				updateDto.setMname(updateName);		같은 방식이다.
				updateDto.setNickname(updateNickname);*/
				
				int updateRes = biz.update(updateDto);
				if (updateRes > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				
				break;
			case 5:
				// 삭제
				System.out.println("삭제할 번호 : ");
				int deleteNo = sc.nextInt();
				
				/*MYTestDto delete = new MYTestDto(); 값 1개 니까 그냥 숫자로 보내도되니 안적어도 된다.
				delete.setMno(deleteNo); */ 
				
				int deleteRes = biz.delete(deleteNo); // 논스태틱 메소드 호출하는것이다.
				if (deleteRes > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
				
			case 6:
				System.out.println("프로그램이 종료되었습니다...");
			}
		}while (select != 6);
		
	}
	
}
