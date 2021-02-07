package com.test05;

public class Mtest {

	public static void main(String[] args) {
		
		//Scholl class에 만들어 놓은 1번 2번 3번 메소드를 호출하여 console에 출력하자
		
		School.namePrn("김호수");
		int age = School.getAge();
		System.out.println(age + "세");
		School kh = new School();
		kh.addrPrn("광주시");
		
	}

}
