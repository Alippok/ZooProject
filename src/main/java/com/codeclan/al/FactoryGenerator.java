package com.codeclan.al;

public class FactoryGenerator {
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equals("fish")){
			return new FishFactory();
		}
		return null;
	}

}
