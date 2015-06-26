package com.milan;

public class Person 
{
	private int height;
	private int weight;
	private char gender;
	private String name;
	private String city;
	

	public Person(String name2, int height2, int weight2, char gender2) 
	{
		this.height = height2;
		this.weight = weight2;
		this.gender = gender2;
		this.name = name;
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(this.weight>0 && this.weight<500){
			this.weight = weight;
			
		}
	
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
