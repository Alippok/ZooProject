package com.codeclan.al;

public abstract class Animal {
	protected String type;
	protected String species;
	protected String id;
	protected int exoticRating;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		String result = type;
		return result;
	}
		
	public void setSpecies(String choice){ 
		species = choice;
	}
	
	public String getSpecies() {
		String result = species;
		return result;
	}
	
	public void setId(int number) {
		id = type + "_" + number;
	}
	
	public String getId() {
		String result = id;
		return result;
	}
	
	public boolean setExoticRating(int rating){
		exoticRating = rating;
		return true;
	
	}

}
