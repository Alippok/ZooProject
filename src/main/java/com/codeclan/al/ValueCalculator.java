package com.codeclan.al;

public class ValueCalculator {
	
	public void valueAnimal(Animal animal){
		String exoticStatus = animal.getExoticStatus();
		if(exoticStatus.equals("endangered")){
			animal.setMarketPrice(2500.00);
		}
		if(exoticStatus.equals("extremely rare")){
			animal.setMarketPrice(1500.00);
		}
	}

}
