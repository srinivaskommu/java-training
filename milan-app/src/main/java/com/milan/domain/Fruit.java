package com.milan.domain;

public class Fruit {

	private int grams;
	private int cals_per_gram;

	public Fruit(int inputGrams, int inputCals_per_gram) 
	{
		grams = inputGrams;
		cals_per_gram = inputCals_per_gram;
	}

	int total_calories() 
	{
		return (grams * cals_per_gram);
	}

}
