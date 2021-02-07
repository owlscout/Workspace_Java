package com.singleton;

public class MTest {

	public static void main(String[] args) {
		
		//Singleton singleton = new Singleton(); //private 의 싱글톤을 불러서 안되는것
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
	}
}
