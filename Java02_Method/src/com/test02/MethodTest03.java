package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 {

	public static void main(String[] args) {
		// 1. static mathod
		MethodTest01.publicMethod();
		// MethodTest01.protectedMethod();
		// MethodTest01.defaultMethod();
		// MethodTest01.privateMethod();

		// 2. non-static method
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();

	}

}
