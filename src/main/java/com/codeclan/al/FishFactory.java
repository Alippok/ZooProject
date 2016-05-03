package com.codeclan.al;

import com.codeclan.al.BirdClasses.Bird;
import com.codeclan.al.FishClasses.Fish;
import com.codeclan.al.FishClasses.Ray;
import com.codeclan.al.FishClasses.Shark;

public class FishFactory extends AbstractFactory {
	//redundant inherited methods from AbstractFactory class. Set to null
	public Bird getBird(String type){
		return null;
	}
	
	
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
