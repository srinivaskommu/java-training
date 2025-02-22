package com.isko.app.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectoryService {

	Map<String, List<String>> phoneDirectory;

	public Map<String, List<String>> getPhoneDirectory() {
		return phoneDirectory;
	}

	public PhoneDirectoryService() 
	{ 
		phoneDirectory = new HashMap<String, List<String>>();
		
		loadPreviuosValuesFromAFile(phoneDirectory);
	}

	public void  loadPreviuosValuesFromAFile(Map<String, List<String>> phoneDirectory) 
	{
		
		
		///read conent from file and load into map
		
	}

	public static void main(String[] args) 
	{
	
		
		PhoneDirectoryService directoty = new PhoneDirectoryService();

		Scanner sc = new Scanner(System.in);

		String stat = "Y";

		do {

			directoty.readValues(directoty.getPhoneDirectory());

			System.out
					.println("Do you want to continue enter more customers (eithr Y/N)");

			stat = sc.nextLine();

		} while (stat.equalsIgnoreCase("y") && !stat.equalsIgnoreCase("n"));

		System.out.println("Phon Directory");

		for (String name : directoty.getPhoneDirectory().keySet()) {
			System.out.println(" NAME " + name);

			for (String phoneNumber : directoty.getPhoneDirectory().get(name)) {
				System.out.println(" phoneNumber " + phoneNumber);

			}

		}

		directoty.writeValues(directoty.getPhoneDirectory());

	}

	public void writeValues(Map<String, List<String>> directoty) {

		File outFile = new File("phoneDirectory.txt");
		System.out.println(outFile.exists());
		System.out.println(outFile.getAbsolutePath());

		try {
			FileOutputStream fo = new FileOutputStream(outFile);

			for (String name : directoty.keySet()) {

				fo.write(name.getBytes());
				fo.write(System.getProperty("line.separator").getBytes());

				for (String phoneNumber : directoty.get(name)) {
					fo.write(phoneNumber.getBytes());
					fo.write(System.getProperty("line.separator").getBytes());

				}

			}

		} catch (FileNotFoundException e) {
			System.err.println("phoneDirectory.txt FILE MISSING ");

		} catch (IOException e) {
			System.err.println("phoneDirectory.txt FILE BUSY ");
		}

	}

	public void readValues(Map<String, List<String>> phoneDirectory) {

		Scanner sc = new Scanner(System.in);

		String name;

		String phoneNumber;

		List<String> phoneNumberlist = new ArrayList<String>();

		System.out.println("Enter Customer Name");

		name = sc.next();
		String stat;

		do {
			System.out.println("Enter Customer Phone  Number");

			phoneNumber = sc.next();

			phoneNumberlist.add(phoneNumber);

			System.out
					.println("Do you want to continue enter phone numbers for "
							+ name + "(eithr Y/N)");

			stat = sc.next();

		} while (stat.equalsIgnoreCase("y") && !stat.equalsIgnoreCase("n"));

		phoneDirectory.put(name, phoneNumberlist);

	}

}
