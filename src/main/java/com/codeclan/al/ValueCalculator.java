package com.codeclan.al;

public class ValueCalculator {
	
	public boolean valueAnimal(Animal animal) throws NullPointerException{
		String exoticStatus = animal.getExoticStatus();
		if(exoticStatus.equals("endangered")){
			animal.setMarketPrice(2500.00);
			return true;
		}
		if(exoticStatus.equals("extremely rare")){
			animal.setMarketPrice(1500.00);
			return true;
		}
		if(exoticStatus.equals("rare")){
			animal.setMarketPrice(1000.00);
			return true;
		}
		if(exoticStatus.equals("uncommon")){
			animal.setMarketPrice(600.00);
			return true;
		}
		if(exoticStatus.equals("common")){
			animal.setMarketPrice(300.00);
			return true;
		}
		
		throw new NullPointerException();
		
		
		
	}

}
