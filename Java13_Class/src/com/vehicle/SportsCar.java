package com.vehicle;

public class SportsCar extends Car {

	public SportsCar() {
		System.out.println("sportscar 생성");
	}
	
	public SportsCar(String color) {
		super(color);
		System.out.println(color + " sportscar 생성");
	}
	
	@Override
	public void accelPedal() {
		System.out.println("속도가 20 올라갑니다.");
		// speed = speed + 20;
		setSpeed(getSpeed() + 20);
		
	}
	
	public void breakPedal() {
		setSpeed(getSpeed() - 20);
		if (getSpeed() > 0 ) {
			System.out.println("속도가 20 줄어듭니다.");
		}else {
			System.out.println("멈췄습니다.");
			setSpeed(0);
		}
	}
	
}
