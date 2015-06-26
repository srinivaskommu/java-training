package com.milan;

public abstract class GradMarksProcessor implements MarksProcessor {

	public abstract void publishResults();


	public String evaluateMarks(int marks) {
	
		if (marks>60)
			return "PASS";

		return "FAIL";
	}

}
