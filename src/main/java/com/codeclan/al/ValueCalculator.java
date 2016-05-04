package com.codeclan.al;

public class ValueCalculator {
	
	public boolean valueAnimal(Animal animal){
		String exoticStatus = animal.getExoticStatus();
		if(exoticStatus.equals("endangered")){
			animal.setMarketPrice(2500.00);
			return true;
		}
		if(exoticStatus.equals("extremely rare")){
			animal.setMarketPrice(1500.00);
			return true;
		}
		return false;
	}

}
