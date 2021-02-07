package com.dto;

//Date Transfer Object : 값 전달 객체
//Value Object     VO = DTO 둘의 거의 같다 엄밀히 말하자면 다르긴하지만
// db table의 row 한개를 저장할 수 있다.
public class MYTestDto {

	private int mno;	//mytest 에 number로 있어서 인트
	private String mname;	// varchar2로 있어서 스트링
	private String nickname;// varchar2로 있어서 스트링
	
	// 기본생성자, 파람3개 생성자
	public MYTestDto() {
		
	}
	
	public MYTestDto(int mno, String mname, String nickname) {
		this.mno = mno;
		this.mname = mname;
		this.nickname = nickname;
	}
	// 겟터 & 셋터

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}