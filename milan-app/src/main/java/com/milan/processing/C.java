package com.milan.processing;

import java.io.*;

class C {
	public static void main(String args[]) throws Exception {
		FileInputStream fin = new FileInputStream("/Users/srinivas_kommu/C.java");
		FileOutputStream fout = new FileOutputStream("M.java");
		int i = 0;
		while ((i = fin.read()) != -1) {
			fout.write((byte) i);
		}
		fin.close();
	}
}