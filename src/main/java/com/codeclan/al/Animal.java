package com.codeclan.al;

public abstract class Animal {
	protected String type;
	protected String species;
	protected String id;
	protected int health;
	protected int exoticRating;
	protected String exoticStatus;
	protected double marketPrice;
	
	
	
	
	public Animal(){
		health = 100;
		marketPrice = 20.00;
	}
	
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
	
	public int getHealth() {
		int result = health;
		return result;
	}
	
	public boolean setExoticRating(int rating) {
		if(rating<=100 && rating>0){
		    exoticRating = rating;
		    return true;
		} else {
			return false;
		}
	}
	
	public int getExoticRating() {
		int result = exoticRating;
		return result;
	}
	
	public String getExoticStatus(){
		String result = exoticStatus;
		return result;
	}
	
	public double getMarketPrice(){
		double result = marketPrice;
		return result;
	}
	
	public boolean setMarketPrice(double price){
		if(price>0){
		    marketPrice = price;
		    return true;
		} else {
			return false;
		}
	}
	

}
