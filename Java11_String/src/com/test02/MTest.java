package com.test02;

public class MTest {
	
	public static void main(String[] args) {
		//sTest();
		sBufferTest();
	}
	// staring 을 + 연산으로 연결할 때, 내부적으로 StringBuilder로 더해준다. (jdk 1.5)
	public static void sTest() {
		// immutable
		String s = "안녕하세요.";  // 기본 
		System.out.println(s.hashCode()); // hasaCode 도 주소라고 생각하면 된다.
										  // "안녕하세요."의 주소이다 
		s+= "저는 ";
		System.out.println(s.hashCode()); // "안녕하세요. 저는 " 의 주소
		
		s+= "김호수 입니다.";
		// 이전의 s 들은 Garbage Collector   GB에서 수집해감
		System.out.println(s.hashCode()); // "안녕하세요. 저는 김호수입니다." 의 주소
		
		
		System.out.println(s);
		
		
		// 안녕하세요 -> 하이
		System.out.println(s.replace("안녕하세요", "하이!"));
		System.out.println(s);
		
		s = s.replace("안녕하세요", "하이!");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		
	}
	
	public static void sBufferTest() {
		//mutable
		
		StringBuffer sb = new StringBuffer();
		// method chaining
		sb.append("안녕하세요")// 한줄로 해도됨
		  .append(" 저는 ")
		  .append("김호수입니다.");  
		// 해시코드는 그대로인걸 보면 주소는 변하지않았고 값(literal)이 변한것이다.
		
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		
		sb.replace(0, 5, "하이!"); // 객체는 그대로지만 안의 값을 변화시킬수 있음.
		System.out.println(sb);
		
		// 거꾸로 출력
		sb.reverse();
		System.out.println(sb);
		
		
	}
	
}
