package com.hotelmgmt.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest 
{


	public static void main(String s []) 
	{

		Map studentsMap = new HashMap();

		//key ---> cwid
		//value ---> studnet name;


		String cwid1 = "IU500120";
		String studentName1 = "Tom Brady";

		String cwid2 = "IU500121";
		String studentName2 = "Tom Montis";


		String cwid3= "IU500122";
		String studentName3 = "Tom Montis";

		studentsMap.put(cwid1, studentName1);
		studentsMap.put(cwid2, studentName2);
		studentsMap.put(cwid3, studentName3);
		studentsMap.put(cwid3, "srini");
		
		
		Set<String> keys = studentsMap.keySet();
		
		for(String key : keys)
		{
			
			System.out.println("Key "+key );
			System.out.print(" Value "+studentsMap.get(key) );
			
		}
		
		
	


	}









}
