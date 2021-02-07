package com.test05;

public class MTest {

	public static void main(String[] args) {
		TV ig = new IgTV();						// ig tv 구매
		System.out.println(ig.VolumeUp());  	// 1
		System.out.println(ig.VolumeUp()); 		// 2
		System.out.println(ig.VolumeUp()); 		// 3
		System.out.println(ig.VolumeUp());  	// 4
		
		
		System.out.println(ig.VolumeDown());	// 3
		System.out.println(ig.VolumeDown());	// 2
		System.out.println(ig.VolumeDown()); 	// 1
		System.out.println(ig.VolumeDown());	// 0
		
		TV samsong = new SamsongTV();				// samsong tv 구매
		System.out.println(samsong.VolumeUp());		// 3
		System.out.println(samsong.VolumeUp());		// 6
		System.out.println(samsong.VolumeDown());	// 3
		System.out.println(samsong.VolumeDown());	// 0
	}
}
