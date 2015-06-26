package com.milan;

public class UnderGradMarksProcessor implements MarksProcessor {



	public String evaluateMarks(int marks)
	{
		
		if (marks>60)
			return "PASS";

		return "FAIL";
	}

}
