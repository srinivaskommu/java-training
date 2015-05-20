package com.test;

import java.util.Scanner;

public class TestDisplay {

	public static void main(String[] args) {
	System.out.println("Sample Program");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter User Name");
	
	
	String name = sc.nextLine();
	
	System.out.println(" Welcome ..to sample app " + name);
	
	System.out.println("************************End***************");
	}

}
