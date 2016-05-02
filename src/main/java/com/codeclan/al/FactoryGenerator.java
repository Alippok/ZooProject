package com.codeclan.al;

public class FactoryGenerator {
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equals("fish")){
			return new FishFactory();
		}
		if(choice.equals("bird")){
			return new BirdFactory();
		}
		return null;
	}

}
