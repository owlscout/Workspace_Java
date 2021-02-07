package com.vehicle;

public class Car {
	
	private String color;
	private int speed;
	// 필드로 잡아두고 겟터 셋터 사용할때
	// 자동으로 return null 또는 return 0 으로 잡아줌
	public Car() {
		
	}
	
	public Car(String color) {
		
	}
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accelPedal() {
		
		System.out.println("속도가 10 올라갑니다.");
		speed +=10;
	}
	
	public void breakPedal() {
		
		speed -= 10;
		if(speed > 0) {
			System.out.println("속도가 10 줄어듭니다.");
		}else {
			System.out.println("멈췄습니다.");
			speed = 0;
		}
	}
	
	public String toString() {
		return "현재속도는 " + speed + " 입니다."; 
	}
	
	
}
