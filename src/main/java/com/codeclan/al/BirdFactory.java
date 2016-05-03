package com.codeclan.al;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.BirdClasses.Eagle;
import com.codeclan.al.FishClasses.Fish;

public class BirdFactory extends AbstractFactory {
	//redundant inherited methods from AbstractFactory class. Set to null
	public Fish getFish(String type) {
		return null;
	}
	
	public Bird getBird(String type) {
		if(type.equals("eagle")){
			return new Eagle();
		}
		return null;
	}
	
	

}
