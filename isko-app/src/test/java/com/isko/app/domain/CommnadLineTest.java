package com.isko.app.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.isko.app.exceptions.IskoNotSupportedFileExtn;

public class CommnadLineTest {

	public static void main(String[] args) {

		try {
			System.out.println("HELLO WORLD " + args[1]);

			try {
				lookForAFile(args[1]);
			} catch (IskoNotSupportedFileExtn e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out
					.println("YOU ARE ACCESSING ELEMENT WHICH IS NOT IN ARRAY RANGE"
							+ e.getMessage());

		} finally {
			System.out.println(" YOU CAN ADD MORE ELEMENTS TO ARRAY");

		}

		System.out.println("JAVA HAS MANY JOBS");
		System.out.println("LARGE COMMUNITY");

	}

	private static void lookForAFile(String fileName) throws IskoNotSupportedFileExtn
	{
		if(fileName.contains(".exe"))
			 throw new IskoNotSupportedFileExtn("not supported exe files");
		

		try {
			FileInputStream is = new FileInputStream(new File(fileName));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
