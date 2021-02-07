package com.test01;

public class MTest {

	public static void main(String[] args) {

		// Animal animal = new Animal(); // Animal에 바디가 없어서 안됨
		Animal cat = new Cat();
		Animal dog = new Dog();

		cat.bark();
		dog.bark();

		cat.eat("생선");
		dog.eat("뼈다귀");

	}

}
