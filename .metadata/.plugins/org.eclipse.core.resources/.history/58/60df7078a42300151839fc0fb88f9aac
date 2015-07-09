package com.milan.test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

public class ExceptionTest {


	public static void main(String[] args)  
	{
		
		int []arr = {500,10};
		ExceptionTest obj = new ExceptionTest();
		try {
			obj.addNumbers(arr[0],arr[1]);
		} catch (RangeException e) {
			  System.out.println("A LESS THAN 100");
		}

	   System.out.println("HELLO WORLD");
		System.out.println("ADDITION OF TWO NUMBERS");
		
		
	}

	private int addNumbers(int a , int b) throws RangeException
	{
		
		if(a<100)
			throw new RangeException("range is less than 100");

		
		
		return a+b;
	}

}
