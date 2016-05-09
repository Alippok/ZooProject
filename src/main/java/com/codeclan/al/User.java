package com.codeclan.al;

public class User {

	protected String buildAnimalDetails(String animalId, String type, String species, String exoticStatus, double marketPrice){
		String result = "Details{Id: " + animalId + ", Type: " + type + ", Species: " + species + ", Exotic Status: " + exoticStatus + ", Market Price: " + marketPrice;
		return result;
	}
	
	public String getAnimalDetails(Animal animal){
		String animalId = animal.getId();
		String type = animal.getType();
		String species = animal.getSpecies();
		String exoticStatus = animal.getExoticStatus();
		double marketPrice = animal.getMarketPrice();
		
        String result = buildAnimalDetails( animalId, type, species, exoticStatus, marketPrice );
        return result;				
	}
}
