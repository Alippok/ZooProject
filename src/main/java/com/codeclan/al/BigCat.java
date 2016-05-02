package com.codeclan.al;

public abstract class BigCat {
	protected String type;
	protected String species;
	protected String id;
	
	public BigCat(){
		type = "BigCat";
	}
	
	public String getType(){
		return type;
	}
	
	public String getSpecies(){
		return species;
	}
	
	public void setId (int number) {
		id = this.type + "_" + number;
	}
	
	public String getId() {
		return id;
	}
		

}
