package com.test05;

public class SamsongTV implements TV {
	
	public SamsongTV() {
		System.out.println("samsong tv 구매");
	}
	
	private int volume;

	@Override
	public int VolumeUp() {
		volume += 3;
		return volume;
	}

	@Override
	public int VolumeDown() {
		volume -= 3;
		if(volume < 0) {
			volume = 0;
		}
		return volume;
	}

}
