package com.milan.test;

public class Student 
{


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cwid == null) ? 0 : cwid.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (cwid == null) {
			if (other.cwid != null)
				return false;
		} else if (!cwid.equals(other.cwid))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String name;
	private String cwid;
	
	public Student(String name, String cwid) 
	{
		super();
		this.name = name;
		this.cwid = cwid;
	}
	public String getName() {
		return name;
	}

	public String getCwid() {
		return cwid;
	}




}
