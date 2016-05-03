package com.codeclan.al.Creators;

public class FactoryGenerator {
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equals("fish")){
			return new FishFactory();
		}
		if(choice.equals("bird")){
			return new BirdFactory();
		}
		if(choice.equals("reptile")){
			return new ReptileFactory();
		}
		return null;
	}

}
