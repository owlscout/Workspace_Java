package com.test04;

public class Eagle extends Animal implements Bird {

	@Override
	public void fly() {
		System.out.println("파닥파닥");

	}

	@Override
	public void bark() {
		System.out.println("독수리가 어떻게 울지?");
	}

}
