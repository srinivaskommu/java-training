package com.hotelmgmt.domain.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.util.logging.FileHandler;

import javax.annotation.processing.FilerException;

import com.hotelmgmt.domain.MarksRangeException;

public class TestMarksRangeException {

	public static void main(String[] args) throws FileNotFoundException, MarksRangeException {
		System.out.println("Enter the subject marks");
		Scanner scanner = new Scanner(System.in);
		
		String subjectMarks = scanner.next();
		Integer intSubMarks = 0;
		
		
		
		try{
			intSubMarks = Integer.parseInt(subjectMarks);
		
		} catch(NumberFormatException e){
			
			System.out.println("Please enter Numeric Value");
			subjectMarks = scanner.next();
			
			intSubMarks = Integer.parseInt(subjectMarks);
		}
		 
		if(intSubMarks<0 || intSubMarks > 100)
			throw new MarksRangeException("Please enter marks with in 0 to 100");
			
		
		
		
		System.out.println("Subject Marks Entered : "+ intSubMarks);
		
		

	}
	
	
	
	
	
	
	

}
