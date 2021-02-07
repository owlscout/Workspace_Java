package com.test01;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();

		// mac :
		// String[] path = {"/user/bin//open", "-a", "/Applications/ fileNam.app"}
		// Process prc = rt.exec(path);

		try {
			Process prc = rt.exec("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
