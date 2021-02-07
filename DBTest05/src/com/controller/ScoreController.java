package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.ScoreBiz;
import com.biz.ScoreBizImpl;
import com.dto.ScoreDto;

public class ScoreController {

	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		int select = 0;
		
		StringBuffer sb = new StringBuffer();
		sb.append("************\n")
		  .append("*1.전체출력*\n")
		  .append("*2.선택출력*\n")
		  .append("*3.추    가*\n")
		  .append("*4.수    정*\n")
		  .append("*5.삭    제*\n")
		  .append("*6.1등 출력*\n")
		  .append("*7.2등 출력*\n")
		  .append("*8.3등 출력*\n")
		  .append("*9.종    료*\n")
		  .append("************\n")
		  .append("input select : ");
		System.out.println(sb);
		select = sc.nextInt();
		
		return select;
	}

	public static void main(String[] args) {
		int select = 0;
		ScoreBiz biz = new ScoreBizImpl();
		
		do {
			select = getMenu();
			
			switch (select) {
			case 1:
				System.out.println("전체출력");
				List<ScoreDto> selectList = biz.selectList();
				for (ScoreDto dto : selectList) {
					System.out.println(dto);
				}
				System.out.println();
				break;
			case 2:
				System.out.println("선택출력");
				System.out.println("출력할 번호 : ");
				int selectS_no = sc.nextInt();
				ScoreDto selectOne = biz.selectOne(selectS_no);
				System.out.println(selectOne);
				System.out.println();
				break;
			case 3:
				System.out.println("추가");
				System.out.println("추가할 이름 : ");
				String insertName = sc.next();
				System.out.println("국어점수 : ");
				int insertKor = sc.nextInt();
				System.out.println("영어점수 : ");
				int insertEng = sc.nextInt();
				System.out.println("수학점수 : ");
				int insertMath = sc.nextInt();
				ScoreDto insertDto = new ScoreDto(0, insertName, insertKor, insertEng, insertMath);
				int insertRes = biz.insert(insertDto);
				if (insertRes > 0) {
					System.out.println("추가 성공");
				} else {
					System.out.println("추가 실패");
				}
				break;
			case 4:
				System.out.println("수정");
				System.out.println("수정할 번호 : ");
				int updateNo = sc.nextInt();
				System.out.println("수정할 이름 : ");
				String updateName = sc.next();
				System.out.println("국어점수 : ");
				int updateKor = sc.nextInt();
				System.out.println("영어점수 : ");
				int updateEng = sc.nextInt();
				System.out.println("수학점수 : ");
				int updateMath = sc.nextInt();
				ScoreDto updateDto = new ScoreDto(updateNo, updateName, updateKor, updateEng, updateMath);
				int updateRes = biz.update(updateDto);
				if (updateRes > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				break;
			case 5:
				System.out.println("삭제");
				System.out.println("삭제할 번호 : ");
				int deleteNo = sc.nextInt();
				int deleteRes = biz.delete(deleteNo);
				if (deleteRes > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 6:
				// 1등 출력 -> rownum을 사용하자!!
				break;
			case 7:
				// 2등 출력
				break;
			case 8:
				// 3등 출력
				break;
			case 9:
				System.out.println("프로그램 종료...");
				break;
			}
			
		} while (select != 9);
	}
}




















