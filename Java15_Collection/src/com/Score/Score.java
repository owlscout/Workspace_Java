package com.Score;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 기본생성자, 파라미터 4개짜리 생서앚
	
	// getter & setter
	
	// getSum, getAvg, getGrade
	
	// toString override
	
	public Score () {
		
	}
	
	public Score (String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int getSum() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return (double)(kor + eng + math) / 3;
						//(double)(getSum) /3
	}
	
	public String getGrade() {
		
		switch ((int)getAvg() / 10) {
		case 10:
		case 9: 
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		
		}
		return "F";
	}
	
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getSum() + "\t" + String.format("%.2f",getAvg())+ "\t" + getGrade();
				//String.format("이름 : %s\t 국어 : %d\t 영어 : %d\t 수학 : %d \n총점 : %d\t 평균 : %.2f\t 학점 : %s", name, kor, eng, math, getSum(), getAvg(), getGrade());
	}
	
}
