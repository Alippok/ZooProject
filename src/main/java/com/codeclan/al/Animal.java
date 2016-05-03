package com.codeclan.al;

public abstract class Animal {
	protected String type;
	protected String species;
	
	public String getType(){
		return type;
	}
	
	public void setSpecies(String choice){
		species = choice;
	}
	
	public String getSpecies(){
		String result = species;
		return result;
	}

}
