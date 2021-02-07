package com.generic;

// generic : 개발자가 의도한 타입만 저장할 수 있도록 함. (타입 강제)
public class Emp<T> { // Emp<T> 의 <T>가 generic

	private T empno;   // <String> 이라고적으면 T가 스트링으로 되서 스트링만나온다 스트링이 아닌것은 오류로 뜬다.
	private String ename;
	
	public Emp() {
		
	}
	
	public Emp(T empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public T getEmpno() {
		return empno;
	}

	public void setEmpno(T empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	
	
	
}
