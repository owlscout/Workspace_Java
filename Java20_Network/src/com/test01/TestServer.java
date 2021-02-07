package com.test01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestServer {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(8888);
		System.out.println("서버입니다.");
		
		byte[] buff = new byte[1024];
		
		DatagramPacket revceiveP = new DatagramPacket(buff, buff.length);
		
		ds.receive(revceiveP);
		
		System.out.println(new String(revceiveP.getData()));
		
		ds.close();
		ds.disconnect();
		
	}
}
