package com.codeclan.al;

public class FishFactory extends AbstractFactory {
	
	public Fish getFish(String type){
		if(type.equals("shark")){
			return new Shark();
		}
		if(type.equals("ray")){
			return new Ray();
		}
		return null;
	}

}
