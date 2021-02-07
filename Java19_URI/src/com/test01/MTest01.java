package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {

	public static void main(String[] args) throws URISyntaxException {
		
			URI u = new URI("http://localhost:8787/Java19_URI_Web/res.jsp?name=%EA%B9%80%ED%98%B8%EC%88%98&addr=%EA%B2%BD%EA%B8%B0+%EA%B4%91%EC%A3%BC"); 
		
			System.out.println(u.getScheme());
			System.out.println(u.getHost());
			System.out.println(u.getPort());
			System.out.println(u.getPath());
			System.out.println(u.getQuery());
			
	}
}
