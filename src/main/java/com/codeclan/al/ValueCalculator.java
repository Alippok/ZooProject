package com.codeclan.al;

public class ValueCalculator {
	
	public void valueAnimal(Animal animal){
		String exoticStatus = animal.getExoticStatus();
		if(exoticStatus == "endangered"){
			animal.setMarketPrice(2500.00);
		}
	}

}
