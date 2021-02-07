package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		// method 호출 방법
		// 1. static method : class.mothod();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		// MethodTest01.privateMethod(); //not visible //private method는 해당 class 내에서만
		// MethodTest01.abc(); //undefined // abc는 없다

		// 2. non-static method
		// class(참조타입) 변수 = new class();
		// 변수.method();
		MethodTest01 method01 = new MethodTest01();
		// 타입 변수 = 값
		method01.nonStaticMethod();

		// objectaid
		// UML : Unified Modeling Language

	}

}
