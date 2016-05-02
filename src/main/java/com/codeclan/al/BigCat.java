package com.codeclan.al;

public abstract class BigCat {
	protected String type;
	protected String species;
	protected String id;
	
	public BigCat(){
		type = "Big Cat";
	}
	
	public String getType(){
		return type;
	}
	
	public String getSpecies(){
		return species;
	}
	
	public void setId (int number) {
		id = this.type + number;
	}
	
	public String getId() {
		return id;
	}
		

}
