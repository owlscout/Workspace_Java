package com.j05;

public class MTest {

	public static void main(String[] args) {
		
		// beaver eagle 객체를 만들어서
		// 비버의 울음소리 : ??
		// 독수리의 울음소리 : ??
		Animal beaver = new Beaver("비버", 1);
		beaver.bark("아-악!");
		
		Animal eagle = new Eagle("이글", 1);
		eagle.bark("빼에에에에엑");
		
	}
	
}
