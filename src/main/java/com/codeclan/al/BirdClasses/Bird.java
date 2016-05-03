package com.codeclan.al.BirdClasses;

public abstract class Bird {
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
