package com.milan.processing;

import java.io.*;

public class Test {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("abc.txt");
			String s = "JAVA IS BEST PROGRAMMING LANGUAGE I COULD EVER LEARN";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
